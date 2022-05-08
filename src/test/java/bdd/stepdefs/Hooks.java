package bdd.stepdefs;

import bdd.pages.AndroidPageObject;
import io.cucumber.java.Before;
import io.appium.java_client.android.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static AndroidDriver<WebElement> androidDriver;
    public static ChromeDriver chromeDriver;

    @Before(value = "@Android")
    public void createAndroidDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Emulator2");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.example.timetablemuiv");
        cap.setCapability("appActivity", "MainActivity");

        androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        AndroidPageObject androidPageObject = new AndroidPageObject(androidDriver);
    }

    @Before(value = "@Site")
    public void createChromedDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.google.com/doodles");
    }

}
