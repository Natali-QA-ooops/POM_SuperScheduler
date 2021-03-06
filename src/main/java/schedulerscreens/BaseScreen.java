package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseScreen {
    AppiumDriver<MobileElement> driver;

    //constructor
    public BaseScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //ojidanie mobile element email
    public void should(MobileElement element, int time) {
        new WebDriverWait(driver, time)
                .until(ExpectedConditions.visibilityOf(element));

    }

    public void type(MobileElement element, String text) {
        if (text != null) {
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }


    public void hideKeyBoard() {
        driver.hideKeyboard();
    }


    public void shouldHave(MobileElement element, String text, int time){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.textToBePresentInElement(element,text));
    }

    public boolean idDisplayedWithExp(MobileElement element){
        try{
            should(element,15);
            return element.isDisplayed();
        }catch (Exception ex){
            return false;
        }
    }
}
