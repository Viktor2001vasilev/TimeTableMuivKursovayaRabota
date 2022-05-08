package bdd;


import bdd.stepdefs.Hooks;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForTests {
    public static void main(String[] args) {
        WebElement element = Hooks.androidDriver.findElement(By.id("adsf"));
        element.isDisplayed();
        AndroidElement element1 = (AndroidElement) Hooks.androidDriver.findElement(By.id("ads"));
        element1.isDisplayed();
    }
}
