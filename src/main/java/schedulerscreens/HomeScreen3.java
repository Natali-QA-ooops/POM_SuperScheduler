package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class HomeScreen3 extends BaseScreen {
    public HomeScreen3(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/fab_main']")
    MobileElement fabAdd;

    @FindBy(xpath = "//*[@content-desc='Open']")
    MobileElement burgerMenu;

    @FindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/nav_fr_logout']")
    MobileElement logout;


    //prisutstvuel li button (+)
    public boolean isFabButtonPresent() {
        should(fabAdd, 15);
        return fabAdd.isDisplayed();
    }

    public HomeScreen3 openMenu() {
        burgerMenu.click();
        return this;
    }

    public LoginScreen2 logOut() {
        logout.click();
        return new LoginScreen2(driver);
    }

    public EditCreateEventScreen initCreationEvent() {

        return new EditCreateEventScreen(driver);
    }
}
