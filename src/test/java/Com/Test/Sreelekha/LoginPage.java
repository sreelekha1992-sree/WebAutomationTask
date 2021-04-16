package Com.Test.Sreelekha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    //List of locators for Login feature
    @FindBy(id = "email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "passwd")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(xpath = "//a[@title='Log me out']")
    @CacheLookup
    WebElement lnkSignout;

    //Actions using the locators in Login page
    public void setUserName(String uname) {
        txtEmail.clear();
        txtEmail.sendKeys(uname);
    }
    public void setPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }
    public void ClickLogin(){
        btnLogin.click();
    }
    public void Clicksignout(){
        lnkSignout.click();
    }
}


