package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
    private WebDriver driver;
    public ItemPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    WebElement homepage;
    @FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    WebElement item1;
    @FindBy(xpath = "//a[normalize-space()='red satin round neck backless maxi dress']")
    WebElement item2;
    @FindBy(xpath = "//select[@id='pa_color']//option[@value='grey']")
    WebElement itemColor1;
    @FindBy(xpath = "//select[@id='pa_color']//option[@value='red']")
    WebElement itemColor2;
    @FindBy(xpath = "//select[@id='pa_size']//option[@value='42']")
    WebElement itemSize1;
    @FindBy(xpath = "//select[@id='pa_size']//option[@value='medium']")
    WebElement itemSize2;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement itemAddToCart;



    public void clickBtnHomepage() {
        homepage.click();
    }
    public void clickItem1() {
        item1.click();
    }
    public void clickItemColor1() {
        itemColor1.click();
    }
    public void clickItemSize1() {
        itemSize1.click();
    }
    public void clickItem2() {
        item2.click();
    }
    public void clickItemColor2() {
        itemColor2.click();
    }
    public void clickItemSize2() {
        itemSize2.click();
    }
    public void clickItemChosen() {
        itemAddToCart.click();
    }
}
