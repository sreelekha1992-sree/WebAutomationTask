package Com.Test.Sreelekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UpdatePersonalInfo {

    public WebDriver ldriver;

    public UpdatePersonalInfo(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    //List of locators on update personal info feature

    By my_personal_info = By.xpath("//a[@title='Information']");
    By first_name_txtfield = By.xpath("//*[@id=\"firstname\"]");
    By current_password = By.xpath("//*[@id=\"old_passwd\"]");
    By save_btn = By.xpath("//span[text()='Save']");

    //Action Methods using locators in UpdatePersonalInfo page

    public void clickOnpersonalInfo(){
        ldriver.findElement(my_personal_info).click();
    }

    public void setFirstname(String firstname){
        ldriver.findElement(first_name_txtfield).sendKeys(firstname);
    }

    public void setPassword(String pwd) {
        ldriver.findElement(current_password).sendKeys(pwd);
    }
    public void clickonsave(){
        ldriver.findElement(save_btn).click();
    }

}
