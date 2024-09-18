package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosHome extends IOSBase {

    /** Mentle Logo*/
    MobileItem logoMentleHome = new MobileItem("logo_white",
            LocatorType.ACCESSIBILITY_ID,
            "IosHome",
            "logo_white");

    /** Greetings */
    MobileItem greetingsTitle = new MobileItem("Hi, Charlotte!", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Hi, Charlotte!\"]");
    MobileItem greetingsSubTitle = new MobileItem("Personal AI therapy assistant", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Personal AI therapy assistant\"]");

    /** Chat Session  snackbar */
    MobileItem chatSessionSnackbar = new MobileItem("??", LocatorType.XPATH, "IosHome", "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    MobileItem chatSessionSnackbarTitle = new MobileItem("Chat session", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Chat session\"]");
    MobileItem chatSessionSnackbarSubTitle = new MobileItem("Do you feel like having a conversation? Let’s have a chit-chat.", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Do you feel like having a conversation? Let’s have a chit-chat.\"]");

    /** Tests snackbar */
    MobileItem testsSnackbar = new MobileItem("??", LocatorType.XPATH, "IosHome", "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    MobileItem testsSnackbarTitle = new MobileItem("Tests", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Tests\"]");
    MobileItem testsSnackbarSubTitle = new MobileItem("Check out clinically approved tests for depression, anxiety and many more.", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Check out clinically approved tests for depression, anxiety and many more.\"]\n");

    /** Mood Journal snackbar */
    MobileItem moodJournalSnackbar = new MobileItem("??", LocatorType.XPATH, "IosHome", "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    MobileItem moodJournalSnackbarTitle = new MobileItem("Mood journal", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Mood journal\"]");
    MobileItem moodJournalSnackbarSubTitle = new MobileItem("Let’s keep track of your mood and explore your inner world.", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Let’s keep track of your mood and explore your inner world.\"]");

    /** Gratitude Journal snackbar */
    MobileItem gratitudeJournalSnackbar = new MobileItem("??", LocatorType.XPATH, "IosHome", "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    MobileItem gratitudeJournalSnackbarTitle = new MobileItem("Gratitude journal", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Gratitude jouirnal\"]");
    MobileItem gratitudeJournalSnackbarSubTitle = new MobileItem("Become happier by keeping track of small good things in life.", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Become happier by keeping track of small good things in life.\"]");

    /** Thought Of The Day snackbar */
    MobileItem thoughtOfTheDaySnackbar = new MobileItem("??", LocatorType.XPATH, "IosHome", "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther");
    MobileItem thoughtOfTheDaySnackbarTitle = new MobileItem("Thought of the day", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Thought of the day\"]");
    MobileItem thoughtOfTheDaySnackbarSubTitle = new MobileItem("Become happier by keeping track of small good things in life.", LocatorType.XPATH,"IosHome", "//XCUIElementTypeStaticText[@name=\"Become happier by keeping track of small good things in life.\"]");


    @Step("check Greetings title is displayed correctly")
    public void checkGreetingsTitleIsDisplayedCorrectly(String expectedTitle, String expectedUserName) {
        logger.info("check Greetings title is displayed correctly");
        verifyElementIsPresent(greetingsTitle);
        checkValueOfElementAttribute(greetingsTitle, "name", expectedTitle);
        checkValueOfElementAttribute(greetingsTitle, "value", expectedUserName);
    }

    @Step("check Greetings subtitle is displayed correctly")
    public void checkGreetingsSubTitleIsDisplayedCorrectly(String expectedSubTitle) {
        logger.info("check Greetings subtitle is displayed correctly");
        verifyElementIsPresent(greetingsSubTitle);
        checkValueOfElementAttribute(greetingsSubTitle, "name", expectedSubTitle);
    }

    @Step("click Chat Session snackbar")
    public void clickChatSessionSnackbar() {
        logger.info("click Chat Session snackbar");
        tapOnElement(chatSessionSnackbar);
    }





}
