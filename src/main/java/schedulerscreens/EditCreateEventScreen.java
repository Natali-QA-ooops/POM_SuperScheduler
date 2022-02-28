package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.Event;

public class EditCreateEventScreen extends BaseScreen{


    public EditCreateEventScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    public HomeScreen3 createNewEvent(Event event){
        //fill + click addButton --->Home Screen


        return new HomeScreen3(driver);
    }
}
