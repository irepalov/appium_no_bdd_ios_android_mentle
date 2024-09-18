package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class MentalHealthGoals extends IOSBase {

    /** Mental Health Goals Title */
    MobileItem mentalHealthGoalsTitle = new MobileItem("MHG title",
            LocatorType.ACCESSIBILITY_ID,
            "MentalHealthGoals",
            "titleLabel");


    /** Mental Health Goals Subtitle */
    MobileItem mentalHealthGoalsSubTitle = new MobileItem("MHG subtitle",
            LocatorType.ACCESSIBILITY_ID,
            "MentalHealthGoals",
            "hintLabel");

    /** More Themes Button  */
    MobileItem moreThemesButton = new MobileItem("+ More themes button",
            LocatorType.ACCESSIBILITY_ID,
            "MentalHealthGoals",
            "moreBtn");

    /** Next button */
    MobileItem nextButtonMhg = new MobileItem("Next button MHG screen",
            LocatorType.ACCESSIBILITY_ID,
            "MentalHealthGoals",
            "nextBtn");

    /** Back button */
    MobileItem backButton = new MobileItem("Back button MHG screen",
            LocatorType.ACCESSIBILITY_ID,
            "MentalHealthGoals",
            "backNew");

    /** Overcome loneliness button */
    MobileItem overcomeLonelinessButton = new MobileItem("Overcome loneliness",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[1]");

    /** Reduce stress button */
    MobileItem reduceStressButton = new MobileItem("Reduce stress",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[2]");

    /** Fight anxiety button */
    MobileItem fightAnxietyButton = new MobileItem("Fight anxiety",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[3]");

    /** Feeling content button */
    MobileItem feelingContentButton = new MobileItem("Feeling content button",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[4]");

    /** Feeling calm & peaceful button */
    MobileItem feelingCalmAndPeacefulButton = new MobileItem("Feeling calm & peaceful button",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[5]");


    /** Building quality relationship button */
    MobileItem buildingQualityRelationshipButton = new MobileItem("Building quality relationship button",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[6]");

    /** Define my life goals button */
    MobileItem defineMyLifeGoalsButton = new MobileItem("Define my life goals button",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[7]");

    /** Fight destructive behavior button */
    MobileItem fightDestructiveBehaviorButton = new MobileItem("Fight destructive behavior button",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[8]");

    /** Boost self-confidence & raise self-esteem button */
    MobileItem boostSelfConfidenceRaiseSelfEsteemButton = new MobileItem("Boost self-confidence & raise self-esteem button",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[9]");

    /** Learning self-care button */
    MobileItem learningSelfCareButton = new MobileItem("Learning self-care button",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[10]");

    /** Seek support button */
    MobileItem seekSupportButton = new MobileItem("Seek support",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[11]");

    /** Change my mind button */
    MobileItem changeMyMindButton = new MobileItem("Change my mind button",
            LocatorType.XPATH,
            "MentalHealthGoals",
            "(//XCUIElementTypeStaticText[@name=\"goalsCellLabel\"])[12]");



    @Step("check Change my mind button is displayed")
    public void checkChangeMyMindButtonIsDisplayed() {
        logger.info("check Change my mind button is displayed");
        verifyElementIsPresent(changeMyMindButton);
    }

    @Step("check Fight destructive behavior button is displayed")
    public void checkFightDestructiveBehaviorButtonIsDisplayed() {
        logger.info("check Fight destructive behavior button is displayed");
        verifyElementIsPresent(fightDestructiveBehaviorButton);
    }

    @Step("check Fight destructive behavior button is selected")
    public void checkFightDestructiveBehaviorButtonIsSelected() {
        logger.info("check Fight destructive behavior button is selected");
        checkValueOfElementAttribute(fightDestructiveBehaviorButton, "accessible", "false");;
    }

    @Step("check Define my life goals button is displayed")
    public void checkDefineMyLifeGoalsButtonIsDisplayed() {
        logger.info("check Define my life goals button is displayed");
        verifyElementIsPresent(defineMyLifeGoalsButton);
    }

    @Step("check Define my life goals button is selected")
    public void checkDefineMyLifeGoalsButtonIsSelected() {
        logger.info("check Define my life goals button is selected");
        checkValueOfElementAttribute(defineMyLifeGoalsButton, "accessible", "false");;
    }

    @Step("check Building quality relationship button is displayed")
    public void checkBuildingQualityRelationshipButtonIsDisplayed() {
        logger.info("check Building quality relationship button is displayed");
        verifyElementIsPresent(buildingQualityRelationshipButton);
    }

    @Step("check Building quality relationship button is selected")
    public void checkBuildingQualityRelationshipButtonIsSelected() {
        logger.info("check Building quality relationship button is selected");
        checkValueOfElementAttribute(buildingQualityRelationshipButton, "accessible", "false");;
    }

    @Step("check Overcome loneliness button is displayed")
    public void checkOvercomeLonelinessButtonIsDisplayed() {
        logger.info("check Overcome loneliness button is displayed");
        verifyElementIsPresent(overcomeLonelinessButton);
    }

    @Step("check Overcome loneliness button is selected")
    public void checkOvercomeLonelinessButtonIsSelected() {
        logger.info("check Overcome loneliness button is selected");
        checkValueOfElementAttribute(overcomeLonelinessButton, "accessible", "false");;
    }

    @Step("check Reduce stress button is displayed")
    public void checkReduceStressButtonIsDisplayed() {
        logger.info("check Reduce stress button is displayed");
        verifyElementIsPresent(reduceStressButton);
    }

    @Step("check Fight anxiety button is displayed")
    public void checkFightAnxietyButtonIsDisplayed() {
        logger.info("check Fight anxiety button is displayed");
        verifyElementIsPresent(fightAnxietyButton);
    }

    @Step("check Mental Health Goals screen is displayed")
    public void checkMentalHealthGoalsTitleIsDisplayed() {
        logger.info("check Mental Health Goals screen is displayed");
        verifyElementIsPresent(mentalHealthGoalsTitle);
    }

    @Step("check Mental Health Goals Title is displayed correctly")
    public void checkMentalHealthGoalsTitleDisplayedCorrectly(String expectedTitle) {
        logger.info("check Mental Health Goals Title is displayed correctly");
        verifyElementIsPresent(mentalHealthGoalsTitle);
        checkValueOfElementAttribute(mentalHealthGoalsTitle, "name", expectedTitle);
    }

    @Step("check Mental Health Goals SubTitle is displayed correctly")
    public void checkMentalHealthGoalsSubTitleDisplayedCorrectly(String expectedSubTitle) {
        logger.info("check Mental Health Goals Title is displayed correctly");
        verifyElementIsPresent(mentalHealthGoalsSubTitle);
        checkValueOfElementAttribute(mentalHealthGoalsSubTitle, "name", expectedSubTitle);
    }

    @Step("check Next button text is displayed correctly")
    public void checkNextButtonTextDisplayedCorrectly(String expectedText) {
        logger.info("check Next button text is displayed correctly");
        verifyElementIsPresent(nextButtonMhg);
        checkValueOfElementAttribute(nextButtonMhg, "name", expectedText);
    }

    @Step("check More Themes button text is displayed correctly")
    public void checkMoreThemesButtonTextDisplayedCorrectly(String expectedText) {
        logger.info("check More Themes button text is displayed correctly");
        verifyElementIsPresent(nextButtonMhg);
        checkValueOfElementAttribute(nextButtonMhg, "name", expectedText);
    }

    @Step("check More Themes button is not displayed")
    public void checkMoreThemesButtonIsNotDisplayed() {
        logger.info("check More Themes button is not displayed");
        verifyElementIsPresent(moreThemesButton);
    }

    @Step("check More Themes button is disappearing")
    public void checkMoreThemesButtonIsDisappearing() {
        logger.info("check More Themes button is disappearing");
        waitDisappear(moreThemesButton);
    }

    @Step("check Back button is displayed")
    public void checkBackButtonIsDisplayed() {
        logger.info("check Back button is displayed");
        verifyElementIsPresent(backButton);
    }

    @Step("check Next button is displayed")
    public void checkNextButtonIsDisplayed() {
        logger.info("check Next button is displayed");
        verifyElementIsPresent(nextButtonMhg);
    }

    @Step("click Next button")
    public void clickNextButtonMhg() {
        logger.info("click Next button");
        tapOnElement(nextButtonMhg);
    }

    @Step("click Fight destructive behavior button")
    public void clickFightDestructiveBehaviorButton() {
        logger.info("click Fight destructive behavior button");
        tapOnElement(fightDestructiveBehaviorButton);
    }

    @Step("click Define my life goals button")
    public void clickDefineMyLifeGoalsButton() {
        logger.info("click Define my life goals button");
        tapOnElement(defineMyLifeGoalsButton);
    }

    @Step("click Building quality relationship button")
    public void clickBuildingQualityRelationshipButton() {
        logger.info("click Building quality relationship button");
        tapOnElement(buildingQualityRelationshipButton);
    }

    @Step("click Overcome loneliness button")
    public void clickOvercomeLonelinessButton() {
        logger.info("click Overcome loneliness button");
        tapOnElement(overcomeLonelinessButton);
    }

    @Step("click Reduce stress button")
    public void clickReduceStressButton() {
        logger.info("click Reduce stress button");
        tapOnElement(reduceStressButton);
    }

    @Step("click Fight anxiety button")
    public void clickFightAnxietyButton() {
        logger.info("click Fight anxiety button");
        tapOnElement(fightAnxietyButton);
    }

    @Step("click Change My Mind button")
    public void clickChangeMyMindButton() {
        logger.info("click Change My Mind button");
        tapOnElement(changeMyMindButton);
    }

    @Step("click More Themes button")
    public void clickMoreThemesButton() {
        logger.info("click More Themes button");
        tapOnElement(moreThemesButton);
    }

    @Step("click Back button")
    public void clickBackButton() {
        logger.info("click Back button");
        tapOnElement(backButton);
    }

}
