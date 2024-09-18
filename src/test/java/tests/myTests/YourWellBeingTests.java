package tests.myTests;

import Data.DP;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import screens.ios.*;
import tests.base.CommonActions;
import tests.base.TestListener;

@Listeners({TestListener.class})
public class YourWellBeingTests extends CommonActions {

    @TmsLink("YWB-1")
    @Test(description = "Title at Your well being screen is displayed correctly",
            dataProvider = "yourWellBeing-title",
            dataProviderClass = DP.class,
            alwaysRun = true)
    public void checkTitleAtYourWellBeingScreenIsDisplayedCorrectly(String data) throws InterruptedException {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        MentalHealthGoals mentalHealthGoals = new MentalHealthGoals();
        YourWellBeing yourWellBeing = new YourWellBeing();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.clickNextButton();
        Thread.sleep(1000);
        //mentalHealthGoals.checkNextButtonIsDisplayed();
        mentalHealthGoals.clickNextButtonMhg();
        yourWellBeing.checkYourWellBeingTitleIsDisplayedCorrectly(data);
    }




}
