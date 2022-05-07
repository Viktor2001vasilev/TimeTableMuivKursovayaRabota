package bdd.stepdefs;

import bdd.site.MainActions;
import io.cucumber.java.bg.И;
import io.cucumber.java.ru.Дано;

public class AbstractSteps {

    private static int resourceID;

    @Дано("^открывается (сайт|приложение)$")
    public static void openResource(String resource) {
        switch (resource) {
            case "сайт" :
                resourceID = 0;
            break;
            case "приложение" :
                resourceID = 1;
            break;
        }
    }



}
