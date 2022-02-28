package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashScreen1 extends BaseScreen{

    //constructor
    public SplashScreen1(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //work with help PageFactory
    @FindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/app_version_res']")
    MobileElement versionTextView;

    //proverka version
    public String getCurrencyVersion(){

        return versionTextView.getText();
    }


    public LoginScreen2 checkVersion(String version){
        shouldHave(versionTextView,version,10);
        return new LoginScreen2(driver);
    }
}
