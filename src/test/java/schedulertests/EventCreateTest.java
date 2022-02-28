package schedulertests;

import models.Auth;
import models.Event;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scheduler.SSConfiguration;
import schedulerscreens.HomeScreen3;
import schedulerscreens.LoginScreen2;

public class EventCreateTest extends SSConfiguration {
    @BeforeMethod
    public void preCond(){
        //login
        new LoginScreen2(driver)
                .complexLogin(Auth.builder()
                        .email("jack@gmail.com")
                        .password("Jj12345$").build());
    }

    @Test
    public void createNewEventTest(){
       boolean isEventCreated = new HomeScreen3(driver)
                .initCreationEvent()
                .createNewEvent(Event.builder()
                        .type("Event")
                        .type("WWW")
                        .breaks(2)
                        .wage(80).build())
                .isFabButtonPresent();

        Assert.assertTrue(isEventCreated);

    }
}
