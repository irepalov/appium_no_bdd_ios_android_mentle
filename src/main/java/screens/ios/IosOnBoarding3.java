package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosOnBoarding3 extends IOSBase {

    MobileItem skipButtonOnBoarding3 = new MobileItem("Skip", LocatorType.XPATH,"IosOnBoarding3", "//XCUIElementTypeButton[@name=\"Skip\"]");
    MobileItem titleOnBoarding3 = new MobileItem("", LocatorType.XPATH,"IosOnBoarding3", "");
    MobileItem backGroundOnBoarding1 = new MobileItem("backNew", LocatorType.XPATH, "IosOnBoarding3", "//XCUIElementTypeImage[@name=\"backNew\"]");
    MobileItem descriptionOnBoarding1 = new MobileItem("", LocatorType.XPATH, "IosOnBoarding3", "");
    MobileItem backArrowButtonOnBoarding3 = new MobileItem("backButton", LocatorType.XPATH,"IosOnBoarding3", "//XCUIElementTypeButton[@name=\"backButton\"]");
    MobileItem getStartedButton = new MobileItem("Get started", LocatorType.XPATH, "IosOnBoarding3", "//XCUIElementTypeButton[@name=\"Get started\"]");

    @Step("check Skip button on onBoarding3 is NOT displayed")
    public void checkBoarding3SkipButtonIsNotDisplayed() {
        logger.info("check Skip button on onBoarding3 is NOT displayed");
        verifyElementIsNotPresent(skipButtonOnBoarding3);
    }

    @Step("check BackArrow button on onBoarding3 is displayed")
    public void checkBoarding3BackArrowButtonIsDisplayed() {
        logger.info("check BackArrow button on onBoarding3 is displayed");
        isExist(backArrowButtonOnBoarding3);
    }

    @Step("check GetStarted button on onBoarding3 is displayed")
    public void checkGetStartedButtonIsDisplayed() {
        logger.info("check GetStarted button on onBoarding3 is displayed");
        isExist(getStartedButton);
    }

    @Step("swipe to OnBoarding2")
    public void swipeToOnBoarding2() {
        logger.info("swipe to OnBoarding2");
        swipeByCoordinates(backGroundOnBoarding1, false, 0.2, 0.8, 300);
    }

    @Step("swipe left")
    public void swipeLeftOnBoarding3() {
        logger.info("swipe to OnBoarding2");
        swipeByCoordinates(backGroundOnBoarding1, false, 0.8, 0.2, 300);
    }

    //CLICKS
    @Step("click BackArrow button on onBoarding3")
    public void clickBoarding3BackArrowButton() {
        logger.info("click Skip button on onBoarding3");
        tapOnElement(backArrowButtonOnBoarding3);
    }

    @Step("click GetStarted button on onBoarding3")
    public void clickGetStartedButton() {
        logger.info("click GetStarted button on onBoarding3");
        tapOnElement(getStartedButton);
    }




}
