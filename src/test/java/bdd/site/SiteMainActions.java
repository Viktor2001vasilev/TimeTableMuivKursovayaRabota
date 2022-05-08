package bdd.site;

import bdd.stepdefs.Hooks;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteMainActions {

    private static ChromeDriver getDriver() {
        return Hooks.chromeDriver;
    }

    public static void goToPath(String url) {
        getDriver().get(url);
    }

}
