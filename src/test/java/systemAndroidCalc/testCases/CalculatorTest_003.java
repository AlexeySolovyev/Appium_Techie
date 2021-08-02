package systemAndroidCalc.testCases;

import org.junit.Test;
import systemAndroidCalc.pageObjects.CalculatorPage;

public class CalculatorTest_003 extends BaseClass {

    @Test
    public void calculatorTestMulti_003() {
        CalculatorPage calculator = new CalculatorPage(driver);
        assert (calculator.isDisplayed());
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
        calculator.keyMultiply.click();
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
        assert (calculator.result.getText().equals("1.5241578750E18"));
    }
}
