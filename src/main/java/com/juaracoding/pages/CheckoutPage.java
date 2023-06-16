package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"nav-menu-item-cart\"]/a/span/i")
    WebElement cartPage;
    @FindBy(xpath = "//a[normalize-space()='Proceed to checkout']")
    WebElement btnCheckout;
    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='billing_company']")
    WebElement company;
    @FindBy(xpath = "//span[@aria-label='Country / Region']")
    WebElement country;
    @FindBy(xpath = "(//input[@id='billing_address_1'])[1]")
    WebElement streetAddress;
    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement city;
    @FindBy(xpath = "((//span[@id='select2-billing_state-container'])[1]")
    WebElement province;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement postcode;
    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phone;
    @FindBy(xpath = "//input[@id='billing_email']")
    WebElement emailAddress;
    @FindBy(xpath = "(//input[@id='terms'])[1]")
    WebElement termsAndCondition;
    @FindBy(xpath = "(//button[@id='place_order']")
    WebElement placeOrder;

    public void enterFirstName(String firstname){ this.firstName.sendKeys(firstname);}
    public void enterLastName(String lastname){
        this.lastName.sendKeys(lastname);
    }
    public void enterCompanyName(String companyName){
        this.company.sendKeys(companyName);
    }
    public void enterStreetAddress(String streetAddress){
        this.streetAddress.sendKeys(streetAddress);
    }
    public void enterCityName(String city){
        this.city.sendKeys(city);
    }
    public void enterPostcode(String postcode){
        this.postcode.sendKeys(postcode);
    }
    public void enterPhoneNumber(String phone){
        this.phone.sendKeys(phone);
    }
    public void enterEmail(String email){
        this.emailAddress.sendKeys(email);
    }
    public void clickBtnCartPage() {
        cartPage.click();
    }
    public void clickBtnCheckout() {
        btnCheckout.click();
    }
    public void selectCountry() {
        country.click();
    }
    public void selectProvince() {
        province.click();
    }
    public void selectTermsAndCondition() {
        termsAndCondition.click();
    }
    public void clickPlaceOrder() { placeOrder.click();
    }
}
