package com.Actitime.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.Generics.Autoconstant;
import com.Actitime.Generics.BasePage;
import com.Actitime.Generics.Excellibrary;
import com.Actitime.Generics.Utility;

public class ActitimeLoginpage extends BasePage implements Autoconstant
{
	public WebDriver driver;
 @FindBy(name="username")
 private WebElement usernameTextField;
 
 @FindBy(name="pwd")
 private WebElement passwordTextField;
 
 @FindBy(id="keepLoggedInCheckBox")
 private WebElement keepLoggedInCheckBox;
 
 @FindBy(id="loginButton")
 private WebElement loginButton;
 
 @FindBy(id="toPasswordRecoveryPageLink")
 private WebElement Forgotyourpasswordlink;
 
 @FindBy(xpath="//a[.='actiTIME Inc.']")
 private WebElement actiTIMEInclink;
 
 
 //initialization
 
 public ActitimeLoginpage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this); 
 }
 
 //utilization
 
 public void loginmethod() throws IOException, InterruptedException
 {
	Utility.highlightElement(driver, usernameTextField);
	usernameTextField.sendKeys(Excellibrary.getCellValue(sheet_name_login,1, 0));
	
	visibilityofElement(driver, passwordTextField);
	passwordTextField.sendKeys(Excellibrary.getCellValue(sheet_name_login, 1, 1));
	
	visibilityofElement(driver, loginButton);
	javascriptClick(driver, loginButton);
 }
 
 public void ForgotPasswordmethod()
 {
	 Forgotyourpasswordlink.click();
 }
 public void actiTIMEInclink()
 {
	 actiTIMEInclink.click();
 }
}
