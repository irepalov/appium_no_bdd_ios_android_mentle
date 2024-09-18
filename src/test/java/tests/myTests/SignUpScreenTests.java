package tests.myTests;

import io.qameta.allure.TmsLink;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import screens.ios.*;
import tests.base.CommonActions;
import tests.base.TestListener;

@Listeners({TestListener.class})
public class SignUpScreenTests extends CommonActions {

    @TmsLink("SUP-1")
    @Test(description = "Can typing values into the Email input field", alwaysRun = true)
    public void canTypingValuesIntoEmailInputField() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.typeSomeValueToTheEmailInput("test@yopmail.com");
        iosSignUp.checkTypedValueIsDisplayedInTheEmailField("test@yopmail.com");
    }

    @TmsLink("SUP-2")
    @Test(description = "Can edit values in the Email input field", alwaysRun = true)
    public void canEditValuesIntoEmailInputField() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.typeSomeValueToTheEmailInput("test@yopmail");
        iosSignUp.checkTypedValueIsDisplayedInTheEmailField("test@yopmail");
        iosSignUp.defocusAnElement();
        iosSignUp.typeSomeValueToTheEmailInput(".com");
        iosSignUp.checkTypedValueIsDisplayedInTheEmailField("test@yopmail.com");
        iosSignUp.defocusAnElement();
        iosSignUp.setFocusToEmailInputField();
        iosSignUp.pressBackspaceButtonInEmailField();
        iosSignUp.checkTypedValueIsDisplayedInTheEmailField("test@yopmail.co");
    }

    @TmsLink("SUP-3")
    @Test(description = "Can Cut and Paste values in the Email input field", alwaysRun = true)
    public void canCutAndPasteValuesIntoEmailInputField() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        IosCopyPastePanel iosCopyPastePanel = new IosCopyPastePanel();
        IosSelectPanel iosSelectPanel = new IosSelectPanel();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.typeSomeValueToTheEmailInput("someValue");
        iosSignUp.doubleTapOnEmailInputField();
        iosSelectPanel.clickSelectAllButton();
        iosCopyPastePanel.clickCutButton();
        iosSignUp.setFocusToEmailInputField();
        iosCopyPastePanel.clickPasteButton();
        iosSignUp.checkTypedValueIsDisplayedInTheEmailField("someValue");
    }

    @TmsLink("SUP-4")
    @Test(description = "The keyboard is appearing after setting focus to the Email input field at the Sign Up screen", alwaysRun = true)
    public void keyboardIsAppearingAfterSettingFocusIntoEmailInputField() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        IosKeyboard iosKeyboard = new IosKeyboard();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.setFocusToEmailInputField();
        iosKeyboard.checkBuiltInKeyboardIsDisplayed();
    }

    @TmsLink("SUP-5")
    @Test(description = "The keyboard is appearing after setting focus to the Password input field at the Sign Up screen", alwaysRun = true)
    public void keyboardIsAppearingAfterSettingFocusIntoPasswordInputField() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        IosKeyboard iosKeyboard = new IosKeyboard();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.setFocusToPasswordInputField();
        iosKeyboard.checkBuiltInKeyboardIsDisplayed();
    }

    @TmsLink("SUP-6")
    @Test(description = "The keyboard is appearing after setting focus to the Password input field at the Sign Up screen", alwaysRun = true)
    public void keyboardIsAppearingAfterSettingFocusIntoRepeatPasswordInputField() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        IosKeyboard iosKeyboard = new IosKeyboard();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.setFocusToRepeatPasswordInputField();
        iosKeyboard.checkBuiltInKeyboardIsDisplayed();
    }

    @TmsLink("SUP-7")
    @Test(description = "Can typing values into the Password input field", alwaysRun = true)
    public void canTypingValuesIntoPasswordInputField() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.typeSomeValueToThePasswordInput("strongPassword");
        iosSignUp.checkTypedValueIsDisplayedInThePasswordField("••••••••••••••");
    }

    @TmsLink("SUP-8")
    @Test(description = "Can typing values into the Repeat Password input field", alwaysRun = true)
    public void canTypingValuesIntoRepeatPasswordInputField() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.typeSomeValueToTheRepeatPasswordInput("strongPassword");
        iosSignUp.checkTypedValueIsDisplayedInTheRepeatPasswordField("••••••••••••••");
    }

    @TmsLink("SUP-9")
    @Test(description = "Placeholder is displayed at the Email input field at Sign Up", alwaysRun = true)
    public void placeholderIsDisplayedInEmailInput() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.checkTypedValueIsDisplayedInTheEmailField("E-mail");
    }

    @TmsLink("SUP-10")
    @Test(description = "Placeholder is displayed at the Password input field at Sign Up", alwaysRun = true)
    public void placeholderIsDisplayedInThePasswordInput() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.checkTypedValueIsDisplayedInThePasswordField("Password");
    }

    @TmsLink("SUP-11")
    @Test(description = "Placeholder is displayed at the Password input field at Sign Up", alwaysRun = true)
    public void placeholderIsDisplayedInTheRepeatPasswordInput() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.checkTypedValueIsDisplayedInTheRepeatPasswordField("Password repeat");
    }

}
