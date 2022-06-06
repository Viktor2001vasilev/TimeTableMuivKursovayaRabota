package bdd.pages;

import bdd.stepdefs.Hooks;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class AndroidPageObject {

    public AndroidPageObject(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Main Page-------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(id = "com.example.timetablemuiv:id/textView2")
    private static WebElement classesScheduleText;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/current")
    private static WebElement currentButton;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/week")
    private static WebElement forWeekButton;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/imageView8")
    private static WebElement mainImage;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/settings")
    private static WebElement settingsButton;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/button_auth")
    private static WebElement authorizationButton;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
    private static WebElement openNavigationButton;

    @AndroidFindBy(xpath = "//android.widesc=\"Open navigation drawer\"]")
    private static WebElement notExistElement;

    //----------------------------------------------------------------------------------------------------------------------------------------

    //Navigation bar-------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(id = "com.example.timetablemuiv:id/imageView")
    private static WebElement navigationBarImage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView")
    private static WebElement navigationBarMainButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView")
    private static WebElement navigationBarVisitSiteButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView\n")
    private static WebElement navigationBarAboutAppButton;
    //----------------------------------------------------------------------------------------------------------------------------------------

    //Authorization Menu-------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(id = "com.example.timetablemuiv:id/textView")
    private static WebElement enterLoginText;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/edit_login")
    private static WebElement loginInput;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/edit_pass")
    private static WebElement passwordInput;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/button")
    private static WebElement checkButton;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/button2")
    private static WebElement nextButton;
    //----------------------------------------------------------------------------------------------------------------------------------------

    //Settings-------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(id = "android:id/text1")
    private static WebElement groupSelect;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView")
    private static List<WebElement> groupsList;

    @AndroidFindBy(id = "android:id/button1")
    private static WebElement closeGroupSelectButton;
    //----------------------------------------------------------------------------------------------------------------------------------------

    //Common Elements-------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private static WebElement returnButton;
    //----------------------------------------------------------------------------------------------------------------------------------------

    //Elements getters------------------------------------------------------------------------------------------------------------------------
    public static WebElement getElement(String elementName) {
        if(elementName.equals("Текст Расписание Занятий")) return classesScheduleText;
        if(elementName.equals("Кнопка Текущее")) return currentButton;
        if(elementName.equals("Кнопка На неделю")) return forWeekButton;
        if(elementName.equals("Изображение на галвной странице")) return mainImage;
        if(elementName.equals("Кнопка Настройки")) return settingsButton;
        if(elementName.equals("Кнопка Авторизации")) return authorizationButton;
        if(elementName.equals("Кнопка Раскрыть меню")) return openNavigationButton;
        if(elementName.equals("Изображение бокового меню")) return navigationBarImage;
        if(elementName.equals("Кнопка Главная в боковом меню")) return navigationBarMainButton;
        if(elementName.equals("Кнопка Посетить наш сайт в боковом меню")) return navigationBarVisitSiteButton;
        if(elementName.equals("Кнопка О приложении в боковом меню")) return navigationBarAboutAppButton;
        if(elementName.equals("Текст Введите логин")) return enterLoginText;
        if(elementName.equals("Инпут для логина")) return loginInput;
        if(elementName.equals("Инпут для пароля")) return passwordInput;
        if(elementName.equals("Кнопка Проверка")) return checkButton;
        if(elementName.equals("Кнопка Далее")) return nextButton;
        if(elementName.equals("Несуществующий элемент")) return notExistElement;
        if(elementName.equals("Выбор группы")) return groupSelect;
        if(elementName.equals("Кнопка Закрыть выбор группы")) return closeGroupSelectButton;
        if(elementName.equals("Кнопка Назад")) return returnButton;
        else return null;
    }

    public static List<WebElement> getElementsList(String listName) {
        if(listName.equals("Список групп")) return groupsList;
        else return null;
    }

    public static ArrayList<String> getListLocators(String listName) {
        if(listName.equals("Список элементов в расписании на неделю")) {
            ArrayList<String> listLocators = new ArrayList<>();
            listLocators.add("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]");
            listLocators.add("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView");
            listLocators.add("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView");
            return listLocators;
        }
        else return null;
    }

//    public static List<WebElement> getAllTimeTableElementsList() {
//        List<WebElement> elementsList1 = weekTimeTableList;
//        List<WebElement> elementsList2;
//        List<WebElement> finalList = weekTimeTableList;
//        boolean sameLists = true;
//        do {
//            int endX = elementsList1.get(0).getLocation().getX() + (elementsList1.get(0).getSize().getWidth() / 2);
//            int endY = elementsList1.get(0).getLocation().getY() + (elementsList1.get(0).getSize().getHeight() / 2);
//            int startX = elementsList1.get(elementsList1.size()-2).getLocation().getX() + (elementsList1.get(elementsList1.size()-2).getSize().getWidth() / 2);
//            int startY = elementsList1.get(elementsList1.size()-2).getLocation().getY() + (elementsList1.get(elementsList1.size()-2).getSize().getHeight() / 2);
//
//            new TouchAction<>(Hooks.androidDriver)
//                .press(PointOption.point(startX,startY))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                .moveTo(PointOption.point(endX, endY))
//                .release().perform();
//
//            elementsList2 = Hooks.androidDriver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
//
//            for (int i = 0; i < elementsList1.size(); i++) {
//                if (elementsList1.get(i).getText().equals(elementsList2.get(i).getText())) sameLists = false;
//            }
//
//            if (! sameLists) {
//                finalList.addAll(elementsList2);
//                elementsList1 = elementsList2;
//            }
//        } while( ! sameLists );
//        return finalList;
//    }
//
//    public static ArrayList<String> getAllTimeTableElementsList2() {
//        List<WebElement> elementsList1 = weekTimeTableList;
//        List<WebElement> elementsList2;
//        ArrayList<String> androidTimeTableTexts1= new ArrayList<>();
//        ArrayList<String> androidTimeTableTexts2= new ArrayList<>();
//        ArrayList<String> androidFinalTimeTableTexts = new ArrayList<>();
//        boolean sameLists = true;
//        for (WebElement webElement : elementsList1) {
//            androidFinalTimeTableTexts.add(webElement.getText());
//        }
//        androidTimeTableTexts1.addAll(androidFinalTimeTableTexts);
//
//        do {
//            int endX = (Hooks.androidDriver.manage().window().getSize().getWidth() /2);
//            int endY = Hooks.androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"МУИВ\")").getLocation().getY() + (elementsList1.get(0).getSize().getHeight() / 2);
//
//            int startX = elementsList1.get(elementsList1.size()-2).getLocation().getX() + (elementsList1.get(elementsList1.size()-2).getSize().getWidth() / 2);
//            int startY = elementsList1.get(elementsList1.size()-2).getLocation().getY() + (elementsList1.get(elementsList1.size()-2).getSize().getHeight() / 2);
//
//            new TouchAction<>(Hooks.androidDriver)
//                    .press(PointOption.point(startX,startY))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                    .moveTo(PointOption.point(endX, endY))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                    .release().perform();
//
//            elementsList2 = Hooks.androidDriver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
//
//            for (WebElement webElement : elementsList2) {
//                for (int i = 0; i < elementsList1.size(); i++) {
//                    if (! webElement.equals(elementsList1.get(i))) {
//                        androidTimeTableTexts2.add(webElement.getText());
//                    }
//                }
//            }
//
//            elementsList1.clear();
//            elementsList1.addAll(elementsList2);
//
//            if (! androidTimeTableTexts1.equals(androidTimeTableTexts2)) sameLists = false;
//            if (androidTimeTableTexts1.equals(androidTimeTableTexts2)) sameLists = true;
//
//            if (! sameLists) {
//                androidTimeTableTexts1.clear();
//                androidTimeTableTexts1.addAll(androidTimeTableTexts2);
//            }
//
//            androidFinalTimeTableTexts.addAll(androidTimeTableTexts2);
//            androidTimeTableTexts2.clear();
//        } while( ! sameLists );
//        return androidFinalTimeTableTexts;
//
//    }
//
//    public static ArrayList<String> getAllTimeTableElementsList3() {
//        List<WebElement> elementsList1 = weekTimeTableList;
//        List<WebElement> elementsList2;
//        ArrayList<String> androidTimeTableTexts1= new ArrayList<>();
//        ArrayList<String> androidTimeTableTexts2= new ArrayList<>();
//        ArrayList<String> androidFinalTimeTableTexts = new ArrayList<>();
//        boolean sameLists = true;
//        for (WebElement webElement : elementsList1) {
//            androidFinalTimeTableTexts.add(webElement.getText());
//        }
//        androidTimeTableTexts1.addAll(androidFinalTimeTableTexts);
//
//        do {
//            int endX = (Hooks.androidDriver.manage().window().getSize().getWidth() /2);
//            int endY = Hooks.androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"МУИВ\")").getLocation().getY() + (elementsList1.get(0).getSize().getHeight() / 2);
//
//            int startX = elementsList1.get(elementsList1.size()-2).getLocation().getX() + (elementsList1.get(elementsList1.size()-2).getSize().getWidth() / 2);
//            int startY = elementsList1.get(elementsList1.size()-2).getLocation().getY() + (elementsList1.get(elementsList1.size()-2).getSize().getHeight() / 2);
//
//            new TouchAction<>(Hooks.androidDriver)
//                    .press(PointOption.point(startX,startY))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                    .moveTo(PointOption.point(endX, endY))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                    .release().perform();
//
//            elementsList1 = Hooks.androidDriver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
//
//            for (WebElement webElement : elementsList1) {
//                androidTimeTableTexts2.add(webElement.getText());
//            }
//
//            if (! androidTimeTableTexts1.equals(androidTimeTableTexts2)) sameLists = false;
//            if (androidTimeTableTexts1.equals(androidTimeTableTexts2)) sameLists = true;
//
//            if (! sameLists) {
//                androidTimeTableTexts1.clear();
//                androidTimeTableTexts1.addAll(androidTimeTableTexts2);
//            }
//
//            androidFinalTimeTableTexts.addAll(androidTimeTableTexts2);
//            androidTimeTableTexts2.clear();
//        } while( ! sameLists );
//        return androidFinalTimeTableTexts;
//    }
//
//    public static void getAllTimeTableElementsList4() {
//        for (int i = 0; i < 5; i++) {
//            WebElement webElement1 = Hooks.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]"));
//            List<WebElement> elementsList = Hooks.androidDriver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
//
//            for (WebElement webElement : elementsList) {
//                System.out.println(webElement.getText());
//            }
//
//            int startX = webElement1.getLocation().getX() + (webElement1.getSize().getWidth() / 2);
//            int startY = webElement1.getLocation().getY() + (webElement1.getSize().getHeight());
//            int endX = startX;
//            int endY = webElement1.getLocation().getY() - (webElement1.getSize().getHeight() / 5);
//
//            new TouchAction<>(Hooks.androidDriver)
//                    .press(PointOption.point(startX, startY))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5)))
//                    .moveTo(PointOption.point(endX, endY))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5)))
//                    .release().perform();
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    //----------------------------------------------------------------------------------------------------------------------------------------



























}
