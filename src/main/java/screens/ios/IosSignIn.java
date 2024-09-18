package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosSignIn extends IOSBase {

    /** Sign In Title */
    MobileItem signInTitle = new MobileItem("Sign In",
            LocatorType.ACCESSIBILITY_ID,
            "IosSignIn",
            "Sign In");


    /** Email Input Field text */
    MobileItem emailInputText = new MobileItem("E-mail",
            LocatorType.XPATH,
            "IosSignIn",
            "Sign in with registred Email address.");

    /** Email Input Field */
    MobileItem emailInputField = new MobileItem("E-mail",
            LocatorType.XPATH,
            "IosSignIn",
            "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField");

    /** Password Input text */
    MobileItem passwordInputText = new MobileItem("Enter password",
            LocatorType.ACCESSIBILITY_ID,
            "IosSignIn",
            "Enter password");

    /** Password Input Field */
    MobileItem passwordInputField = new MobileItem("Password",
            LocatorType.XPATH,
            "IosSignIn",
            "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField");

    /** Forgot button */
    MobileItem forgotButton = new MobileItem("Forgot?",
            LocatorType.XPATH,
            "IosSignIn",
            "//XCUIElementTypeStaticText[@name=\"Forgot?\"]");

    /** Login button */
    MobileItem loginButton = new MobileItem("Login",
            LocatorType.XPATH,
            "IosSignIn",
            "//XCUIElementTypeButton[@name=\"Login\"]");

    /** Register button */
    MobileItem registerButton = new MobileItem("Not yet registred? Register",
            LocatorType.XPATH,
            "IosSignIn",
            "//XCUIElementTypeStaticText[@name=\"Not yet registred? Register\"]");

    /** Not Yet Registered text */
    MobileItem notYetRegisteredText = new MobileItem("??",
            LocatorType.XPATH,
            "IosSignIn",
            "??");


    @Step("check Sign In title is displayed correctly")
    public void checkSignInTitleIsDisplayed() {
        logger.info("check Sign In title is displayed");
        verifyElementIsPresent(signInTitle);
    }

    @Step("check Sign In title is displayed correctly")
    public void checkSignInTitleIsDisplayedCorrectly(String expectedTitle) {
        logger.info("check Sign In title is displayed correctly");
        verifyElementIsPresent(signInTitle);
        checkValueOfElementAttribute(signInTitle, "name", expectedTitle);
    }

    @Step("check Email input text is displayed correctly")
    public void checkEmailInputTextDisplayedCorrectly(String expectedText) {
        logger.info("check Email input text is displayed correctly");
        verifyElementIsPresent(emailInputText);
        checkValueOfElementAttribute(emailInputText, "name", expectedText);
    }

    @Step("check Password input text is displayed correctly")
    public void checkPasswordInputTextDisplayedCorrectly(String expectedText) {
        logger.info("check Password input text is displayed correctly");
        verifyElementIsPresent(passwordInputText);
        checkValueOfElementAttribute(passwordInputText, "name", expectedText);
    }

    @Step("check Forgot button text is displayed correctly")
    public void checkForgotButtonDisplayedCorrectly(String expectedText) {
        logger.info("check Forgot button text is displayed correctly");
        verifyElementIsPresent(forgotButton);
        checkValueOfElementAttribute(forgotButton, "name", expectedText);
    }

    @Step("check Login button text is displayed correctly")
    public void checkLoginButtonDisplayedCorrectly(String expectedText) {
        logger.info("check Login button text is displayed correctly");
        verifyElementIsPresent(loginButton);
        checkValueOfElementAttribute(loginButton, "name", expectedText);
    }

    @Step("check Register button text is displayed correctly")
    public void checkRegisterButtonDisplayedCorrectly(String expectedText) {
        logger.info("check Register button text is displayed correctly");
        verifyElementIsPresent(registerButton);
        checkValueOfElementAttribute(registerButton, "name", expectedText);
    }

    @Step("check Not Yet Registered text is displayed correctly")
    public void checkNotYetRegisteredDisplayedCorrectly(String expectedText) {
        logger.info("check Not Yet Registered text is displayed correctly");
        verifyElementIsPresent(notYetRegisteredText);
        checkValueOfElementAttribute(notYetRegisteredText, "name", expectedText);
    }

    @Step("check typed value is displayed in the Email field correctly")
    public void checkTypedValueIsDisplayedInTheEmailField(String expectedValue) {
        logger.info("check typed value is displayed in the Email field correctly");
        checkValueOfElementAttribute(emailInputField, "value", expectedValue);
    }

    @Step("check typed value is displayed in the Password field correctly")
    public void checkTypedValueIsDisplayedInThePasswordField(String expectedValue) {
        logger.info("check typed value is displayed in the Email field correctly");
        checkValueOfElementAttribute(passwordInputField, "value", expectedValue);
    }

    @Step("set focus to the Email input field")
    public void setFocusToEmailInputField() {
        logger.info("set focus to the Email input field");
        tapOnElement(emailInputField);
    }

    @Step("set focus to the Password input field")
    public void setFocusToPasswordInputField() {
        logger.info("set focus to the Password input field");
        tapOnElement(passwordInputField);
    }

    @Step("defocus an element at Sign In screen")
    public void defocusAnElement() {
        logger.info("defocus an element");
        tapOnElement(signInTitle);
    }

    @Step("type valid value to the email input field")
    public void typeValidValueToTheEmailInput(String validValue) {
        logger.info("type valid value to the email input field");
        enterTextInField(emailInputField, validValue, false);
    }

    @Step("type some value to the email input field")
    public void typeSomeValueToTheEmailInput(String someValue) {
        logger.info("type some value to the email input field");
        enterTextInField(emailInputField, someValue, true);
    }

    @Step("type some value to the password input field")
    public void typeSomeValueToThePasswordInput(String someValue) {
        logger.info("type some value to the password input field");
        enterTextInField(passwordInputField, someValue, true);
    }

    @Step("type valid value to the password input field")
    public void typeValidValueToThePasswordInput(String validValue) {
        logger.info("type valid value to the password input field");
        enterTextInField(passwordInputField, validValue, false);
    }

    @Step("type invalid value to the password input field")
    public void typeInvalidValueToThePasswordInput(String invalidValue) {
        logger.info("type invalid value to the password input field");
        enterTextInField(passwordInputField, invalidValue, true);
    }

    @Step("click Login button")
    public void clickLoginButton() {
        logger.info("click Login button");
        tapOnElement(loginButton);
    }

    @Step("click Register button")
    public void clickRegisterButton() {
        logger.info("click Register button");
        tapOnElement(registerButton);
    }

    @Step("click Forgot button")
    public void clickForgotButton() {
        logger.info("click Forgot button");
        tapOnElement(forgotButton);
    }

    @Step("press Backspace button in Email field")
    public void pressBackspaceButtonInEmailField() {
        logger.info("press Backspace button in Email field");
        pressBackSpaceButton(emailInputField);
    }

    @Step("two taps on Email input field to open Ios Action Panel")
    public void twoTapsOnEmailInputField() {
        logger.info("double tap on Email input field to open Ios Action Panel");
        doubleTapOnElement(emailInputField);
    }

}
