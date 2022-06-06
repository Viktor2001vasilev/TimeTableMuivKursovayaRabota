package bdd.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.restassured.RestAssured.*;

public class ApiFunctions {

    public static void setApiBaseURI(String uri) {
        RestAssured.baseURI = uri;
        RestAssured.requestSpecification = new RequestSpecBuilder().log(LogDetail.ALL).setAccept("*/*").setContentType("application/json").build();
    }

    public static String jsonResponseGetString(Response response, String key) {
        String jsonResponse = response.asString();
        JsonPath jsonPath = new JsonPath(jsonResponse);
        return jsonPath.getString(key);
    }

    public static String jsonResponseGetString(String response, String key) {
        JsonPath jsonPath = new JsonPath(response);
        return jsonPath.getString(key);
    }

    public static Response executeGetQuery() {
        return given().basePath("groups").get().then().statusCode(200).extract().response();
    }

    public static Response executePostQuery(String body) {
        return given().basePath("scheduler").body(body).when().post().then().statusCode(200).extract().response();
    }

    private static Map<String, Integer> groups = new HashMap<>();
    private static void setGroupsMap() {
        groups.put("о.ЭЗДт 32.2/Б-20", 0);
        groups.put("о.ИЗДт 30.2/Б1-20", 1);
        groups.put("л.ЭЗДт 32.1/Б1-20", 2);
        groups.put("л.ЮВДтс 22.1/Б2-20", 3);
        groups.put("з.ЮЗДт 82.3/М2-20", 4);
        groups.put("РЮД 13.1-21", 5);
        groups.put("РЭД 21.1-21", 6);
        groups.put("РЭД 20.1-21", 7);
        groups.put("о.УЗДт 21.2/Б6-20", 8);
        groups.put("о.УЗДт 21.2/Б7-20", 9);
    }

    public static void createGroupsTimeTableList(String groupsName) {
        // получаем айди группы, потом расписание этой группы на неделю
        setGroupsMap();
        setApiBaseURI("https://api.muiv-timetable.cf/api/");
        Response groupData = executeGetQuery();
        String groupId = jsonResponseGetString(groupData, "groups[" + groups.get(groupsName) + "].group_id");
        System.out.println("Идентификатор группы " + jsonResponseGetString(groupData, "groups[" + groups.get(groupsName) + "].group_name") + " = " + groupId);
        Response groupTimeTable = executePostQuery("{ \"token\":null,\"group_id\":" + groupId + "}");

        // считаем количество дней в расписании
        Pattern pattern = Pattern.compile("dayOfTheWeek");
        Matcher matcher = pattern.matcher(groupTimeTable.asString());
        int countOfDays = 0;
        while(matcher.find()) {
            countOfDays++;
        }
        System.out.println("Количество учебных дней = " + countOfDays);

        // считаем количество предметов в каждом дне
        ArrayList<Integer> areaCountList = new ArrayList<>(); //список (индекс - день недели, значение - количество предметов в дне, длина - количество учебных дней в неделе)
        for (int count = 0; count < countOfDays; count++) {
            pattern = Pattern.compile("area");
            matcher = pattern.matcher(jsonResponseGetString(groupTimeTable, "timetables[" + count + "].schedulers"));
            int countOfAreas = 0;
            while (matcher.find()) {
                countOfAreas++;
            }
            areaCountList.add(countOfAreas);
        }
        for (int i = 0; i < areaCountList.size(); i++) {
            System.out.println((i+1) + " день - " + areaCountList.get(i) + " предметов");
        }

        // находим названия всех дней недели и предметов с их временем
        ArrayList<String> apiTimeTable = new ArrayList<>(); // список по порядку - день недели + каждый предмет в этот день и время его начала
        for (int a = 0; a < areaCountList.size(); a++) {
            apiTimeTable.add(jsonResponseGetString(groupTimeTable, "timetables[" + a + "].dayOfTheWeek"));
            for (int b = 0; b < areaCountList.get(a); b++) {
                apiTimeTable.add(jsonResponseGetString(groupTimeTable, "timetables[" + a + "].schedulers[" + b + "].area"));
                apiTimeTable.add(jsonResponseGetString(groupTimeTable, "timetables[" + a + "].schedulers[" + b + "].workStart"));
            }
        }
        for (int i = 0; i < apiTimeTable.size(); i++) {
            System.out.println(i + " " + apiTimeTable.get(i));
        }
        ApiFunctions.apiTimeTable.addAll(apiTimeTable);
    }
    // результат выполнения вышестоящего метода записывается в коллекцию apiTimeTable для последующего взаимодействия
    private static ArrayList<String> apiTimeTable = new ArrayList<>();
    public static ArrayList<String> getApiTimeTable() {
        if (! apiTimeTable.isEmpty()) return apiTimeTable;
        else throw new RuntimeException("Список расписания из апи пуст!");
    }

}
