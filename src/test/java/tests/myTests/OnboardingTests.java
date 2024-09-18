package tests.myTests;

import Data.DP;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import screens.ios.IosOnBoarding1;
import screens.ios.IosOnBoarding2;
import screens.ios.IosOnBoarding3;
import screens.ios.Register;
import tests.base.CommonActions;
import tests.base.TestListener;

@Listeners({TestListener.class})
public class OnboardingTests extends CommonActions {

    @TmsLink("ONB-1")
    @Test(description = "\"Skip button\" on \"Onboarding 1\" is clickable", alwaysRun = true)
    public void skipButtonOnBoarding1IsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.checkContinueWithAppleButtonIsDisplayed();
    }

    @TmsLink("ONB-2")
    @Test(description = "\"Skip button\" on \"Onboarding 2\" is clickable", alwaysRun = true)
    public void skipButtonOnBoarding2IsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        IosOnBoarding2 iosOnBoarding2 = new IosOnBoarding2();
        Register register = new Register();
        iosOnBoarding1.swipeToOnBoarding2();
        //assert that this is really OnBoarding2 screen
        iosOnBoarding2.clickBoarding2SkipButton();
        register.checkContinueWithAppleButtonIsDisplayed();//assert that this is really Register screen
    }

    @TmsLink("ONB-3")
    @Test(description = "\"Get Started button\" on \"Registered\" is clickable", alwaysRun = true)
    public void getStartedButtonIsClickable() throws InterruptedException {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        IosOnBoarding2 iosOnBoarding2 = new IosOnBoarding2();
        IosOnBoarding3 iosOnBoarding3 = new IosOnBoarding3();
        Register register = new Register();
        iosOnBoarding1.swipeToOnBoarding2();
        //assert that this is really OnBoarding2 screen
        iosOnBoarding2.swipeToOnBoarding3();
        iosOnBoarding3.checkBoarding3SkipButtonIsNotDisplayed();//assert that this is really Register screen
        iosOnBoarding3.checkGetStartedButtonIsDisplayed();
        iosOnBoarding3.clickGetStartedButton();
        register.checkContinueWithAppleButtonIsDisplayed();
        Thread.sleep(3000);
    }

    @TmsLink("ONB-4")
    @Test(description = "\"Back\" button OnBoarding 2 is clickable", alwaysRun = true)
    public void backArrowButtonOnBoarding2IsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        IosOnBoarding2 iosOnBoarding2 = new IosOnBoarding2();
        //assert that this is really OnBoarding1 screen
        iosOnBoarding1.swipeToOnBoarding2();
        //assert that this is really OnBoarding2 screen
        iosOnBoarding2.checkBoarding2BackArrowButtonIsDisplayed();
        iosOnBoarding2.clickBoarding2BackArrowButton();
        iosOnBoarding1.checkBoarding1SkipButtonIsDisplayed();//assert that OnBoarding1 is displayed
    }

    @TmsLink("ONB-5")
    @Test(description = "\"BackArrow button\" on \"OnBoarding3\" is clickable", alwaysRun = true)
    public void backArrowButtonOnBoarding3IsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        IosOnBoarding2 iosOnBoarding2 = new IosOnBoarding2();
        IosOnBoarding3 iosOnBoarding3 = new IosOnBoarding3();
        //assert that this is really OnBoarding1 screen
        iosOnBoarding1.swipeToOnBoarding2();
        //assert that this is really OnBoarding2 screen
        iosOnBoarding2.swipeToOnBoarding3();
        //assert that this is really OnBoarding3 screen
        iosOnBoarding3.checkBoarding3BackArrowButtonIsDisplayed();
        iosOnBoarding3.clickBoarding3BackArrowButton();
        iosOnBoarding2.checkBoarding2SkipButtonIsDisplayed();//assert that OnBoarding2 is displayed
    }

    @TmsLink("ONB-6")
    @Test(description = "\"Skip button\" on \"Onboarding 3\"  is not displayed", alwaysRun = true)
    public void skipButtonOnBoardingIsNotDisplayed() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        IosOnBoarding2 iosOnBoarding2 = new IosOnBoarding2();
        IosOnBoarding3 iosOnBoarding3 = new IosOnBoarding3();
        iosOnBoarding1.swipeToOnBoarding2();
        //assert that this is really OnBoarding2 screen
        iosOnBoarding2.swipeToOnBoarding3();
        iosOnBoarding3.checkBoarding3SkipButtonIsNotDisplayed();//assert that this is really Register screen
    }

    @TmsLink("ONB-7")
    @Test(description = "\"Title\" on \"Onboarding 1\"  is displayed correctly",
            alwaysRun = true, dataProvider = "onBoarding1-title", dataProviderClass = DP.class)
    public void titleOnBoarding1IsDisplayedCorrectly(String data) {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        iosOnBoarding1.checkTitleOnBoarding1IsDisplayedCorrectly(data);
    }

    @TmsLink("ONB-8")
    @Test(description = "\"SubTitle\" on \"Onboarding 1\"  is displayed correctly",
            alwaysRun = true,
            dataProvider = "onBoarding1-subTitle",
            dataProviderClass = DP.class)
    public void subTitleOnBoarding1IsDisplayedCorrectly(String data) {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        iosOnBoarding1.checkSubTitleOnBoarding1IsDisplayedCorrectly(data);
    }


}
