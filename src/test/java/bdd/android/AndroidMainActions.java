package bdd.android;

import bdd.pages.AndroidPageObject;
import bdd.stepdefs.Hooks;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AndroidMainActions {

    public static void elementClick(String elementName) {
        AndroidPageObject.getElement(elementName).click();
    }

    public static Boolean elementDisplayedCheck(String elementName) {
        return AndroidPageObject.getElement(elementName).isDisplayed();
    }

    public static void elementSendKeys(String elementName, String value) {
        AndroidPageObject.getElement(elementName).sendKeys(value);
    }

    public static String elementGetText(String elementName) {
        return AndroidPageObject.getElement(elementName).getText();
    }

    public static void getAndPrintElementsText(String elementsListName) {
        System.out.println("Считываю значения элементов из списка " + elementsListName);
        listElementsText = scrollAndGetElementsText(elementsListName);
        System.out.println("Результат:");
        for (int i = 0; i < listElementsText.size(); i++) {
            System.out.println(i + " " + listElementsText.get(i));
        }
    }

    public static ArrayList<String> listElementsText = new ArrayList<>();

    public static ArrayList<String> scrollAndGetElementsText(String elementsListName) {
        ArrayList<String> finalTextList = new ArrayList<>();
        ArrayList<String> textList1 = new ArrayList<>();
        ArrayList<String> textList2 = new ArrayList<>();
        boolean check = false;
        while (! check) {
            textList1.addAll(findElementsTextAndScroll(AndroidPageObject.getListLocators(elementsListName).get(0), AndroidPageObject.getListLocators(elementsListName).get(1)));
            textList2.addAll(findElementsTextAndScroll(AndroidPageObject.getListLocators(elementsListName).get(0), AndroidPageObject.getListLocators(elementsListName).get(1)));

            if (textList1.equals(textList2)) {
                List<WebElement> elementsList = Hooks.androidDriver.findElements(By.xpath(AndroidPageObject.getListLocators(elementsListName).get(2)));
                for (WebElement webElement : elementsList) {
                    finalTextList.add(webElement.getText());
                }
                check = true;
            }
            else {
                finalTextList.addAll(textList1);
                finalTextList.addAll(textList2);
                textList1.clear();
                textList2.clear();
            }
        }
    return finalTextList;
    }

    public static ArrayList<String> findElementsTextAndScroll (String elementXpath, String subElementXpath){
        WebElement webElement1 = Hooks.androidDriver.findElement(By.xpath(elementXpath));
        List<WebElement> elementsList = Hooks.androidDriver.findElements(By.xpath(subElementXpath));

        ArrayList<String> elementsText = new ArrayList<>();
        for (WebElement webElement : elementsList) {
            elementsText.add(webElement.getText());
        }

        int startX = webElement1.getLocation().getX() + (webElement1.getSize().getWidth() / 2);
        int startY = webElement1.getLocation().getY() + (webElement1.getSize().getHeight());
        int endX = startX;
        int endY = webElement1.getLocation().getY() - (webElement1.getSize().getHeight() / 5);

        new TouchAction<>(Hooks.androidDriver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5)))
                .moveTo(PointOption.point(endX, endY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5)))
                .release().perform();

        return elementsText;
    }

}
