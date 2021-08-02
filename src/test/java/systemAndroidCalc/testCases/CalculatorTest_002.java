package systemAndroidCalc.testCases;

import org.junit.Test;
import systemAndroidCalc.pageObjects.CalculatorPage;

import java.io.IOException;

public class CalculatorTest_002 extends BaseClass{

    @Test
    public void calculatorTestSub_002() throws IOException {
        CalculatorPage calculator = new CalculatorPage(driver);
        assert (calculator.isDisplayed());
        calculator.key9.click();
        calculator.key8.click();
        calculator.key7.click();
        calculator.key6.click();
        calculator.key5.click();
        calculator.key4.click();
        calculator.key3.click();
        calculator.key2.click();
        calculator.key1.click();
        calculator.key0.click();
        calculator.keySubtract.click();
        calculator.key1.click();
        calculator.key2.click();
        calculator.key3.click();
        calculator.key4.click();
        calculator.key5.click();
        calculator.key6.click();
        calculator.key7.click();
        calculator.key8.click();
        calculator.key9.click();
        calculator.key0.click();
        calculator.keyEquals.click();
        captureScreen(driver, "Subtraction result Test case");
        assert (calculator.result.getText().equals("8641975320"));
    }
}
