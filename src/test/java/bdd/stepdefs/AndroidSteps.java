package bdd.stepdefs;

import bdd.android.AndroidMainActions;
import bdd.site.SiteMainActions;
import io.cucumber.java.bg.И;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

public class AndroidSteps {

    @Step("Нажать назад в системе")
    @И("^нажать назад в системе$")
    public static void androidPressBack() {
        Hooks.androidDriver.navigate().back();
    }

    @Step("Выйти из приложения")
    @И("^выйти из приложения$")
    public static void closeApp() {
        Hooks.androidDriver.closeApp();
    }

    @Step("получить значения элементов из списка \"{elementListName}\"")
    @И("^получить значения элементов из списка \"([^\"]*)\"$")
    public static void getElementsValuesFromList(String elementListName) {
        AndroidMainActions.getAndPrintElementsText(elementListName);
    }

}
