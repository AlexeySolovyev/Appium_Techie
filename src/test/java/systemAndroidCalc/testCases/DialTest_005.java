package systemAndroidCalc.testCases;

import org.junit.Test;
import systemAndroidCalc.pageObjects.DialPage;

import java.io.IOException;

public class DialTest_005 extends BaseClass {

    @Test
    public void dialTest_001 () throws IOException {
        DialPage dial = new DialPage(driver);
        assert dial.isDisplayed();
        dial.key0.click();
        dial.key1.click();
        dial.key2.click();
        dial.key3.click();
        dial.key4.click();
        dial.key5.click();
        dial.key6.click();
        dial.key7.click();
        dial.key8.click();
        dial.key9.click();
        captureScreen(driver, "Dial Test");
        assert (dial.digitalScreen.getText().equals("(012)345-6789"));
    }
}
