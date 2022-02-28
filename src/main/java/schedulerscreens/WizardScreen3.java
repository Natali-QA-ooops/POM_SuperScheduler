package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class WizardScreen3 extends BaseScreen {

    //constructor
    public WizardScreen3(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/wizard_settings_skip_container']")
    MobileElement skipButton;


    public HomeScreen3 skipWizard() {

        if(idDisplayedWithExp(skipButton)) {
            skipButton.click();
        }
        return new HomeScreen3(driver);
    }
}