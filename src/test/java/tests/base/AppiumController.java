package tests.base;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import helpers.TestsUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.serverevents.CustomEvent;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class AppiumController {




    String osName = "IOS"; //System.getProperty("osName");

    public static boolean PREV_TEST_FAILED = true;

    public static OS execOS;

    public enum OS {
        ANDROID,
        IOS
    }

    public static AppiumController instance = new AppiumController();
    public AppiumDriver<MobileElement> driver;

    public void start(String deviceName, String wdaLocalPort, String udid, String platform, String url) throws MalformedURLException {
//        CustomEvent evt = new CustomEvent();
//        evt.setEventName("funEvent");
//        evt.setVendor("appium");
//        driver.logEvent(evt);
        String[] platformInfo = platform.split(" ");


        if (driver != null) {
            return;
        }

        switch (osName) {
            case "IOS" :
                execOS = OS.IOS;
                break;
            case "ANDROID" :
                execOS = OS.ANDROID;
                break;
            default :
                stop();
        }

        DesiredCapabilities dc = new DesiredCapabilities();
        switch (execOS) {
            case ANDROID : {
                dc.setCapability(MobileCapabilityType.UDID, getDataFromConfig("android_udid"));
                dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, getDataFromConfig("android_os_version"));
                dc.setCapability("appPackage", getDataFromConfig("android_package_name"));
                dc.setCapability("appActivity", getDataFromConfig("android_activity_name"));
                dc.setCapability("noReset", false); // Set "true" if you need quick Log In without app resetting / Поставить true, если нужен быстрый логин без сброса приложения.
                dc.setCapability("unlockType", getDataFromConfig("unlockType")); // Тип блокировки девайса.
                dc.setCapability("unlockKey", getDataFromConfig("unlockKey")); // Ключ разблокировки.

                driver = new AndroidDriver<>(new URL(Objects.requireNonNull(getDataFromConfig(
                        "appium_server_address"))), dc);
                break;
            }

            case IOS : {
                //dc.setCapability(MobileCapabilityType.UDID, getDataFromConfig("ios_udid"));
                dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformInfo[0]);
                dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformInfo[1]);

                //dc.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);

                //dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, getDataFromConfig("ios_os_version"));
                dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
                dc.setCapability("autoGrantPermissions", true);
                dc.setCapability("xcodeOrgId", getDataFromConfig("ios_xcodeOrgId"));
                dc.setCapability("xcodeSigningId", "Leonid Gubarkov");
                dc.setCapability("app", getDataFromConfig("ios_app_name"));
                dc.setCapability("wdaLocalPort", wdaLocalPort);
                //dc.setCapability("deviceName", getDataFromConfig("ios_device_name"));
                dc.setCapability("deviceName", deviceName);
                dc.setCapability("udid", udid);
                dc.setCapability("noReset", false); // Поставить true, если нужен быстрый логин без сброса приложения.
                dc.setCapability("unlockType", getDataFromConfig("unlockType")); // Тип блокировки девайса.
                dc.setCapability("unlockKey", getDataFromConfig("unlockKey")); // Ключ разблокировки.
                dc.setCapability("url", url);
                dc.setCapability(MobileCapabilityType.APP, Paths.get("Mentle.app").toAbsolutePath().toString());
                driver = new IOSDriver<>(new URL(Objects.requireNonNull(url)), dc);
//                driver = new IOSDriver<>(new URL(Objects.requireNonNull(getDataFromConfig(
//                        "appium_server_address"))), dc);
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(TestsUtility.TIMEOUT_DEFAULT_SEC, TimeUnit.SECONDS);
    }

    private static String getDataFromConfig(String key) {
        JsonParser parser = new JsonParser();
        try {
            JsonObject config = (JsonObject) parser.parse(new FileReader("src/test/java/configs/" +
                    "_global.config.json"));
            return config.get(key).getAsString();
        } catch (Exception e) {
            Assert.fail("Не возможно получить данные из файла '_global.config.json', потому что " +
                    "" + e.getMessage());
        }

        // Никогда не случится.
        return null;
    }

    public void stop() {
        if (driver != null) {
            //driver.closeApp();
            driver.quit();
        }
    }

    public void resetApp() {
        if (driver != null) {
            switch (execOS) {
                case ANDROID : {
                    driver.resetApp();
                    System.out.println("Resetting android app");
                    break;
                }
                case IOS : {
                    driver.resetApp();

                    break; // TODO: Добавить для айос.
                }
            }
        }
    }

    public void relaunchApp() {
        if (driver != null) {
            switch (execOS) {
                case ANDROID : {
                    // TODO: Добавить для Android.
                    break;
                }
                case IOS : {
                    driver.closeApp();
                    driver.launchApp();
                }
            }
        }
    }

    public void minimizeAndOpenApp() {
        if (driver != null) {
            driver.runAppInBackground(Duration.ofSeconds(TestsUtility.TIMEOUT_SHORT_SEC));
        }
    }
}
