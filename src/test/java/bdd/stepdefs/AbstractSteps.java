package bdd.stepdefs;

import bdd.android.AndroidMainActions;
import bdd.api.ApiFunctions;
import bdd.pages.AndroidPageObject;
import bdd.site.SiteMainActions;
import io.cucumber.java.bg.И;
import io.cucumber.java.ru.Дано;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;


public class AbstractSteps {

    public static int resourceID;

    @Step("Открывается {resource}")
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

    @Step("Нажимается элемент \"{elementName}\"")
    @И("^нажимается элемент \"([^\"]*)\"$")
    public static void elementClick(String elementName) {
        switch (resourceID) {
            case 0 :
                SiteMainActions.elementClick(elementName);
            break;
            case 1 :
                AndroidMainActions.elementClick(elementName);
            break;
        }
    }

    @Step("Отображается элемент \"{elementName}\"")
    @И("^отображается элемент \"([^\"]*)\"$")
    public static void elementDisplayedCheck(String elementName) {
        switch (resourceID) {
            case 0 :
                Assertions.assertTrue(SiteMainActions.elementDisplayedCheck(elementName));
                break;
            case 1 :
                Assertions.assertTrue(AndroidMainActions.elementDisplayedCheck(elementName));
                break;
        }
    }

    @Step("Не отображается элемент \"{elementName}\"")
    @И("^не отображается элемент \"([^\"]*)\"$")
    public static void elementNotDisplayedCheck(String elementName) {
        switch (resourceID) {
            case 0 :
                try {
                    Assertions.assertFalse(SiteMainActions.elementDisplayedCheck(elementName));
                }
                catch (NoSuchElementException ignore) {}
                break;
            case 1 :
                try {
                    Assertions.assertFalse(AndroidMainActions.elementDisplayedCheck(elementName));
                }
                catch (StaleElementReferenceException | NoSuchElementException ignore) {}
                break;
        }
    }

    @Step("Ввести в поле \"{elementName}\" значение \"{value}\"")
    @И("^ввести в поле \"([^\"]*)\" значение \"([^\"]*)\"$")
    public static void elementSendKeys(String elementName, String value) {
        switch (resourceID) {
            case 0 :
                SiteMainActions.elementSendKeys(elementName, value);
                Assertions.assertEquals(value, SiteMainActions.elementGetSentKeys(elementName));
                break;
            case 1 :
                AndroidMainActions.elementSendKeys(elementName, value);
                Assertions.assertEquals(value, AndroidMainActions.elementGetText(elementName));
            break;
        }
    }

    @Step("В списке \"{listName}\" выбрать элемент под номером \"{number}\"")
    @И("^в списке \"([^\"]*)\" выбрать элемент под номером (\\d+)$")
    public static void elementSelectByNumber(String listName, int number) {
        switch (resourceID) {
            case 0 :

                break;
            case 1 :
                System.out.println("Нажимаю на " + AndroidPageObject.getElementsList(listName).get(number - 1).getText());
                AndroidPageObject.getElementsList(listName).get(number - 1).click();
                break;
        }
    }

    @Step("Сравнить полученные расписания из апи и приложения")
    @И("^сравнить полученные расписания из апи и приложения$")
    public static void compareGroupsTimeTableFromApiAndApp() {
        Assert.assertEquals(ApiFunctions.getApiTimeTable(), AndroidMainActions.listElementsText);
    }

    @Step("")
    @И("^тест$")
    public static void testStep() {

    }

}
