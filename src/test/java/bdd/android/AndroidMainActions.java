package bdd.android;

import bdd.pages.AndroidPageObject;

public class AndroidMainActions {

    public static void elementClick(String elementName) {
        AndroidPageObject.getElement(elementName).click();
    }

    public static Boolean elementDisplayedCheck(String elementName) {
        return AndroidPageObject.getElement(elementName).isDisplayed();
    }


}
