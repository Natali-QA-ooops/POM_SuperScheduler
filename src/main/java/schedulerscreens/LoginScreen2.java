package schedulerscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import models.Auth;
import org.openqa.selenium.support.FindBy;

public class LoginScreen2 extends BaseScreen{

    public LoginScreen2(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailEditText;

    @FindBy (xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwEditText;

    @FindBy (xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginButton;

    @FindBy (xpath = "//*[@text='Wrong email or password']")
    MobileElement massageError;

    @FindBy (xpath = "//*[@resource-id='android:id/button1']")
    MobileElement buttonOK;

    //===========================================================================================
    public LoginScreen2 fillEmail(String email){
        //wait + fill email
        should(emailEditText,20);
        type(emailEditText,email);
        return this;// ostavayas na etoy page return this page,
                    //net perexoda na next page
    }

    public LoginScreen2 fillPassw(String password){
        //wait + fill passw
        type(passwEditText,password);
        return this;
    }
//================================================================================================
    public WizardScreen3 clickLoginBtn(){
        hideKeyBoard();
        loginButton.click();
        return new WizardScreen3(driver);
    }
    
    public WizardScreen3 complexLogin(Auth auth) {
        should(emailEditText,20);
        type(emailEditText,auth.getEmail());
        type(passwEditText,auth.getPassword());
        hideKeyBoard();
        loginButton.click();

        return new WizardScreen3(driver);
    }

    private void fillPasswM(Auth auth) {
        type(passwEditText, auth.getPassword());
    }

    private void fillEmailM(Auth auth) {
        type(emailEditText, auth.getEmail());
    }

    public boolean isLoginButtonPresent() {
        return loginButton.isDisplayed();
    }

    public LoginScreen2 complexLogin2(Auth auth) {
        should(emailEditText,20);
        type(emailEditText,auth.getEmail());
        type(passwEditText,auth.getPassword());
        hideKeyBoard();
        loginButton.click();

        return this;
    }
  public boolean isMassageNegativeErrorPresent(){

     String mas = massageError.getText();
     return mas.equals("Wrong email or password");
  }
  public LoginScreen2 clickBtnOK(){
        buttonOK.click();
        return this;
  }
}
