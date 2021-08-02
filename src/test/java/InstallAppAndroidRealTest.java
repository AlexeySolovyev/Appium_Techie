import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class InstallAppAndroidRealTest {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        cap.setCapability(MobileCapabilityType.APP, "/Users/alexeysolovyev/Documents/GitHub/Appium_Techie/resources/com.workpail.inkpad.notepad.notes-4.3.61-APK4Fun.com.apk");
        URL url = new URL("http:/127.0.0.1:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url, cap);
        driver.quit();
    }
}
