package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosOnBoarding1 extends IOSBase {

    MobileItem skipButtonOnBoarding1 = new MobileItem("Skip", LocatorType.XPATH,"IosOnBoarding1", "//XCUIElementTypeButton[@name=\"Skip\"]");
    MobileItem titleOnBoarding1 = new MobileItem("titleLabelIdentifier", LocatorType.ID,"IosOnBoarding1", "titleLabelIdentifier");
    MobileItem backGroundOnBoarding1 = new MobileItem("backNew", LocatorType.XPATH, "IosOnBoarding1", "//XCUIElementTypeImage[@name=\"backNew\"]");
    MobileItem subTitleOnBoarding1 = new MobileItem("subTitleIdentifier", LocatorType.ACCESSIBILITY_ID, "IosOnBoarding1", "subTitleIdentifier");


    @Step("check Skip button on onBoarding1 is displayed")
    public void checkBoarding1SkipButtonIsDisplayed() {
        logger.info("check Skip button on onBoarding1 is displayed");
        verifyElementIsPresent(skipButtonOnBoarding1);
    }

    @Step("check title on onBoarding1 is displayed correctly") //проверяет корректность текста
    public void checkTitleOnBoarding1IsDisplayedCorrectly(String expectedTitle) {
        logger.info("check title on onBoarding1 is displayed correctly");
        verifyElementIsPresent(titleOnBoarding1);
        checkValueOfElementAttribute(titleOnBoarding1, "value", expectedTitle);
    }

    @Step("check subTitle on onBoarding1 is displayed correctly") //проверяет корректность текста
    public void checkSubTitleOnBoarding1IsDisplayedCorrectly(String expectedSubTitle) {
        logger.info("check subTitle on onBoarding1 is displayed correctly");
        verifyElementIsPresent(subTitleOnBoarding1);
        checkValueOfElementAttribute(subTitleOnBoarding1, "value", expectedSubTitle);
    }

    @Step("click Skip button on onBoarding1")
    public void clickBoarding1SkipButton() {
        logger.info("click Skip button on onBoarding1");
        tapOnElement(skipButtonOnBoarding1);
    }

    @Step("swipe to OnBoarding2")
    public void swipeToOnBoarding2() {
        logger.info("swipe to OnBoarding2");
        swipeByCoordinates(backGroundOnBoarding1, false, 0.8, 0.2, 300);
    }


    class Solution {
        public int countOdds(int low, int high) {
            int oddGrossAmount = (int) Math.floor(high - low) / 2;
            int oddNumbers;
            if ( oddGrossAmount % 2 == 0 )
                oddNumbers = oddGrossAmount + 1;
            else oddNumbers = oddGrossAmount;
            return oddNumbers;
        }
        public int countOdds2(int low, int high) {
            int oddGrossAmount = (high - low) / 2;
            int oddNumbers;
            if (high % 2 == 1 || low % 2 == 1) {
                oddNumbers = oddGrossAmount;
            } else {
                oddNumbers = oddGrossAmount + 1;
            }
            return oddNumbers;
        }

    }





}
