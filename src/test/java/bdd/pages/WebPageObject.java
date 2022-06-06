package bdd.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPageObject {

    public WebPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //---------------------------------------------------Элементы-----------------------------------------------
    @FindBy(xpath = "//input[@id='searchinput']")
    public static WebElement searchInput;

    @FindBy(xpath = "//input[@id='notExistElement']")
    public static WebElement notExistElement;

    @FindBy(xpath = "//a[@id='archive-link-link']")
    public static WebElement archiveButton;
    //----------------------------------------------------------------------------------------------------------

    //Elements getters------------------------------------------------------------------------------------------------------------------------
    public static WebElement getElement(String elementName) {
        if(elementName.equals("Инпут поиск")) return searchInput;
        if(elementName.equals("Несуществующий элемент")) return notExistElement;
        if(elementName.equals("Кнопка Архив")) return archiveButton;
        else return null;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------
}
