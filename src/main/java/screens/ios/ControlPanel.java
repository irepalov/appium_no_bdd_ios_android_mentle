package screens.ios;

import helpers.LocatorType;
import io.qameta.allure.Step;
import items.mobileItem.MobileItem;

public class ControlPanel extends IOSBase {

    MobileItem homeButtonControlPanel = new MobileItem("Home", LocatorType.ACCESSIBILITY_ID,"ControlPanel", "Home");
    MobileItem yourPlanButtonControlPanel = new MobileItem("Your plan", LocatorType.ACCESSIBILITY_ID,"ControlPanel", "Your plan");
    MobileItem analyticsButtonControlPanel = new MobileItem("Analytics", LocatorType.ACCESSIBILITY_ID,"ControlPanel", "Analytics");
    MobileItem profileButtonControlPanel = new MobileItem("Profile", LocatorType.ACCESSIBILITY_ID,"ControlPanel", "Profile");

    MobileItem startTalkButton = new MobileItem("Profile", LocatorType.ACCESSIBILITY_ID,"ControlPanel", "Profile");

}
