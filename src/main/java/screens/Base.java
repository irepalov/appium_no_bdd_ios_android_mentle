package screens;

import helpers.TestsUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.slf4j.Logger;
import org.testng.Assert;

public class Base {

    public static Logger logger;

    public static AppiumDriver<MobileElement> appiumDriver;


    protected void failTestAndPrintTapError(String itemName, String itemScreen, String itemLocator, String locatorType) {
        Assert.fail("Невозможно нажать на элемент '" + itemName + "'. Возможно, элемент не существует " +
                "или по нему нельзя нажать.\n Название экрана: '" + itemScreen + "'\n Локатор (" + locatorType + "): '"
                + itemLocator + "'");
    }

    protected void failTestAndPrintGetError(String itemName, String itemScreen, String itemLocator, String locatorType) {
        Assert.fail("Невозможно получить '" + itemName + "' элемент. Возможно, элемент не существует " +
                "или невидим.\n Название экрана: '" + itemScreen + "'\n Локатор (" + locatorType + "): '"
                + itemLocator + "'");
    }

    protected void failTestAndPrintWaitError(String itemName, String itemScreen, String itemLocator, String locatorType) {
        Assert.fail("Невозможно дождаться появления '" + itemName + "' элемента за "
                + TestsUtility.TIMEOUT_DEFAULT_SEC + " секунд." + "\n Название экрана: '" + itemScreen
                + "'\n Локатор (" + locatorType + "): '" + itemLocator + "'");
    }

}
