package tests.myTests;

import Data.DP;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import screens.ios.*;
import tests.base.CommonActions;
import tests.base.TestListener;

@Listeners({TestListener.class})
public class HowYourNameTests extends CommonActions {

    @TmsLink("HYN-1")
    @Test(description = "Can typing values into the \"How your name\" input field", alwaysRun = true)
    public void canTypingValueToTheHowYourNameInput() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.checkHowYourNameTitleDisplayed();
        iosHowYourName.typeValidValueToTheHowYourNameInput("Richard Dokinz");
        iosHowYourName.defocusAnElement();
        iosHowYourName.checkTypedValueIsDisplayedInTheHowYourNameField("Richard Dokinz");

    }

    @TmsLink("HYN-2")
    @Test(description = "Can editing values in the \"How your name\" input field", alwaysRun = true)
    public void canEditingValueInTheHowYourNameInput() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.checkHowYourNameTitleDisplayed();
        iosHowYourName.typeValidValueToTheHowYourNameInput("Richard ");
        iosHowYourName.defocusAnElement();
        iosHowYourName.typeValidValueToTheHowYourNameInput("Dokinz");
        iosHowYourName.checkTypedValueIsDisplayedInTheHowYourNameField("Richard Dokinz");
        iosHowYourName.defocusAnElement();
        iosHowYourName.pressBackspaceButtonInEmailField();
        iosHowYourName.checkTypedValueIsDisplayedInTheHowYourNameField("Richard");
    }

    @TmsLink("HYN-3")
    @Test(description = "Keyboard disappearing after defocus \"How your name\" input field", alwaysRun = true)
    public void keyboardDisappearingAfterResetDefocusHowYourNameInput() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        IosKeyboard iosKeyboard = new IosKeyboard();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.checkHowYourNameTitleDisplayed();
        iosHowYourName.setFocusToTheHowYourNameInput();
        iosKeyboard.checkBuiltInKeyboardIsDisplayed();
        iosHowYourName.defocusAnElement();
        iosKeyboard.checkBuiltInKeyboardDisappearing();
    }

    @TmsLink("HYN-4")
    @Test(description = "Can cut and paste values in the \"How your name\" input field", alwaysRun = true)
    public void canCutAndPasteValuesIntoHowYourNameInput() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        IosSelectPanel iosSelectPanel = new IosSelectPanel();
        IosCopyPastePanel iosCopyPastePanel = new IosCopyPastePanel();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.checkHowYourNameTitleDisplayed();
        iosHowYourName.typeValidValueToTheHowYourNameInput("Hawking");
        iosHowYourName.defocusAnElement();
        iosHowYourName.twoTapOnHowYourNameInputField();
        iosSelectPanel.clickSelectAllButton();
        iosCopyPastePanel.clickCutButton();
        iosHowYourName.defocusAnElement();
        iosHowYourName.twoTapOnHowYourNameInputField();
        iosCopyPastePanel.clickPasteButton();
        iosHowYourName.checkTypedValueIsDisplayedInTheHowYourNameField("Hawking");
    }

    @TmsLink("HYN-5")
    @Test(description = "Placeholder is displayed at the How Your Name input field", alwaysRun = true)
    public void placeholderIsDisplayedAtTheHowYourNameInput() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.checkHowYourNameTitleDisplayed();
        iosHowYourName.checkTypedValueIsDisplayedInTheHowYourNameField("Please enter your name");
    }

    @TmsLink("HYN-6")
    @Test(description = "\"Clear text\" button in the How Your Name Input is clickable. Clears the field.", alwaysRun = true)
    public void clearTextButtonIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.typeValidValueToTheHowYourNameInput("Newton");
        iosHowYourName.clickClearTextButton();
        iosHowYourName.checkTypedValueIsDisplayedInTheHowYourNameField("Please enter your name");
    }

    @TmsLink("HYN-7")
    @Test(description = "\"Clear text\" button not displayed while at least 1 symbol not typed in the How Your Name Input", alwaysRun = true)
    public void clearTextButtonIsNotDisplayedAtTheEmptyHowYourNameField() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.checkClearTextButtonIsNotDisplayed();
    }

    @TmsLink("HYN-8")
    @Test(description = "\"Clear text\" button in the How Your Name Input disappearing after click on it", alwaysRun = true)
    public void clearTextButtonDisappearingAfterClicking() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.typeValidValueToTheHowYourNameInput("Tesla");
        iosHowYourName.clickClearTextButton();
        iosHowYourName.checkClearTextButtonIsDisappear();
    }

    @TmsLink("HYN-9")
    @Test(description = "\"Clear text\" button in the How Your Name Input disappearing after deleting typed symbols by keyboard", alwaysRun = true)
    public void clearTextButtonDisappearingAfterDeletingSymbolsByKeyboard() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        IosKeyboard iosKeyboard = new IosKeyboard();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.typeValidValueToTheHowYourNameInput("T");
        iosKeyboard.clickIosKeyboardDeleteButton();
        iosHowYourName.checkClearTextButtonIsDisappear();
    }

    @TmsLink("HYN-10")
    @Test(description = "Can set focus to the \"How your name\" input field after defocusing", alwaysRun = true)
    public void canSetFocusToTheHowYourNameInputAfterDefocusing() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.setFocusToTheHowYourNameInput();
        iosHowYourName.checkHowYourNameFieldInFocus();
        iosHowYourName.defocusAnElement();
        //iosHowYourName.checkHowYourNameFieldNotInFocus();
        iosHowYourName.setFocusToTheHowYourNameInput();
        iosHowYourName.checkHowYourNameFieldInFocus();
    }

    @TmsLink("HYN-11")
    @Test(description = "\"Next\" button on \"How your name\" screen is clickable", alwaysRun = true)
    public void nextButtonOnHowYourNameIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        MentalHealthGoals mentalHealthGoals = new MentalHealthGoals();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.clickNextButton();
        mentalHealthGoals.checkMentalHealthGoalsTitleIsDisplayed();
    }

    @TmsLink("HYN-12")
    @Test(description = "How your name title is displayed correctly", alwaysRun = true,
            dataProvider = "howYourName-title", dataProviderClass = DP.class)
    public void checkHowYourNameTitleIsDisplayedCorrectly(String data) {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.checkHowYourNameTitleDisplayedCorrectly(data);
    }

    @TmsLink("HYN-13")
    @Test(description = "How your name subtitle is displayed correctly", alwaysRun = true,
            dataProvider = "howYourName-subtitle", dataProviderClass = DP.class)
    public void checkHowYourNameSubTitleIsDisplayedCorrectly(String data) {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.checkHowYourNameSubTitleDisplayedCorrectly(data);
    }

}
