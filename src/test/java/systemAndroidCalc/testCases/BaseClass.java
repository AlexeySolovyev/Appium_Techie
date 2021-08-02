package systemAndroidCalc.testCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    private static final String APPIUM = "http://localhost:4723/wd/hub";
    public AndroidDriver<AndroidElement> driver;

    private void setUpAndroid() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("deviceName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.dialer");
        caps.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
        //caps.setCapability("appPackage", "com.google.android.calculator");
        //caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AndroidDriver(new URL(APPIUM), caps);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Before
    public void setUp() throws Exception {
        setUpAndroid();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void captureScreen (AndroidDriver driver, String testName) throws IOException {
        File source = driver.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/screenshots/" + testName + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }

}
