package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class SetNotificationsPanel extends IOSBase {

    /** Your Well Being Title */
    MobileItem yourWellBeingTitle = new MobileItem("Your emotional well-being plan is ready and waiting for you inside of the app!",
            LocatorType.ACCESSIBILITY_ID,
            "YourWellBeing",
            "Your emotional well-being plan is ready and waiting for you inside of the app!");


    /** Your Well Being Subtitle */
    MobileItem yourWellBeingSubTitle = new MobileItem("We made sure you can treat yourself with little self-care activities every day and included all the good stuff:",
            LocatorType.ACCESSIBILITY_ID,
            "YourWellBeing",
            "We made sure you can treat yourself with little self-care activities every day and included all the good stuff:");

    /** Got It Button  */
    MobileItem gotItButton = new MobileItem("Got it!",
            LocatorType.XPATH,
            "YourWellBeing",
            "//XCUIElementTypeButton[@name=\"Got it!\"]");


    /** Back button */
    MobileItem backButton = new MobileItem("Back",
            LocatorType.XPATH,
            "YourWellBeing",
            "//XCUIElementTypeButton[@name=\"Back\"]");

    /** Items Ball */
    MobileItem itemsBall = new MobileItem("itemsBall",
            LocatorType.ACCESSIBILITY_ID,
            "YourWellBeing",
            "itemsBall");




    @Step("check Your Well Being Title is displayed correctly")
    public void checkYourWellBeingTitleDisplayedCorrectly(String expectedTitle) {
        logger.info("check Your Well Being Title is displayed correctly");
        verifyElementIsPresent(yourWellBeingTitle);
        checkValueOfElementAttribute(yourWellBeingTitle, "name", expectedTitle);
    }

    @Step("check Your Well Being SubTitle is displayed correctly")
    public void checkYourWellBeingSubTitleDisplayedCorrectly(String expectedSubTitle) {
        logger.info("check Your Well Being SubTitle is displayed correctly");
        verifyElementIsPresent(yourWellBeingSubTitle);
        checkValueOfElementAttribute(yourWellBeingSubTitle, "name", expectedSubTitle);
    }

    @Step("check Got It button text is displayed correctly")
    public void checkGotItButtonTextDisplayedCorrectly(String expectedText) {
        logger.info("check Next button text is displayed correctly");
        verifyElementIsPresent(gotItButton);
        checkValueOfElementAttribute(gotItButton, "name", expectedText);
    }

    @Step("check Back button is displayed")
    public void checkBackButtonIsDisplayed() {
        logger.info("check Back button is displayed");
        verifyElementIsPresent(backButton);
    }

    @Step("check Items Ball picture is displayed correctly")
    public void checkItemsBallPicIsDisplayedCorrectly() {
        logger.info("check Items Ball picture is displayed correctly");
        verifyElementIsPresent(itemsBall);

    }


    @Step("click Got It button")
    public void clickGotItButton() {
        logger.info("click Got It button");
        tapOnElement(gotItButton);
    }

    @Step("click Back button")
    public void clickBackButton() {
        logger.info("click Back button");
        tapOnElement(backButton);
    }

}
