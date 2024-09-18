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
public class CommonTests extends CommonActions {

    @TmsLink("CMN-1")
    //@Link(type = "manual", value = "1")
    @Test(description = "Swipe forward to \"Onboarding 3\" and back to \"Onboarding 1\"", alwaysRun = true)
    public void swipeToOnBoarding3AndBackToOnBoarding1() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        IosOnBoarding2 iosOnBoarding2 = new IosOnBoarding2();
        IosOnBoarding3 iosOnBoarding3 = new IosOnBoarding3();
        iosOnBoarding1.checkBoarding1SkipButtonIsDisplayed();
        iosOnBoarding1.swipeToOnBoarding2();
        iosOnBoarding2.checkBoarding2BackArrowButtonIsDisplayed();
        iosOnBoarding2.swipeToOnBoarding3();
        iosOnBoarding3.checkBoarding3BackArrowButtonIsDisplayed();
        iosOnBoarding3.swipeToOnBoarding2();
        iosOnBoarding2.checkBoarding2BackArrowButtonIsDisplayed();
        iosOnBoarding2.swipeToOnBoarding1();
        iosOnBoarding1.checkBoarding1SkipButtonIsDisplayed();
    }
}
