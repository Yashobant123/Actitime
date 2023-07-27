package com.Actitime.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateNewCustomer
{
	public WebDriver driver;
	
@FindBy(xpath = "//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")
private WebElement EnterCustomerNameTextField;

@FindBy(xpath = "//div[.='Create Customer']")
private WebElement CreateCustomerButton;

@FindBy(xpath = "(//div[.='Yashobant'])[1]/../..//div[@class=\"editButton\"]")
private WebElement CustomerEditButton;

@FindBy(xpath = "(//div[.='ACTIONS'])[1]")
private WebElement actions;

@FindBy(xpath="(//div[.='Delete'])[2]")
private WebElement deleteCustomer;

@FindBy(xpath = "//span[contains(text(),'permanently')]")
private WebElement deletepermanently;


public ActitimeCreateNewCustomer(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void EnterCustomerNameTextFieldmethod() throws InterruptedException
{
	
	EnterCustomerNameTextField.sendKeys("Yashobant");
}
public void CreateCustomerButtonmethod() throws InterruptedException
{
	CreateCustomerButton.click();
	Thread.sleep(4000);
}

public void CustomerEditButtonMethod() throws InterruptedException 
{
	CustomerEditButton.click();
	Thread.sleep(4000);
	
}
public void Actionsmethod() throws InterruptedException
{
	actions.click();
    Thread.sleep(4000);
}
public void deleteCusomermehod() throws InterruptedException
{
	deleteCustomer.click();
	Thread.sleep(4000);

}
public void deletepermanentlymethod() 
{

	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", deletepermanently);
}

}
