package systemAndroidCalc.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class DialPage {
    private AndroidDriver<AndroidElement> driver;

    public DialPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "android:id/search_src_text")
    @CacheLookup
    public AndroidElement searchField;

    @AndroidFindBy(id = "com.android.contacts:id/digits")
    @CacheLookup
    public AndroidElement digitalScreen;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.TabWidget/android.widget.LinearLayout[31]/android.widget.TextView")
    @CacheLookup
    public AndroidElement dialBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.TabWidget/android.widget.LinearLayout[2]/android.widget.TextView")
    @CacheLookup
    public AndroidElement callLogsBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.TabWidget/android.widget.LinearLayout[3]/android.widget.TextView")
    @CacheLookup
    public AndroidElement contactsBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.TabWidget/android.widget.LinearLayout[4]/android.widget.TextView")
    @CacheLookup
    public AndroidElement groupsBtn;

    @AndroidFindBy(id = "com.android.contacts:id/textCreateToContacts")
    @CacheLookup
    public AndroidElement createContactBtn;

    @AndroidFindBy(id = "com.android.contacts:id/textUpdateContacts")
    @CacheLookup
    public AndroidElement updateContactBtn;

    @AndroidFindBy(id = "com.android.contacts:id/one")
    @CacheLookup
    public AndroidElement key1;

    @AndroidFindBy(id = "com.android.contacts:id/two")
    @CacheLookup
    public AndroidElement key2;

    @AndroidFindBy(id = "com.android.contacts:id/three")
    @CacheLookup
    public AndroidElement key3;

    @AndroidFindBy(id = "com.android.contacts:id/four")
    @CacheLookup
    public AndroidElement key4;

    @AndroidFindBy(id = "com.android.contacts:id/five")
    @CacheLookup
    public AndroidElement key5;

    @AndroidFindBy(id = "com.android.contacts:id/six")
    @CacheLookup
    public AndroidElement key6;

    @AndroidFindBy(id = "com.android.contacts:id/seven")
    @CacheLookup
    public AndroidElement key7;

    @AndroidFindBy(id = "com.android.contacts:id/eight")
    @CacheLookup
    public AndroidElement key8;

    @AndroidFindBy(id = "com.android.contacts:id/nine")
    @CacheLookup
    public AndroidElement key9;

    @AndroidFindBy(id = "com.android.contacts:id/zero")
    @CacheLookup
    public AndroidElement key0;

    @AndroidFindBy(id = "com.android.contacts:id/star")
    @CacheLookup
    public AndroidElement keyStar;

    @AndroidFindBy(id = "com.android.contacts:id/pound")
    @CacheLookup
    public AndroidElement keyPound;

    @AndroidFindBy(id = "com.android.contacts:id/btnLogsCall")
    @CacheLookup
    public AndroidElement btnLogsCall;

    @AndroidFindBy(id = "com.android.contacts:id/btnVT")
    @CacheLookup
    public AndroidElement btnVideoCall;

    @AndroidFindBy(id = "com.android.contacts:id/btnMsg")
    @CacheLookup
    public AndroidElement btnMessage;

    @AndroidFindBy(id = "com.android.contacts:id/btnDelete")
    @CacheLookup
    public AndroidElement btnDelete;

    public boolean isDisplayed() {
        return btnLogsCall.isDisplayed();
    }
}
