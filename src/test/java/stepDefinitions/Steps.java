package stepDefinitions;

import Com.Test.Sreelekha.LoginPage;
import Com.Test.Sreelekha.OrderTshirt;
import Com.Test.Sreelekha.UpdatePersonalInfo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps extends BaseClass
{
    //Steps for login page
    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);

    }

    @When("User opens the URL {string}")
    public void user_opens_the_url(String url) {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String pwd) {
        lp.setUserName(email);
        lp.setPassword(pwd);
    }

    @When("Click on Login button")
    public void click_on_login_button() {
        lp.ClickLogin();

    }

    @Then("User will be navigated to {string}")
    public void user_will_be_navigated_to(String title) {
        if (driver.getPageSource().contains("Authentication failed")) {
            driver.close();
            Assert.assertTrue(false);
        } else {
            Assert.assertEquals(title, driver.getTitle());
        }

    }

    @When("User clicks on Signout link")
    public void user_clicks_on_signout_link() throws InterruptedException {
        lp.Clicksignout();
        Thread.sleep(3000);
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.quit();
    }


//steps for Update Personal information

    @When("User clicks on My personal information menu")
    public void user_clicks_on_my_personal_information_menu() {
        updtinfo=new UpdatePersonalInfo(driver);
        updtinfo.clickOnpersonalInfo();

    }
    @When("update Firstname as {string} and Current Password as {string}")
    public void update_firstname_as_and_current_password_as(String Firstname, String Password) {
        updtinfo.setFirstname(Firstname);
        updtinfo.setPassword(Password);
    }
    @Then("click on Save button")
    public void click_on_save_button() throws InterruptedException {
        updtinfo.clickonsave();
        Thread.sleep(2000);
    }
    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String message) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
                .contains("Your personal information has been successfully updated"));

    }

//Steps for Ordering a T-shirt and viewing the order

    @When("User clicks on T-shirts link")
    public void userClicksOnTShirtsLink() throws InterruptedException {
        OrdTshirt=new OrderTshirt(driver);
        OrdTshirt.clickonTshirts();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
    }

    @When("User selects the Quick view option")
    public void user_selects_the_quick_view_option() {
       OrdTshirt.quickViewicon();
    }

    @When("User clicks on More button")
    public void userClicksOnMoreButton() {
        OrdTshirt.morebtn();
        driver.manage().window().maximize();
    }
    @When("clicks on Add to cart button")
    public void clicks_on_add_to_cart_button() throws InterruptedException {
        OrdTshirt.addToCart();
        Thread.sleep(5000);
        driver.navigate().refresh();
    }

    @Then("User clicks on Proceed to checkout button")
    public void user_clicks_on_proceed_to_checkout_button() {
            OrdTshirt.proceedToCheckOut();
    }
    @When("User clicks on Cart menu")
    public void userClicksOnCartMenu() {
        OrdTshirt.CartMenuClick();

    }
    @Then("User clicks on Proceed to checkout button in Summary Page")
    public void user_clicks_on_proceed_to_checkout_button_in_summary_page() throws InterruptedException {
        OrdTshirt.CheckoutProceed();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);

    }
    @Then("User clicks on Proceed to checkout button in Address Page")
    public void user_clicks_on_proceed_to_checkout_button_in_address_page() throws InterruptedException {
        OrdTshirt.CheckoutProceedaddpage();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);

    }
    @Then("Users ticks the checkbox for terms and conditions")
    public void users_ticks_the_checkbox_for_terms_and_conditions() {
        OrdTshirt.checkTermsConditions();

    }
    @Then("User clicks on Proceed to checkout button in Shipping Page")
    public void user_clicks_on_proceed_to_checkout_button_in_shipping_page() {
       OrdTshirt.CheckoutProceedshppage();
    }

    @And("User chooses the Payment Option as paymentoption")
    public void userChoosesThePaymentOptionAsPaymentoption() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        OrdTshirt.payByBankwire();
    }
    @Then("User clicks on Confirm my Order button")
    public void user_clicks_on_confirm_my_order_button() {
        OrdTshirt.confirmOrder();

    }
    @When("User clicks on Back to Orders button")
    public void user_clicks_on_back_to_orders_button() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        OrdTshirt.backToOrders();

    }
}
