package bdd.stepdefs;

import io.cucumber.java.bg.И;

public class AndroidSteps {

    @И("^нажать назад в системе$")
    public static void androidPressBack() {
        Hooks.androidDriver.navigate().back();
    }

    @И("^выйти из приложения$")
    public static void closeApp() {
        Hooks.androidDriver.closeApp();
    }

}
