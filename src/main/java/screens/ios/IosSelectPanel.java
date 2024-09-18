package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosSelectPanel extends IOSBase {

    /** Whole select panel */
    MobileItem iosSelectPanel = new MobileItem("Select/SelectAll ios actions panel",
            LocatorType.XPATH,
            "IosSelectPanel",
            "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow[2]/XCUIElementTypeMenu");


    /** Select All button */
    MobileItem selectAllButton = new MobileItem("Select All button",
            LocatorType.XPATH,
            "IosSelectPanel",
            "//XCUIElementTypeMenuItem[@name=\"Select All\"]");

    /** Select button */
    MobileItem selectButton = new MobileItem("Select button",
            LocatorType.XPATH,
            "IosSelectPanel",
            "//XCUIElementTypeMenuItem[@name=\"Select\"]");


    @Step("click Select All button")
    public void clickSelectAllButton() {
        logger.info("click Select All button");
        tapOnElement(selectAllButton);
    }

    @Step("click Select button")
    public void clickSelectButton() {
        logger.info("click Select button");
        tapOnElement(selectButton);
    }



}
