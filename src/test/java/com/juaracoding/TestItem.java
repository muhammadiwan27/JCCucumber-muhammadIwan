package com.juaracoding;

import com.juaracoding.pages.ItemPage;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;


public class TestItem {

    static WebDriver driver;
    static ExtentTest extentTest;
    static ItemPage itemPage = new ItemPage();
    
    public TestItem(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button homepage")
    public void user_click_homepage_button() {
        itemPage.clickBtnHomepage();
        extentTest.log(LogStatus.PASS, "User click homepage button");
    }
    @And("User click item 1")
    public void user_click_item_1(){
        itemPage.clickItem1();
        extentTest.log(LogStatus.PASS, "User click item 1");
    }
    @And("User choose item 1 color")
    public void user_choose_item_color_1(){
        itemPage.clickItemColor1();
        extentTest.log(LogStatus.PASS, "User choose item 1 color");
    }
    @And("User choose item 1 size")
    public void user_choose_item_size_1(){
        itemPage.clickItemSize1();
        extentTest.log(LogStatus.PASS, "User choose item 1 size");
    }
    @Then("User add item 1 to cart")
    public void user_add_item_1(){
        itemPage.clickItemChosen();
        extentTest.log(LogStatus.PASS, "User add item 1 to cart");
    }
    @And("User click button homepage 1")
    public void user_click_homepage_button_1() {
        itemPage.clickBtnHomepage();
        extentTest.log(LogStatus.PASS, "User click homepage button 1");
    }
    @And("User click item 2")
    public void user_click_item_2(){
        itemPage.clickItem2();
        extentTest.log(LogStatus.PASS, "User click item 2");
    }
    @And("User choose item 2 color")
    public void user_choose_item_color_2(){
        itemPage.clickItemColor2();
        extentTest.log(LogStatus.PASS, "User choose item 2 color");
    }
    @And("User choose item 2 size")
    public void user_choose_item_size_2(){
        itemPage.clickItemSize2();
        extentTest.log(LogStatus.PASS, "User choose item 2 size");
    }
    @Then("User add item 2 to cart")
    public void user_add_item_2() {
        itemPage.clickItemChosen();
        extentTest.log(LogStatus.PASS, "User add item 2 to cart");
    }

}
