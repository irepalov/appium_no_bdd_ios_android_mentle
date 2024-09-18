package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class AllowNotificationsRequest extends IOSBase {

    /** Allow Notifications Pop Up */
    MobileItem allowNotificationsPopUp = new MobileItem("??",
            LocatorType.XPATH,
            "AllowNotificationsRequest",
            "//XCUIElementTypeAlert[@name=\"“Mentle” Would Like to Send You Notifications\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]");


    /** Allow Notifications Pop Up Title */
    MobileItem allowNotificationsTitle = new MobileItem("“Mentle” Would Like to Send You Notifications",
            LocatorType.XPATH,
            "AllowNotificationsRequest",
            "//XCUIElementTypeStaticText[@name=\"“Mentle” Would Like to Send You Notifications\"]");

    /** Allow Notifications Pop Up SubTitle  */
    MobileItem allowNotificationsSubtitle = new MobileItem("Notifications may include alerts, sounds, and icon badges. These can be configured in Settings.",
            LocatorType.ACCESSIBILITY_ID,
            "AllowNotificationsRequest",
            "Notifications may include alerts, sounds, and icon badges. These can be configured in Settings.");


    /** Don’t Allow button */
    MobileItem dontAllowButton = new MobileItem("Don’t Allow",
            LocatorType.ACCESSIBILITY_ID,
            "AllowNotificationsRequest",
            "Don’t Allow");

    /** Allow button */
    MobileItem allowButton = new MobileItem("Allow",
            LocatorType.ACCESSIBILITY_ID,
            "AllowNotificationsRequest",
            "Allow");


    @Step("check Allow Notifications Pop Up Title is displayed correctly")
    public void checkAllowNotificationsTitleDisplayedCorrectly(String expectedTitle) {
        logger.info("check Allow Notifications Pop Up Title is displayed correctly");
        verifyElementIsPresent(allowNotificationsTitle);
        checkValueOfElementAttribute(allowNotificationsTitle, "name", expectedTitle);
    }

    @Step("check Allow Notifications Pop Up Subtitle is displayed correctly")
    public void checkAllowNotificationsSubtitleDisplayedCorrectly(String expectedSubtitle) {
        logger.info("check Allow Notifications Pop Up Subtitle is displayed correctly");
        verifyElementIsPresent(allowNotificationsSubtitle);
        checkValueOfElementAttribute(allowNotificationsSubtitle, "name", expectedSubtitle);
    }


    @Step("click Don’t Allow button")
    public void clickDontAllowButton() {
        logger.info("click Don’t Allow button");
        tapOnElement(dontAllowButton);
    }

    @Step("click Allow button")
    public void clickAllowButton() {
        logger.info("click Don’t Allow button");
        tapOnElement(allowButton);
    }

}
