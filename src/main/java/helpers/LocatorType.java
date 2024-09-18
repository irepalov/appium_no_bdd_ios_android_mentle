package helpers;

/**
 * Перечисление локаторов для объектов.
 */
public enum LocatorType {
    XPATH("xpath"),
    ID("id"),
    ACCESSIBILITY_ID("accessibility id"),
    IOS_CLASS_CHAIN("-ios class chain"),
    IOS_PREDICATE_STRING("-ios predicate string");

    private final String locatorType;

    private LocatorType(String locatorType) { this.locatorType = locatorType; }

    public String toString() { return this.locatorType; }
}
