package tests.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import screens.Base;

import java.net.URL;

public class BaseTestClass extends AppiumController {


    @BeforeMethod
    @Parameters(value = {"Device", "wdaLocalPort", "udid", "platform", "url"})
    public void setUp(String deviceName, String wdaLocalPort, String udid, String platform, String url, ITestResult iTestResult) throws Exception {
        AppiumController.instance.start(deviceName, wdaLocalPort, udid, platform, url);


        switch (AppiumController.execOS) {
            case ANDROID:
            {
                Base.appiumDriver = getDriver();

                Base.logger = LoggerFactory.getLogger("Android_" + iTestResult.getMethod().getMethodName());
                break;
            }

            case IOS:
            {
                Base.appiumDriver = getDriver();

                Base.logger = LoggerFactory.getLogger("IOS" + iTestResult.getMethod().getMethodName());
            }
        }
    }

    @AfterMethod
//    public void resetApp() {
//        AppiumController.instance.resetApp();
//    }
    public void relaunchApp() {
        AppiumController.instance.relaunchApp();
    }

    //@AfterSuite
    @AfterTest
    public void tearDown() {
        AppiumController.instance.stop();
    }

    private AppiumDriver<MobileElement> getDriver() {
        return AppiumController.instance.driver;
    }

    public void minimizeAndOpenApp() {
        AppiumController.instance.minimizeAndOpenApp();
    }
}
