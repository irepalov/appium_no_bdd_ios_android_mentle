package tests.myTests;

import io.qameta.allure.TmsLink;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import screens.ios.*;
import tests.base.CommonActions;
import tests.base.TestListener;

@Listeners({TestListener.class})
public class MentalHealthGoalsTests extends CommonActions {

    @TmsLink("MHG-1")
    @Test(description = "The \"More themes\" button is clickable", alwaysRun = true)
    public void skipButtonMentalHealthGoalsIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
    }

    @TmsLink("MHG-2")
    @Test(description = "The \"Back\" button on Mental health goals screen is clickable", alwaysRun = true)
    public void backButtonMentalHealthGoalsIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        MentalHealthGoals mentalHealthGoals = new MentalHealthGoals();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.clickNextButton();
        mentalHealthGoals.clickBackButton();
        iosHowYourName.checkHowYourNameTitleDisplayed();
    }

    @TmsLink("MHG-3")
    @Test(description = "The \"More themes\" button is clickable. More themes is displayed", alwaysRun = true)
    public void moreThemesButtonIsClickable() {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        MentalHealthGoals mentalHealthGoals = new MentalHealthGoals();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.clickNextButton();
        mentalHealthGoals.clickMoreThemesButton();
        mentalHealthGoals.checkChangeMyMindButtonIsDisplayed();
    }

    @TmsLink("MHG-4")
    @Test(description = "Click \"Next\" button without choosing any of theme tags ", alwaysRun = true)
    public void canClickNextButtonWithoutChoosingAnyThemeTags() throws InterruptedException {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        MentalHealthGoals mentalHealthGoals = new MentalHealthGoals();
        YourWellBeing yourWellBeing = new YourWellBeing();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.clickNextButton();
        Thread.sleep(1000);
        mentalHealthGoals.checkNextButtonIsDisplayed();
        mentalHealthGoals.clickNextButtonMhg();
        yourWellBeing.checkYourWellBeingTitleIsDisplayed();
    }

    @TmsLink("MHG-5")
    @Test(description = "Click \"Next\" button with any one of \"ThemeTag\" buttons that was switched on", alwaysRun = true)
    public void canClickNextButtonWithOneThemeTagIsOn() throws InterruptedException {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        MentalHealthGoals mentalHealthGoals = new MentalHealthGoals();
        YourWellBeing yourWellBeing = new YourWellBeing();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.clickNextButton();
        mentalHealthGoals.clickOvercomeLonelinessButton();
        mentalHealthGoals.checkOvercomeLonelinessButtonIsSelected();
        mentalHealthGoals.clickNextButtonMhg();
        yourWellBeing.checkYourWellBeingTitleIsDisplayed();
    }

    @TmsLink("MHG-6")
    @Test(description = "ThemeTag buttons that been selected, remain selected after clicking \"More themes\" button", alwaysRun = true)
    public void themeTagButtonsRemainSelectedAfterClickingMoreThemeButton() throws InterruptedException {
        IosOnBoarding1 iosOnBoarding1 = new IosOnBoarding1();
        Register register = new Register();
        IosHowYourName iosHowYourName = new IosHowYourName();
        MentalHealthGoals mentalHealthGoals = new MentalHealthGoals();
        iosOnBoarding1.clickBoarding1SkipButton();
        register.clickContinueWithTwitterButton();
        iosHowYourName.clickNextButton();
        Thread.sleep(3000);
        mentalHealthGoals.clickOvercomeLonelinessButton();
        mentalHealthGoals.clickBuildingQualityRelationshipButton();
        mentalHealthGoals.clickFightDestructiveBehaviorButton();
        mentalHealthGoals.checkOvercomeLonelinessButtonIsSelected();
        mentalHealthGoals.checkFightDestructiveBehaviorButtonIsSelected();
        mentalHealthGoals.checkBuildingQualityRelationshipButtonIsSelected();
        mentalHealthGoals.clickMoreThemesButton();
        mentalHealthGoals.checkChangeMyMindButtonIsDisplayed();
        mentalHealthGoals.checkOvercomeLonelinessButtonIsSelected();
        mentalHealthGoals.checkFightDestructiveBehaviorButtonIsSelected();
        mentalHealthGoals.checkBuildingQualityRelationshipButtonIsSelected();
    }

}
