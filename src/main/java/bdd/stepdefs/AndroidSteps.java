package bdd.stepdefs;

import io.cucumber.java.bg.И;

public class AndroidSteps {

    @И("^вывести в консоль \"([^\"]*)\"$")
    public static void printNumber(String num) {
        System.out.println(num);
    }

    @И("написать привет")
    public static void sayHello() {
        System.out.println("Hello world!");
    }
}
