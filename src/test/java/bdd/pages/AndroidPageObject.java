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

    @AndroidFindBy(id = "com.example.timetablemuiv:id/currentDay")
    private static WebElement currentDayText;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/listview2")
    private static WebElement currentDaySchedule;

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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    private static WebElement muivText;

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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView")
    private static WebElement muivTextInAuthMenu;
    //----------------------------------------------------------------------------------------------------------------------------------------

    //Settings-------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(id = "android:id/text1")
    private static WebElement groupSelect;

    @AndroidFindBy(id = "android:id/alertTitle")
    private static WebElement selectItemText;

    @AndroidFindBy(id = "android:id/search_src_text")
    private static WebElement groupSelectInput;

    @AndroidFindBy(id = "android:id/search_mag_icon")
    private static WebElement searchIcon;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/listItems")
    private static WebElement groupListHolder;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView")
    private static List<WebElement> groupsList;

    @AndroidFindBy(id = "android:id/button1")
    private static WebElement closeGroupSelectButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    private static WebElement muivTextInGroupSelectMenu;
    //----------------------------------------------------------------------------------------------------------------------------------------

    //Common Elements-------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private static WebElement returnButton;
    //----------------------------------------------------------------------------------------------------------------------------------------

    //Elements getters------------------------------------------------------------------------------------------------------------------------
    public static WebElement getElement(String elementName) {
        if(elementName.equals("?????????? ???????????????????? ??????????????")) return classesScheduleText;
        if(elementName.equals("?????????? ?????????????? ????????")) return currentDayText;
        if(elementName.equals("???????????????????? ???? ?????????????? ????????")) return currentDaySchedule;
        if(elementName.equals("???????????? ??????????????")) return currentButton;
        if(elementName.equals("???????????? ???? ????????????")) return forWeekButton;
        if(elementName.equals("?????????????????????? ???? ?????????????? ????????????????")) return mainImage;
        if(elementName.equals("???????????? ??????????????????")) return settingsButton;
        if(elementName.equals("???????????? ??????????????????????")) return authorizationButton;
        if(elementName.equals("???????????? ???????????????? ????????")) return openNavigationButton;
        if(elementName.equals("?????????? ???????? ?? ?????????????? ????????")) return muivText;
        if(elementName.equals("?????????????????????? ???????????????? ????????")) return navigationBarImage;
        if(elementName.equals("???????????? ?????????????? ?? ?????????????? ????????")) return navigationBarMainButton;
        if(elementName.equals("???????????? ???????????????? ?????? ???????? ?? ?????????????? ????????")) return navigationBarVisitSiteButton;
        if(elementName.equals("???????????? ?? ???????????????????? ?? ?????????????? ????????")) return navigationBarAboutAppButton;
        if(elementName.equals("?????????? ?????????????? ??????????")) return enterLoginText;
        if(elementName.equals("?????????? ?????? ????????????")) return loginInput;
        if(elementName.equals("?????????? ?????? ????????????")) return passwordInput;
        if(elementName.equals("???????????? ????????????????")) return checkButton;
        if(elementName.equals("???????????? ??????????")) return nextButton;
        if(elementName.equals("?????????? ???????? ?? ???????? ??????????????????????")) return muivTextInAuthMenu;
        if(elementName.equals("???????????????????????????? ??????????????")) return notExistElement;
        if(elementName.equals("???????????? ?????????? ????????????")) return groupSelect;
        if(elementName.equals("???????????? ?????????????? ?????????? ????????????")) return closeGroupSelectButton;
        if(elementName.equals("?????????? ???????? ?? ???????? ???????????? ????????????")) return muivTextInGroupSelectMenu;
        if(elementName.equals("?????????? Select Item")) return selectItemText;
        if(elementName.equals("?????????? ?????? ????????????")) return groupSelectInput;
        if(elementName.equals("???????????? ?????? ????????????")) return searchIcon;
        if(elementName.equals("???????????? ??????????")) return groupListHolder;
        if(elementName.equals("???????????? ??????????")) return returnButton;
        else return null;
    }

    public static List<WebElement> getElementsList(String listName) {
        if(listName.equals("???????????? ??????????")) return groupsList;
        else return null;
    }

    public static ArrayList<String> getListLocators(String listName) {
        if(listName.equals("???????????? ?????????????????? ?? ???????????????????? ???? ????????????")) {
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
//            int endY = Hooks.androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"????????\")").getLocation().getY() + (elementsList1.get(0).getSize().getHeight() / 2);
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
//            int endY = Hooks.androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"????????\")").getLocation().getY() + (elementsList1.get(0).getSize().getHeight() / 2);
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
