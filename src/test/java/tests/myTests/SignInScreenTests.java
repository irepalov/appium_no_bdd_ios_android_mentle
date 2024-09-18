package tests.myTests;

import io.qameta.allure.TmsLink;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import screens.ios.*;
import tests.base.CommonActions;
import tests.base.TestListener;

@Listeners({TestListener.class})
public class SignInScreenTests extends CommonActions {

    @TmsLink("SIN-1")
    @Test(description = "Can typing values into the Email input field", alwaysRun = true)
    public void canTypingValuesIntoEmailInputFieldAtSignIn() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.typeSomeValueToTheEmailInput("test@yopmail.com");
        iosSignIn.checkTypedValueIsDisplayedInTheEmailField("test@yopmail.com");
    }

    @TmsLink("SIN-2")
    @Test(description = "The keyboard is appearing after setting focus to the Email input field at the Sign In screen", alwaysRun = true)
    public void keyboardIsAppearingAfterSettingFocusIntoEmailInputAtSignIn() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosKeyboard iosKeyboard = new IosKeyboard();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.setFocusToEmailInputField();
        iosKeyboard.checkBuiltInKeyboardIsDisplayed();
    }

    @TmsLink("SIN-3")
    @Test(description = "Can edit values in the Email input field at Sign In screen", alwaysRun = true)
    public void canEditValuesIntoEmailInputFieldAtSignIn() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.typeSomeValueToTheEmailInput("test@yopmail");
        iosSignIn.checkTypedValueIsDisplayedInTheEmailField("test@yopmail");
        iosSignIn.defocusAnElement();
        iosSignIn.typeSomeValueToTheEmailInput(".com");
        iosSignIn.checkTypedValueIsDisplayedInTheEmailField("test@yopmail.com");
        iosSignIn.defocusAnElement();
        iosSignIn.setFocusToEmailInputField();
        iosSignIn.pressBackspaceButtonInEmailField();
        iosSignIn.checkTypedValueIsDisplayedInTheEmailField("test@yopmail.co");
    }

    @TmsLink("SIN-4")
    @Test(description = "Can Cut and Paste values in the Email input field at Sign In", alwaysRun = true)
    public void canCutAndPasteValuesIntoEmailInputFieldAtSignIn() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosCopyPastePanel iosCopyPastePanel = new IosCopyPastePanel();
        IosSelectPanel iosSelectPanel = new IosSelectPanel();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.typeSomeValueToTheEmailInput("someValue");
        iosSignIn.twoTapsOnEmailInputField();
        iosSelectPanel.clickSelectAllButton();
        iosCopyPastePanel.clickCutButton();
        iosSignIn.setFocusToEmailInputField();
        iosCopyPastePanel.clickPasteButton();
        iosSignIn.checkTypedValueIsDisplayedInTheEmailField("someValue");
    }

    @TmsLink("SIN-5")
    @Test(description = "The keyboard is appearing after setting focus to the Email input field at the Sign In screen", alwaysRun = true)
    public void keyboardIsAppearingAfterSettingFocusIntoPasswordInputAtSignIn() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosKeyboard iosKeyboard = new IosKeyboard();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.setFocusToPasswordInputField();
        iosKeyboard.checkBuiltInKeyboardIsDisplayed();
    }

    @TmsLink("SIN-6")
    @Test(description = "Can typing values into the Password input field at Sign In screen", alwaysRun = true)
    public void canTypingValuesIntoPasswordInputFieldAtSignIn() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.typeSomeValueToThePasswordInput("strongPassword");
        iosSignIn.checkTypedValueIsDisplayedInThePasswordField("••••••••••••••");
    }

    @TmsLink("SIN-7")
    @Test(description = "Placeholder \"E-mail\" is displayed in the input field at Sign In screen", alwaysRun = true)
    public void placeholderEmailIsDisplayedAtSignIn() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.checkTypedValueIsDisplayedInTheEmailField("E-mail");
    }

    @TmsLink("SIN-8")
    @Test(description = "Placeholder \"Password\" is displayed in the input field at Sign In screen", alwaysRun = true)
    public void placeholderPasswordIsDisplayedAtSignIn() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.checkTypedValueIsDisplayedInThePasswordField("Password");
    }

}
