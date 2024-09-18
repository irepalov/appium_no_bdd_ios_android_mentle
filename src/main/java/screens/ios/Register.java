package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class Register extends IOSBase {
    /** Sign In with social */
    MobileItem continueWithAppleButton = new MobileItem("Sign in with Apple", LocatorType.XPATH,"Register", "//XCUIElementTypeButton[@name=\"Sign in with Apple\"]");
    MobileItem continueWithFacebookButton = new MobileItem("Sign in with Facebook", LocatorType.XPATH,"Register", "//XCUIElementTypeButton[@name=\"Sign in with Facebook\"]");
    MobileItem continueWithTwitterButton = new MobileItem("Sign in with Twitter", LocatorType.XPATH,"Register", "//XCUIElementTypeButton[@name=\"Sign in with Twitter\"]");
    MobileItem signInOrRegisterWithEmailButton = new MobileItem("Sign in with Email", LocatorType.XPATH,"Register", "//XCUIElementTypeButton[@name=\"Sign in with Email\"]");

    MobileItem descriptionRegister = new MobileItem("", LocatorType.XPATH, "Register", "");
    MobileItem titleRegister = new MobileItem("", LocatorType.XPATH, "Register", "");
    MobileItem backGroundRegister = new MobileItem("", LocatorType.XPATH, "Register", "");

    /** Check */
    @Step("check Continue With Apple button is displayed")
    public void checkContinueWithAppleButtonIsDisplayed() {
        logger.info("check Continue With Apple button is displayed");
        isExist(continueWithAppleButton);
    }

    @Step("check Continue With Facebook button is displayed")
    public void checkContinueWithFacebookButtonIsDisplayed() {
        logger.info("check Continue With Facebook button is displayed");
        isExist(continueWithFacebookButton);
    }

    @Step("check Continue With Twitter button is displayed")
    public void checkContinueWithTwitterButtonIsDisplayed() {
        logger.info("check Continue With Twitter button is displayed");
        isExist(continueWithTwitterButton);
    }

    @Step("check Sign In Or Register With Email button is displayed")
    public void checkSignInOrRegisterWithEmailButtonIsDisplayed() {
        logger.info("check Sign In Or Register With Email button is displayed");
        isExist(signInOrRegisterWithEmailButton);
    }

    @Step("check Background of Register screen is displayed")
    public void checkBackGroundRegisterIsDisplayed() {
        logger.info("check Background of Register screen is displayed");
        isExist(backGroundRegister);
    }

    @Step("check Description of Register screen is displayed")
    public void checkDescriptionRegisterIsDisplayed() {
        logger.info("check Description of Register screen is displayed");
        isExist(descriptionRegister);
    }

    @Step("check Title of Register screen is displayed")
    public void checkTitleRegisterIsDisplayed() {
        logger.info("check Title of Register screen is displayed");
        isExist(titleRegister);
    }

    /** Clicks */
    @Step("click Continue With Facebook Button")
    public void clickContinueWithFacebookButton() {
        logger.info("click Continue With Facebook button");
        tapOnElement(continueWithFacebookButton);
    }

    @Step("click Continue With Apple button")
    public void clickContinueWithAppleButton() {
        logger.info("click Continue With Apple button");
        tapOnElement(continueWithAppleButton);
    }

    @Step("click Continue With Twitter Button")
    public void clickContinueWithTwitterButton() {
        logger.info("click Continue With Twitter button");
        tapOnElement(continueWithTwitterButton);
    }

    @Step("click Sign In Or Register With Email Button")
    public void clickSignInOrRegisterWithEmailButton() {
        logger.info("click Continue With Apple button");
        tapOnElement(signInOrRegisterWithEmailButton);
    }


}
