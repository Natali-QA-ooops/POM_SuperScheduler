package schedulertests;

import org.testng.Assert;
import org.testng.annotations.Test;
import scheduler.SSConfiguration;
import schedulerscreens.SplashScreen1;

public class LaunchTest extends SSConfiguration {

    //каждый тест начинается с построения обьекта скрина
    //  который является точкой входа

    @Test
    public void launchTest(){

        String version = new SplashScreen1(driver).getCurrencyVersion();
        Assert.assertEquals(version,"0.0.3");
    }
}
