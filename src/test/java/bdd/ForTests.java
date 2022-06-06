package bdd;


import bdd.api.ApiFunctions;
import bdd.stepdefs.Hooks;
import io.appium.java_client.android.AndroidElement;
import io.restassured.common.mapper.TypeRef;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ForTests {
    public static void main(String[] args) {
        ApiFunctions.getApiTimeTable();
    }
}
