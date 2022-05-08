package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebPageObject {
    //---------------------------------------------------Элементы-----------------------------------------------

    @FindBy(xpath = "//button[text()='Список групп']")
    public static WebElement groupListBtn;

    //----------------------------------------------------------------------------------------------------------
}
