package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[1]/form/p[1]/input")
    WebElement username;
    @FindBy(xpath = "/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[1]/form/p[2]/span/input")
    WebElement password;
    @FindBy(xpath = "/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[1]/form/p[3]/button")
    WebElement btnLogin;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement btnLogout;

    @FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    WebElement txtDashboard;

    @FindBy(xpath = "//div[@id='primary']//li[1]")
    WebElement txtInvalidCredentials;


    public void logout(){
        btnLogout.click();
    }

    public void enterUsername(String username){
        this.username.sendKeys(username);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }

    public String getAtributUsername(){
        return username.getAttribute("required"); // return true, value dari required
    }

}
