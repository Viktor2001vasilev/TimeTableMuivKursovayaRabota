import io.appium.java_client.MobileElement;
import io.appium.java_client.android.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ForTests {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Emulator2");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.sample.ExpoShop");
        cap.setCapability("appActivity", "host.exp.exponent.MainActivity");

        AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MobileElement elementOne = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"cart\"]/android.view.ViewGroup/android.widget.TextView"));
        elementOne.click();

        driver.closeApp();


    }
}
