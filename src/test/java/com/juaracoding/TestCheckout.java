package com.juaracoding;

import com.juaracoding.pages.CheckoutPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class TestCheckout {
    static WebDriver driver;
    static ExtentTest extentTest;
    static CheckoutPage checkoutPage = new CheckoutPage();
    public TestCheckout(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click cart page")
    public void user_click_cart(){
        checkoutPage.clickBtnCartPage();
        extentTest.log(LogStatus.PASS, "User click cart page");
    }
    @And("User click checkout")
    public void user_click_checkout(){
        checkoutPage.clickBtnCheckout();
        extentTest.log(LogStatus.PASS, "User click checkout");
    }
    @And("User enter valid first name")
    public void user_enter_valid_first_name(){
        checkoutPage.enterFirstName("Muhammad");
        extentTest.log(LogStatus.PASS, "User enter valid first name");
    }
    @And("User enter valid last name")
    public void user_enter_valid_last_name(){
        checkoutPage.enterLastName("Iwan");
        extentTest.log(LogStatus.PASS, "User enter valid last name");
    }
    @And("User enter company name")
    public void user_enter_valid_company_name(){
        checkoutPage.enterCompanyName("Jaya Sejahtera");
        extentTest.log(LogStatus.PASS, "User enter company name");
    }
    @And("User select country")
    public void user_select_country() {
        checkoutPage.selectCountry();
        extentTest.log(LogStatus.PASS, "User select country");
    }
    @And("User enter street address")
    public void user_enter_street_address(){
        checkoutPage.enterStreetAddress("Jalan Mayapada No.13");
        extentTest.log(LogStatus.PASS, "User enter street address");
    }
    @And("User enter city name")
    public void user_enter_city(){
        checkoutPage.enterCityName("Padang");
        extentTest.log(LogStatus.PASS, "User enter city name");
    }
    @And("User select province")
    public void user_select_province() {
        checkoutPage.selectProvince();
        extentTest.log(LogStatus.PASS, "User select province");
    }
    @And("User enter postcode")
    public void user_enter_postcode(){
        checkoutPage.enterPostcode("25223");
        extentTest.log(LogStatus.PASS, "User enter postcode");
    }
    @And("User enter phone number")
    public void user_enter_phone_number(){
        checkoutPage.enterPhoneNumber("082285477825");
        extentTest.log(LogStatus.PASS, "User enter phone number");
    }
    @And("User enter email address")
    public void user_enter_email_address(){
        checkoutPage.enterEmail("muhammadiwan27@gmail.com");
        extentTest.log(LogStatus.PASS, "User enter email address");
    }
    @And("User select terms and condition")
    public void user_select_terms_and_contion() {
        checkoutPage.selectTermsAndCondition();
        extentTest.log(LogStatus.PASS, "User select terms and contion");
    }
    @Then("User click place order")
    public void user_click_place_order(){
        checkoutPage.clickPlaceOrder();
        extentTest.log(LogStatus.PASS, "User click place order");
    }
}
