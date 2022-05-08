package bdd.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


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
    //----------------------------------------------------------------------------------------------------------------------------------------

    //Navigation bar-------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(id = "com.example.timetablemuiv:id/imageView")
    private static WebElement navigationBarImage;

    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView")
    private static WebElement navigationBarMainButton;

    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView")
    private static WebElement navigationBarVisitSiteButton;

    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView\n8")
    private static WebElement navigationBarAboutAppButton;
    //----------------------------------------------------------------------------------------------------------------------------------------

    //Authorization Menu-------------------------------------------------------------------------------------------------------------------------------
    @AndroidFindBy(id = "com.example.timetablemuiv:id/textView")
    private static WebElement enterLoginText;

    @AndroidFindBy(id = "com.example.timetablemuiv:id/edit_login")
    private static WebElement loginInput;


    //----------------------------------------------------------------------------------------------------------------------------------------

    //Elements getters------------------------------------------------------------------------------------------------------------------------
    public static WebElement getElement(String elementName) {
        if(elementName.equals("Текст Расписание Занятий")) return classesScheduleText;
        if(elementName.equals("Кнопка Текущее")) return currentButton;
        if(elementName.equals("Кнопка На неделю")) return forWeekButton;
        if(elementName.equals("Изображение на галвной странице")) return mainImage;
        if(elementName.equals("Кнопка Настройки")) return settingsButton;
        if(elementName.equals("Кнопка Авторизация")) return authorizationButton;
        if(elementName.equals("Кнопка Раскрыть меню")) return openNavigationButton;
        if(elementName.equals("Изображение бокового меню")) return navigationBarImage;
        if(elementName.equals("Кнопка Главная в боковом меню")) return navigationBarMainButton;
        if(elementName.equals("Кнопка Посетить наш сайт в боковом меню")) return navigationBarVisitSiteButton;
        if(elementName.equals("Кнопка О приложении в боковом меню")) return navigationBarAboutAppButton;
        if(elementName.equals("Инпут для логина")) return loginInput;
        else return null;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------

}
