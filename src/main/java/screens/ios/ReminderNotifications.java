package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class ReminderNotifications extends IOSBase {

    /** Reminder Notifications Title */
    MobileItem reminderNotificationsTitle = new MobileItem("We are almost done. One last thing - how about reminders?",
            LocatorType.ACCESSIBILITY_ID,
            "ReminderNotifications",
            "We are almost done. One last thing - how about reminders?");


    /** Reminder Notifications Subtitle */
    MobileItem reminderNotificationsSubtitle = new MobileItem("Research shows that consistency is one of the key factors of successful therapy. Would you like to set reminder notifications?",
            LocatorType.ACCESSIBILITY_ID,
            "ReminderNotifications",
            "Research shows that consistency is one of the key factors of successful therapy. Would you like to set reminder notifications?");

    /** Yes Let's Do This Button  */
    MobileItem letsDoThisButton = new MobileItem("Yes, lets do this",
            LocatorType.XPATH,
            "ReminderNotifications",
            "//XCUIElementTypeButton[@name=\"Yes, lets do this\"]");


    /** Maybe Later button */
    MobileItem maybeLaterButton = new MobileItem("Maybe later",
            LocatorType.XPATH,
            "ReminderNotifications",
            "//XCUIElementTypeButton[@name=\"Maybe later\"]");

    /** Back button */
    MobileItem backButton = new MobileItem("??",
            LocatorType.XPATH,
            "ReminderNotifications",
            "//XCUIElementTypeNavigationBar[@name=\"Mentle.NotificationSettingsStartView\"]/XCUIElementTypeButton");


    @Step("check Reminder Notifications Title is displayed correctly")
    public void checkReminderNotificationsTitleDisplayedCorrectly(String expectedTitle) {
        logger.info("check Reminder Notifications Title is displayed correctly");
        verifyElementIsPresent(reminderNotificationsTitle);
        checkValueOfElementAttribute(reminderNotificationsTitle, "name", expectedTitle);
    }

    @Step("check Reminder Notifications Subtitle is displayed correctly")
    public void checkReminderNotificationsSubtitleDisplayedCorrectly(String expectedSubtitle) {
        logger.info("check Reminder Notifications Subtitle is displayed correctly");
        verifyElementIsPresent(reminderNotificationsSubtitle);
        checkValueOfElementAttribute(reminderNotificationsSubtitle, "name", expectedSubtitle);
    }

    @Step("check Maybe Later button text is displayed correctly")
    public void checkGotItButtonTextDisplayedCorrectly(String expectedText) {
        logger.info("check Next button text is displayed correctly");
        verifyElementIsPresent(maybeLaterButton);
        checkValueOfElementAttribute(maybeLaterButton, "name", expectedText);
    }

    @Step("check Yes Let's Do This button text is displayed correctly")
    public void checkYesLetsDoThisButtonTextDisplayedCorrectly(String expectedText) {
        logger.info("check Yes Let's Do This button text is displayed correctly");
        verifyElementIsPresent(letsDoThisButton);
        checkValueOfElementAttribute(letsDoThisButton, "name", expectedText);
    }

    @Step("check Back button is displayed")
    public void checkBackButtonIsDisplayed() {
        logger.info("check Back button is displayed");
        verifyElementIsPresent(backButton);
    }


    @Step("click Maybe Later button")
    public void clickMaybeLaterButton() {
        logger.info("click Maybe Later button");
        tapOnElement(maybeLaterButton);
    }

    @Step("click Back button")
    public void clickBackButton() {
        logger.info("click Back button");
        tapOnElement(backButton);
    }

    @Step("click Yes Let's Do This button")
    public void clickYesLetsDoThisButton() {
        logger.info("click Yes Let's Do This button");
        tapOnElement(letsDoThisButton);
    }

}
