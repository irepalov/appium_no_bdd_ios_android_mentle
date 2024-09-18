package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class IosCopyPastePanel extends IOSBase {

    /** Whole panel */
    MobileItem actionsPanel = new MobileItem("Copy/Paste ios actions panel",
            LocatorType.ACCESSIBILITY_ID,
            "IosCopyPastePanel",
            "//XCUIElementTypeApplication[@name=\"Mentle\"]/XCUIElementTypeWindow[2]/XCUIElementTypeMenu\n");


    /** Copy button */
    MobileItem copyButton = new MobileItem("Copy button (Actions panel)",
            LocatorType.XPATH,
            "IosCopyPastePanel",
            "//XCUIElementTypeMenuItem[@name=\"Copy\"]");

    /** Cut Button  */
    MobileItem cutButton = new MobileItem("Cut button (Actions panel)",
            LocatorType.XPATH,
            "IosCopyPastePanel",
            "//XCUIElementTypeMenuItem[@name=\"Cut\"]");

    /** Paste button */
    MobileItem pasteButton = new MobileItem("Paste button (Actions panel)",
            LocatorType.XPATH,
            "IosCopyPastePanel",
            "//XCUIElementTypeMenuItem[@name=\"Paste\"]");

    /** Replace button */
    MobileItem replaceButton = new MobileItem("Replace button (Actions panel)",
            LocatorType.XPATH,
            "IosCopyPastePanel",
            "//XCUIElementTypeMenuItem[@name=\"replace.menu.button\"]");

    /** Show Next Items button */
    MobileItem showNextItemsButton = new MobileItem("Show Next Items button (Actions panel)",
            LocatorType.XPATH,
            "IosCopyPastePanel",
            "//XCUIElementTypeMenuItem[@name=\"show.next.items.menu.button\"]");

    /** Show Previous Items button */
    MobileItem showPreviousItemsButton = new MobileItem("Show Previous Items button (Actions panel)",
            LocatorType.XPATH,
            "IosCopyPastePanel",
            "//XCUIElementTypeMenuItem[@name=\"show.previous.items.menu.button\"]");

    /** Show Previous Items button */
    MobileItem lookUpButton = new MobileItem("Look Up button (Actions panel)",
            LocatorType.XPATH,
            "IosCopyPastePanel",
            "//XCUIElementTypeMenuItem[@name=\"Look Up\"]\n");

    /** Translate button */
    MobileItem translateButton = new MobileItem("Translate button (Actions panel)",
            LocatorType.XPATH,
            "IosCopyPastePanel",
            "//XCUIElementTypeMenuItem[@name=\"Translate\"]");

    /** Share button */
    MobileItem shareButton = new MobileItem("Translate button (Actions panel)",
            LocatorType.XPATH,
            "IosCopyPastePanel",
            "//XCUIElementTypeMenuItem[@name=\"Share…\"]");

    @Step("click Copy button")
    public void clickCopyButton() {
        logger.info("click Copy button");
        tapOnElement(copyButton);
    }

    @Step("click Cut button")
    public void clickCutButton() {
        logger.info("click Cut button");
        tapOnElement(cutButton);
    }

    @Step("click Paste button")
    public void clickPasteButton() {
        logger.info("click Paste button");
        tapOnElement(pasteButton);
    }

    @Step("click Replace button")
    public void clickReplaceButton() {
        logger.info("click Replace button");
        tapOnElement(replaceButton);
    }

    @Step("click Show Next Items button")
    public void clickShowNextItemsButton() {
        logger.info("click Show Next Items button");
        tapOnElement(showNextItemsButton);
    }

    @Step("click Show Previous Items button")
    public void clickShowPreviousItemsButton() {
        logger.info("click Show Previous Items button");
        tapOnElement(showPreviousItemsButton);
    }

    @Step("click Look Up button")
    public void clickLookUpButton() {
        logger.info("click Look Up button");
        tapOnElement(lookUpButton);
    }

    @Step("click Share button")
    public void clickShareButton() {
        logger.info("click Share button");
        tapOnElement(shareButton);
    }

}
