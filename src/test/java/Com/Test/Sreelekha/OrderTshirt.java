package Com.Test.Sreelekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class OrderTshirt {

    public WebDriver ldriver;


    public OrderTshirt(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    //List of locators for OrderTshirt feature
    By tshirt_link = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    By more_btn = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[2]/span");
    By add_to_cart_btn = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By Cart_menu = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    By check_out_proceed = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    By check_out_proceed_add_page = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
    By check_terms_conditions_box = By.xpath("//*[@id=\"cgv\"]");
    By check_out_proceed_shpng_page = By.xpath("//*[@id=\"form\"]/p/button/span");
    By pay_option_bankwire_optn = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
    By pay_option_check_optn = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
    By confirm_my_order_btn = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
    By back_to_orders_btn = By.xpath("//*[@id=\"center_column\"]/p/a");


    //Action Methods using the locators in OrderTshirtpage

    public void clickonTshirts() {
        ldriver.findElement(tshirt_link).click();
    }

    public void quickViewicon() {
        WebElement addtocartbtn = ldriver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
        Actions action = new Actions(ldriver);
        action.moveToElement(addtocartbtn).perform();
    }
    public void morebtn(){
        ldriver.findElement(more_btn).click();
    }
    public void addToCart(){
        ldriver.findElement(add_to_cart_btn).click();
    }

    public void proceedToCheckOut() {
        WebElement prcdchkbtn = ldriver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        Actions action = new Actions(ldriver);
        action.moveToElement(prcdchkbtn).perform();
    }
    public void CartMenuClick(){
        ldriver.findElement(Cart_menu).click();
    }

    public void CheckoutProceed(){
     ldriver.findElement(check_out_proceed).click();
    }
    public void CheckoutProceedaddpage(){
        ldriver.findElement(check_out_proceed_add_page).click();
    }
    public void checkTermsConditions(){
        ldriver.findElement(check_terms_conditions_box).click();
    }
    public void CheckoutProceedshppage(){
        ldriver.findElement(check_out_proceed_shpng_page).click();
    }
    public void payByBankwire(){
        ldriver.findElement(pay_option_bankwire_optn).click();
    }
    public void payByCheck(){
        ldriver.findElement(pay_option_check_optn).click();
    }
    public void confirmOrder(){
        ldriver.findElement(confirm_my_order_btn).click();
    }
    public void backToOrders(){
        ldriver.findElement(back_to_orders_btn).click();
    }
}
