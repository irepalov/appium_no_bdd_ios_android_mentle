package tests.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        AppiumController.PREV_TEST_FAILED = false;
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        AppiumController.PREV_TEST_FAILED = true;
        Object testClass = iTestResult.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy hh:mm:ss");
        Date date = new Date();
        AppiumDriver<MobileElement> driver = AppiumController.instance.driver;
        saveScreenshot(driver, iTestResult.getName() + "_" + sdf.format(date));
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Attachment(value = "{screenshotName}", type = "image/png")
    public byte[] saveScreenshot(AppiumDriver<?> driver, String screenshotName) {
        return driver.getScreenshotAs(OutputType.BYTES);
    }
}
