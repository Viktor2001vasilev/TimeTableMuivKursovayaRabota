package bdd.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AndroidPageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"cart\\\"]/android.view.ViewGroup/android.widget.TextView")
    public static MobileElement button1;

}
