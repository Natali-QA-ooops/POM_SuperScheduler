package schedulertests;

import models.Auth;
import org.testng.Assert;
import org.testng.annotations.Test;
import scheduler.SSConfiguration;
import schedulerscreens.LoginScreen2;
import schedulerscreens.SplashScreen1;

public class LoginTest extends SSConfiguration {

    @Test
    public void loginSuccessTest() {
//        boolean isLoginButtonPresent = new SplashScreen1(driver)
//                .checkVersion("0.0.3")

        boolean isLoginButtonPresent = new LoginScreen2(driver).fillEmail("jack@gmail.com").fillPassw("Jj12345$")
                .clickLoginBtn()
                .skipWizard()
                .openMenu()
                .logOut()
                .isLoginButtonPresent();

        Assert.assertTrue(isLoginButtonPresent);

    }

    @Test
    public void loginSuccessTestComplex() {
//        boolean isLogNtnPresent = new SplashScreen1(driver)
//                        .checkVersion("0.0.3")

        boolean isLogNtnPresent = new LoginScreen2(driver)
                .complexLogin(Auth.builder().email("jack@gmail.com").password("Jj12345$").build())
                .skipWizard()
                .openMenu()
                .logOut()
                .isLoginButtonPresent();

        Assert.assertTrue(isLogNtnPresent);

    }

    @Test
    public void registrationSuccessTest() {
        int index = (int) (System.currentTimeMillis() / 1000 % 3600);

//        boolean isLogBTNPresent = new SplashScreen1(driver)
//                        .checkVersion("0.0.3")

        boolean isLogBTNPresent = new LoginScreen2(driver)
                .complexLogin(Auth.builder().email("jack" + index + "@gmail.com").password("Jj12345$").build())
                .skipWizard()
                .openMenu()
                .logOut()
                .isLoginButtonPresent();

        Assert.assertTrue(isLogBTNPresent);
    }

    @Test
    public void loginNegativeTestHW() {

        boolean loginNegativeErrorPresent = new LoginScreen2(driver)
                .complexLogin2(Auth.builder().email("jack@gmail.com").password("Jj54321$").build())
                .isMassageNegativeErrorPresent();

        Assert.assertTrue(loginNegativeErrorPresent);


        boolean isLogBtnPresent = new LoginScreen2(driver)
                .clickBtnOK()
                .isLoginButtonPresent();

        Assert.assertTrue(isLogBtnPresent);

    }
}
