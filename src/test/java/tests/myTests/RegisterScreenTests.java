package tests.myTests;

import io.qameta.allure.TmsLink;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import screens.ios.*;
import tests.base.CommonActions;
import tests.base.TestListener;

@Listeners({TestListener.class})
public class RegisterScreenTests extends CommonActions {

    @TmsLink("REG-1")
    @Test(description = "\"Continue with Twitter\" button is clickable", alwaysRun = true)
    public void continueWithTwitterButtonIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.checkHowYourNameTitleDisplayed();
    }

    @TmsLink("REG-2")
    @Test(description = "\"Sign In or Register With Email\" button is clickable", alwaysRun = true)
    public void signInOrRegisterWithEmailButtonIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.checkSignInTitleIsDisplayed();
    }

    @TmsLink("REG-3")
    @Test(description = "\"Register\" button on \"Sign In\" screen is clickable", alwaysRun = true)
    public void registerButtonIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosSignIn iosSignIn = new IosSignIn();
        IosSignUp iosSignUp = new IosSignUp();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickSignInOrRegisterWithEmailButton();
        iosSignIn.clickRegisterButton();
        iosSignUp.checkSignUpTitleIsDisplayed();
    }

    @TmsLink("REG-4")
    @Test(description = "\"Continue with Apple button\" is clickable for new user", alwaysRun = true)
    public void continueWithAppleButtonIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithAppleButton();
    }

    @TmsLink("REG-5")
    @Test(description = "\"Continue with Facebook button\" is clickable", alwaysRun = true)
    public void continueWithFacebookButtonIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithFacebookButton();
    }

}
