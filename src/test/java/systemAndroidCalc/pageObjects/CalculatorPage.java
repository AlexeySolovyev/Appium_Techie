package systemAndroidCalc.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import systemAndroidCalc.testCases.BaseClass;

public class CalculatorPage {
    private AndroidDriver<AndroidElement> driver;

    public CalculatorPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
    @CacheLookup
    public AndroidElement key0;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    @CacheLookup
    public AndroidElement key1;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    @CacheLookup
    public AndroidElement key2;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    @CacheLookup
    public AndroidElement key3;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    @CacheLookup
    public AndroidElement key4;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    @CacheLookup
    public AndroidElement key5;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_6")
    @CacheLookup
    public AndroidElement key6;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_7")
    @CacheLookup
    public AndroidElement key7;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_8")
    @CacheLookup
    public AndroidElement key8;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_9")
    @CacheLookup
    public AndroidElement key9;

    @AndroidFindBy(id = "com.google.android.calculator:id/dec_point")
    @CacheLookup
    public AndroidElement keyPoint;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    @CacheLookup
    public AndroidElement keyEquals;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    @CacheLookup
    public AndroidElement keyAdd;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    @CacheLookup
    public AndroidElement keySubtract;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    @CacheLookup
    public AndroidElement keyMultiply;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    @CacheLookup
    public AndroidElement keyDivision;

    @AndroidFindBy(id = "com.google.android.calculator:id/del")
    @CacheLookup
    public AndroidElement keyDelete;

    @AndroidFindBy(id = "com.google.android.calculator:id/pad_basic")
    @CacheLookup
    public AndroidElement keyLeftSlide;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    @CacheLookup
    public AndroidElement result;

    public boolean isDisplayed() {
        return keyEquals.isDisplayed();
    }
}
