package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosHowYourName extends IOSBase {

    /** How Your Name Title */
    MobileItem howYourNameTitle = new MobileItem("Hi, I am Mentle, your AI therapy assistant.",
            LocatorType.ACCESSIBILITY_ID,
            "IosHowYourName",
            "titleLabel");


    /** How Your Name Subtitle */
    MobileItem howYourNameSubTitle = new MobileItem("it is great to have you here! Let’s dive into what I can help you with today.",
            LocatorType.ACCESSIBILITY_ID,
            "IosHowYourName",
            "it is great to have you here! Let’s dive into what I can help you with today.");

    /** How Your Name Input Field */
    MobileItem howYourNameInputField = new MobileItem("???",
            LocatorType.ACCESSIBILITY_ID,
            "IosHowYourName",
            "nameEditText");

    /** Next button */
    MobileItem nextButton = new MobileItem("Next Button",
            LocatorType.ACCESSIBILITY_ID,
            "IosHowYourName",
            "nextBtn");

    /** Clear Text button */
    MobileItem clearTextButton = new MobileItem("Clear text",
            LocatorType.ACCESSIBILITY_ID,
            "IosHowYourName",
            "Clear text");

    @Step("check How Your Name Title is displayed")
    public void checkHowYourNameTitleDisplayed() {
        logger.info("check How Your Name Title is displayed");
        verifyElementIsPresent(howYourNameTitle);
    }

    @Step("check How Your Name Title is displayed correctly")
    public void checkHowYourNameTitleDisplayedCorrectly(String expectedTitle) {
        logger.info("check How Your Name Title is displayed correctly");
        verifyElementIsPresent(howYourNameTitle);
        checkValueOfElementAttribute(howYourNameTitle, "name", expectedTitle);
    }

    @Step("check How Your Name SubTitle is displayed correctly")
    public void checkHowYourNameSubTitleDisplayedCorrectly(String expectedTitle) {
        logger.info("check How Your Name SubTitle is displayed correctly");
        verifyElementIsPresent(howYourNameSubTitle);
        checkValueOfElementAttribute(howYourNameSubTitle, "name", expectedTitle);
    }

    @Step("check How Your Name Input placeholder is displayed correctly")
    public void checkHowYourNameInputPlaceholderDisplayedCorrectly(String expectedPlaceholderText) {
        logger.info("check How Your Name SubTitle is displayed correctly");
        verifyElementIsPresent(howYourNameInputField);
        checkValueOfElementAttribute(howYourNameInputField, "value", expectedPlaceholderText);
    }

    @Step("check Next button text is displayed correctly")
    public void checkNextButtonTextDisplayedCorrectly(String expectedText) {
        logger.info("check Next button text is displayed correctly");
        verifyElementIsPresent(nextButton);
        checkValueOfElementAttribute(nextButton, "name", expectedText);
    }

    @Step("check typed value is displayed in the How Your Name field correctly")
    public void checkTypedValueIsDisplayedInTheHowYourNameField(String expectedValue) {
        logger.info("check typed value is displayed in the How Your Name field correctly");
        checkValueOfElementAttribute(howYourNameInputField, "value", expectedValue);
    }

    @Step("check Clear Text button is displayed")
    public void checkClearTextButtonIsDisplayed() {
        logger.info("check Clear Text button is displayed");
        verifyElementIsPresent(clearTextButton);
    }

    @Step("check Clear Text button is not displayed")
    public void checkClearTextButtonIsNotDisplayed() {
        logger.info("check Clear Text button is not displayed");
        verifyElementIsNotPresent(clearTextButton);
    }

    @Step("check Clear Text button is disappear")
    public void checkClearTextButtonIsDisappear() {
        logger.info("check Clear Text button is disappear");
        waitDisappear(clearTextButton);;
    }

    @Step("check How Your Name input field in focus")
    public void checkHowYourNameFieldInFocus() {
        logger.info("check How Your Name input field in focus");
        checkElementInFocus(howYourNameInputField);
    }

    @Step("check How Your Name input field not in focus")
    public void checkHowYourNameFieldNotInFocus() {
        logger.info("check How Your Name input field not in focus");
        checkElementNotInFocus(howYourNameInputField);
    }

    @Step("type valid value to the How Your Name input field")
    public void typeValidValueToTheHowYourNameInput(String validValue) {
        logger.info("type valid value to the How Your Name input field");
        enterTextInField(howYourNameInputField, validValue, true);
    }

    @Step("type invalid value to the How Your Name input field")
    public void typeInvalidValueToTheHowYourNameInput(String invalidValue) {
        logger.info("type invalid value to the How Your Name input field");
        enterTextInField(howYourNameInputField, invalidValue, true);
    }

    @Step("two tap on How Your Name input field")
    public void twoTapOnHowYourNameInputField() {
        logger.info("two tap on How Your Name input field");
        doubleTapOnElement(howYourNameInputField);
    }

    @Step("click Next button")
    public void clickNextButton() {
        logger.info("click Next button");
        tapOnElement(nextButton);
    }

    @Step("click Clear Text button")
    public void clickClearTextButton() {
        logger.info("click Clear Text button");
        tapOnElement(clearTextButton);
    }

    @Step("set focus on the How Your Name input field")
    public void setFocusToTheHowYourNameInput() {
        logger.info("set focus on the How Your Name input field");
        tapOnElement(howYourNameInputField);
    }

    @Step("defocus an element")
    public void defocusAnElement() {
        logger.info("defocus an element");
        tapOnElement(howYourNameTitle);
    }

    @Step("press Backspace button in How Your Name input field")
    public void pressBackspaceButtonInEmailField() {
        logger.info("press Backspace button in How Your Name input field");
        pressBackSpaceButton(howYourNameInputField);
    }

}
