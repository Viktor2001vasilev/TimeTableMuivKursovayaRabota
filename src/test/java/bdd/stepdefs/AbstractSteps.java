package bdd.stepdefs;

import bdd.android.AndroidMainActions;
import io.cucumber.java.bg.И;
import io.cucumber.java.ru.Дано;
import org.junit.jupiter.api.Assertions;


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

    @И("^нажимается элемент \"([^\"]*)\"$")
    public static void elementClick(String elementName) {
        switch (resourceID) {
            case 0 :

            break;
            case 1 :
                AndroidMainActions.elementClick(elementName);
            break;
        }
    }

    @И("^отображается элемент \"([^\"]*)\"$")
    public static void elementDisplayedCheck(String elementName) {
        switch (resourceID) {
            case 0 :

                break;
            case 1 :
                Assertions.assertTrue(AndroidMainActions.elementDisplayedCheck(elementName));
                break;
        }
    }

    @И("^не отображается элемент \"([^\"]*)\"$")
    public static void elementNotDisplayedCheck(String elementName) {
        switch (resourceID) {
            case 0 :

                break;
            case 1 :
                Assertions.assertFalse(AndroidMainActions.elementDisplayedCheck(elementName));
                break;
        }
    }

    @И("^тест$")
    public static void testStep() {

    }

}
