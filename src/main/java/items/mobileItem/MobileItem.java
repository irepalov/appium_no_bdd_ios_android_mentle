package items.mobileItem;

import helpers.LocatorType;

/**
 * Айтем-класс для мобильных элементов.
 */
public class MobileItem {

    public String name;
    public LocatorType locatorType;
    public String locator;
    public String screen;

    public MobileItem(String name, LocatorType locatorType, String screen, String locator) {
        this.name = name;
        this.locatorType = locatorType;
        this.screen = screen;
        this.locator = locator;
    }
}
