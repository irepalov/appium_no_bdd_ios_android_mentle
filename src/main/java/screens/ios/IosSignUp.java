package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosSignUp extends IOSBase {

    /** Sign Up Title */
    MobileItem signUpTitle = new MobileItem("Sign Up",
            LocatorType.ACCESSIBILITY_ID,
            "IosSignUp",
            "Sign Up");


    /** Email Input Field text */
    MobileItem emailInputText = new MobileItem("Enter your Email address and Password to sign upfor this Application",
            LocatorType.XPATH,
            "IosSignUp",
            "Enter your Email address and Password to sign upfor this Application");

    /** Email Input Field */
    MobileItem emailInputField = new MobileItem("???",
            LocatorType.XPATH,
            "IosSignUp",
            "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField");

    /** Password Input text */
    MobileItem passwordInputText = new MobileItem("Enter password:",
            LocatorType.ACCESSIBILITY_ID,
            "IosSignUp",
            "Enter password:");

    /** Password Input Field */
    MobileItem passwordInputField = new MobileItem("??",
            LocatorType.XPATH,
            "IosSignUp",
            "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField[1]");

    /** Repeat Password Input text */
    MobileItem repeatPasswordInputText = new MobileItem("Enter password again:",
            LocatorType.ACCESSIBILITY_ID,
            "IosSignUp",
            "Enter password again:");

    /** Repeat Password Input Field */
    MobileItem repeatPasswordInputField = new MobileItem("??",
            LocatorType.XPATH,
            "IosSignUp",
            "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField[2]\n");

    /** Sign Up button */
    MobileItem signUpButton = new MobileItem("Sign up",
            LocatorType.XPATH,
            "IosSignUp",
            "//XCUIElementTypeButton[@name=\"Sign up\"]");

    /** Cancel button */
    MobileItem cancelButton = new MobileItem("Cancel",
            LocatorType.XPATH,
            "IosSignUp",
            "//XCUIElementTypeButton[@name=\"Cancel\"]");

    /** Privacy Policy text */
    MobileItem privacyPolicyText = new MobileItem("By signing into this application, you’re agreeing to our Privacy Policy. App will never post any data without your premission.",
            LocatorType.XPATH,
            "IosSignUp",
            "//XCUIElementTypeStaticText[@name=\"By signing into this application, you’re agreeing to our Privacy Policy. App will never post any data without your premission.\"]");

    /** Privacy Policy link */
    MobileItem privacyPolicyLink = new MobileItem("??",
            LocatorType.XPATH,
            "IosSignUp",
            "??");


    @Step("check Sign Up title is displayed")
    public void checkSignUpTitleIsDisplayed() {
        logger.info("check Sign Up title is displayed");
        verifyElementIsPresent(signUpTitle);
    }

    @Step("check Sign Up title is displayed correctly")
    public void checkSignUpTitleIsDisplayedCorrectly(String expectedTitle) {
        logger.info("check Sign Up title is displayed correctly");
        verifyElementIsPresent(signUpTitle);
        checkValueOfElementAttribute(signUpTitle, "name", expectedTitle);
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

    @Step("check Repeat Password input text is displayed correctly")
    public void checkRepeatPasswordInputTextDisplayedCorrectly(String expectedText) {
        logger.info("check Repeat Password input text is displayed correctly");
        verifyElementIsPresent(repeatPasswordInputText);
        checkValueOfElementAttribute(repeatPasswordInputText, "name", expectedText);
    }

    @Step("check Sign Up button text is displayed correctly")
    public void checkSignUpButtonDisplayedCorrectly(String expectedText) {
        logger.info("check Sign Up button text is displayed correctly");
        verifyElementIsPresent(signUpButton);
        checkValueOfElementAttribute(signUpButton, "name", expectedText);
    }

    @Step("check Cancel button text is displayed correctly")
    public void checkCancelButtonDisplayedCorrectly(String expectedText) {
        logger.info("check Cancel button text is displayed correctly");
        verifyElementIsPresent(cancelButton);
        checkValueOfElementAttribute(cancelButton, "name", expectedText);
    }

    @Step("check Privacy Policy text is displayed correctly")
    public void checkPrivacyPolicyTextDisplayedCorrectly(String expectedText) {
        logger.info("check Cancel button text is displayed correctly");
        verifyElementIsPresent(cancelButton);
        checkValueOfElementAttribute(cancelButton, "name", expectedText);
    }

    @Step("check Privacy Policy link is displayed correctly")
    public void checkPrivacyPolicyLinkIsDisplayedCorrectly(String expectedText) {
        logger.info("check Cancel button text is displayed correctly");
        verifyElementIsPresent(cancelButton);
        checkValueOfElementAttribute(cancelButton, "name", expectedText);
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

    @Step("type some value to the repeat password input field")
    public void typeSomeValueToTheRepeatPasswordInput(String someValue) {
        logger.info("type some value to the repeat password input field");
        enterTextInField(repeatPasswordInputField, someValue, true);
    }

    @Step("clear field and type some value to the email input field")
    public void notClearAndTypeSomeValueToTheEmailInput(String someValue) {
        logger.info("clear field and type some value to the email input field");
        enterTextInField(emailInputField, someValue, false);
    }

    @Step("type valid value to the email input field")
    public void typeValidValueToTheEmailInput(String validValue) {
        logger.info("type valid value to the email input field");
        enterTextInField(emailInputField, validValue, true);
    }

    @Step("type valid value to the password input field")
    public void typeValidValueToThePasswordInput(String validValue) {
        logger.info("type valid value to the password input field");
        enterTextInField(passwordInputField, validValue, true);
    }

    @Step("type invalid value to the password input field")
    public void typeInvalidValueToThePasswordInput(String invalidValue) {
        logger.info("type invalid value to the password input field");
        enterTextInField(passwordInputField, invalidValue, true);
    }

    @Step("type valid value to the Repeat Password input field")
    public void typeValidValueToTheRepeatPasswordInput(String validValue) {
        logger.info("type valid value to the Repeat Password input field");
        enterTextInField(repeatPasswordInputField, validValue, true);
    }

    @Step("type valid value to both Password inputs fields")
    public void typeValidValueToBothPasswordInputs(String validValue) {
        logger.info("type valid value to both Password inputs fields");
        enterTextInField(passwordInputField, validValue, true);
        enterTextInField(repeatPasswordInputField, validValue, true);
    }

    @Step("type invalid value to both Password inputs fields")
    public void typeInvalidValueToBothPasswordInputs(String validValue) {
        logger.info("type invalid value to both Password inputs fields");
        enterTextInField(passwordInputField, validValue, true);
        enterTextInField(repeatPasswordInputField, validValue, true);
    }

    @Step("check typed value is displayed in the Email field correctly")
    public void checkTypedValueIsDisplayedInTheEmailField(String expectedValue) {
        logger.info("check typed value is displayed in the Email field correctly");
        checkValueOfElementAttribute(emailInputField, "value", expectedValue);
    }

    @Step("check typed value is displayed in the Password field correctly")
    public void checkTypedValueIsDisplayedInThePasswordField(String expectedValue) {
        logger.info("check typed value is displayed in the Password field correctly");
        checkValueOfElementAttribute(passwordInputField, "value", expectedValue);
    }

    @Step("check typed value is displayed in the Repeat Password field correctly")
    public void checkTypedValueIsDisplayedInTheRepeatPasswordField(String expectedValue) {
        logger.info("check typed value is displayed in the Repeat Password field correctly");
        checkValueOfElementAttribute(repeatPasswordInputField, "value", expectedValue);
    }

    @Step("defocus an element")
    public void defocusAnElement() {
        logger.info("defocus an element");
        tapOnElement(signUpTitle);
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

    @Step("set focus to the Repeat Password input field")
    public void setFocusToRepeatPasswordInputField() {
        logger.info("set focus to the Repeat Password input field");
        tapOnElement(repeatPasswordInputField);
    }

    @Step("double tap on Email input field to open Ios Action Panel")
    public void doubleTapOnEmailInputField() {
        logger.info("double tap on Email input field to open Ios Action Panel");
        doubleTapOnElement(emailInputField);
    }

    @Step("click Sign Up button")
    public void clickSignUpButton() {
        logger.info("click Sign Up button");
        tapOnElement(signUpButton);
    }

    @Step("click Cancel button")
    public void clickCancelButton() {
        logger.info("click Cancel button");
        tapOnElement(cancelButton);
    }

    @Step("click Privacy Policy link")
    public void clickPrivacyPolicyLink() {
        logger.info("click Privacy Policy link");
        tapOnElement(privacyPolicyLink);
    }

    @Step("press Backspace button in Email field")
    public void pressBackspaceButtonInEmailField() {
        logger.info("press Backspace button in Email field");
        pressBackSpaceButton(emailInputField);
    }
}
