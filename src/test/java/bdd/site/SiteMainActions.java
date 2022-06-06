package bdd.site;

import bdd.pages.AndroidPageObject;
import bdd.pages.WebPageObject;
import bdd.stepdefs.Hooks;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteMainActions {

    public static ChromeDriver getDriver() {
        return Hooks.chromeDriver;
    }

    public static void goToPath(String url) {
        getDriver().get(url);
    }

    public static void closeCurrentTab() {
        getDriver().close();
    }

    public static void elementClick(String elementName) {
        WebPageObject.getElement(elementName).click();
    }

    public static Boolean elementDisplayedCheck(String elementName) {
        return WebPageObject.getElement(elementName).isDisplayed();
    }

    public static void elementSendKeys(String elementName, String value) {
        WebPageObject.getElement(elementName).sendKeys(value);
    }

    public static String elementGetSentKeys(String elementName) {
        return WebPageObject.getElement(elementName).getText();
    }
}
