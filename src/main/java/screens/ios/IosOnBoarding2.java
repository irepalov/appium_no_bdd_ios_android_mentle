package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosOnBoarding2 extends IOSBase {

    MobileItem skipButtonOnBoarding2 = new MobileItem("Skip", LocatorType.XPATH,"IosOnBoarding1", "//XCUIElementTypeButton[@name=\"Skip\"]");
    MobileItem titleOnBoarding2 = new MobileItem("Hi, I am Mentle, the app that is by your side 24/7.", LocatorType.XPATH,"IosOnBoarding1", "//XCUIElementTypeStaticText[@name=\"Hi, I am Mentle, the app that is by your side 24/7.\"]");
    MobileItem backGroundOnBoarding2 = new MobileItem("backNew", LocatorType.XPATH, "IosOnBoarding1", "//XCUIElementTypeImage[@name=\"backNew\"]");
    MobileItem descriptionOnBoarding2 = new MobileItem("I am aiming to help people who are seeking mental help. While I am not a human therapist, I can do a lot of similar things:", LocatorType.XPATH, "IosOnBoarding1", "//XCUIElementTypeStaticText[@name=\"I am aiming to help people who are seeking mental help. While I am not a human therapist, I can do a lot of similar things:\"]");
    MobileItem backArrowButtonOnBoarding2 = new MobileItem("backButton", LocatorType.XPATH,"IosOnBoarding2", "//XCUIElementTypeButton[@name=\"backButton\"]");
    String expectedTitleValue = "";
    @Step("check Skip button on onBoarding2 is displayed")
    public void checkBoarding2SkipButtonIsDisplayed() {
        logger.info("check Skip button on onBoarding2 is displayed");
        verifyElementIsPresent(skipButtonOnBoarding2);
    }

    @Step("check BackArrow button on onBoarding2 is displayed")
    public void checkBoarding2BackArrowButtonIsDisplayed() {
        logger.info("check BackArrow button on onBoarding2 is displayed");
        isExist(backArrowButtonOnBoarding2);
        //verifyElementIsNotPresent(backArrowButtonOnBoarding2);
    }

    @Step("check title on onBoarding2 is displayed correctly") //проверяет корректность текста
    public void checkTitleOnBoarding2IsDisplayedCorrectly() {
        logger.info("check title on onBoarding2 is displayed correctly");
        verifyElementIsPresent(titleOnBoarding2);
        checkValueOfElementAttribute(titleOnBoarding2, "value", expectedTitleValue);
    }

    @Step("click Skip button on onBoarding2")
    public void clickBoarding2SkipButton() {
        logger.info("click Skip button on onBoarding2");
        tapOnElement(skipButtonOnBoarding2);
    }

    @Step("click BackArrow button on onBoarding2")
    public void clickBoarding2BackArrowButton() {
        logger.info("click BackArrow button on onBoarding2");
        tapOnElement(backArrowButtonOnBoarding2);
    }

    @Step("swipe to OnBoarding3")
    public void swipeToOnBoarding3() {
        logger.info("swipe to OnBoarding3");
        swipeByCoordinates(backGroundOnBoarding2, false, 0.8, 0.2, 300);
    }

    @Step("swipe to OnBoarding1")
    public void swipeToOnBoarding1() {
        logger.info("swipe to OnBoarding1");
        swipeByCoordinates(backGroundOnBoarding2, false, 0.2, 0.8, 300);
    }





}
