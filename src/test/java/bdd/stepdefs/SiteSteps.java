package bdd.stepdefs;

import io.cucumber.java.bg.И;

public class SiteSteps {

    @И("^вывести в консоль сайта \"([^\"]*)\"$")
    public static void printNumber(String num) {
        System.out.println(num);
    }

}
