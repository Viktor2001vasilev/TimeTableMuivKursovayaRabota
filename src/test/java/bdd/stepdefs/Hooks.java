package bdd.stepdefs;

import bdd.pages.AndroidPageObject;
import bdd.pages.WebPageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.appium.java_client.android.*;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static AndroidDriver<WebElement> androidDriver;
    public static ChromeDriver chromeDriver;

    @Step("Подготовка среды - Android")
    @Before(value = "@Android")
    public void createAndroidDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Emulator");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.example.timetablemuiv");
        cap.setCapability("appActivity", "MainActivity");
        cap.setCapability("newCommandTimeout", 60*5);

        androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        AndroidPageObject androidPageObject = new AndroidPageObject(androidDriver);
    }

    @Step("Подготовка среды - Site")
    @Before(value = "@Site")
    public void createChromedDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.google.com/doodles");

        WebPageObject webPageObject = new WebPageObject(chromeDriver);
    }

    @After
    public void tearDown(Scenario scenario) {
        switch (AbstractSteps.resourceID) {
            case 0:
                if (scenario.isFailed()) {
                    Allure.addAttachment("Скриншот падения", new ByteArrayInputStream(((TakesScreenshot) chromeDriver).getScreenshotAs(OutputType.BYTES)));
                }
                chromeDriver.quit();
                break;
            case 1:
                if (scenario.isFailed()) {
                    Allure.addAttachment("Скриншот падения", new ByteArrayInputStream(((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.BYTES)));
                }
                androidDriver.quit();
                break;
        }
    }

}
