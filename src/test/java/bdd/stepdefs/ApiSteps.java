package bdd.stepdefs;

import bdd.api.ApiFunctions;
import io.cucumber.java.bg.И;
import io.qameta.allure.Step;

public class ApiSteps {
    @Step("Получить из апи расписание на неделю для группы \"{groupsName}\"")
    @И("^получить из апи расписание на неделю для группы \"([^\"]*)\"$")
    public static void getTimeTableFromApi(String groupsName) {
        ApiFunctions.createGroupsTimeTableList(groupsName);
    }
}
