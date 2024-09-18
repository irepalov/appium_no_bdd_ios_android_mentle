package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosKeyboard extends IOSBase {

    /** Whole keyboard panel */
    MobileItem iosKeyboardPanel = new MobileItem("Built-In keyboard",
            LocatorType.XPATH,
            "IosKeyboard",
            "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]");

    /** Delete button */
    MobileItem iosKeyboardDeleteButton = new MobileItem("Delete button",
            LocatorType.ACCESSIBILITY_ID,
            "IosKeyboard",
            "delete");

    @Step("check built-in keyboard is displayed")
    public void checkBuiltInKeyboardIsDisplayed() {
        logger.info("check built-in keyboard is displayed");
        verifyElementIsPresent(iosKeyboardPanel);
    }

    @Step("check built-in keyboard disappearing")
    public void checkBuiltInKeyboardDisappearing() {
        logger.info("check built-in keyboard disappearing");
        waitDisappear(iosKeyboardPanel);
    }

    @Step("check built-in keyboard is not displayed")
    public void checkBuiltInKeyboardIsNotDisplayed() {
        logger.info("check built-in keyboard is displayed");
        verifyElementIsNotPresent(iosKeyboardPanel);
    }

    @Step("click iOS keyboard Delete button")
    public void clickIosKeyboardDeleteButton() {
        logger.info("click iOS keyboard Delete button");
        tapOnElement(iosKeyboardDeleteButton);
    }



}
