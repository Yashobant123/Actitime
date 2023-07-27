package com.Actitime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.Generics.BasePage;

public class ActitimeCreateTypeOfWork extends BasePage
{
	public WebDriver driver;
//declaration
@FindBy(xpath = "//span[.='Create Type of Work']")
private WebElement CreateTypeOfWork;

@FindBy(xpath = "//a[.='Marketing']/../..//a[contains(text(),'delete')]")
private WebElement DeleteTypeOfWork;

//initialization
public ActitimeCreateTypeOfWork(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

//utilization
public void CreateTypeOfWorkmethod() throws InterruptedException
{
	visibilityofElement(driver, CreateTypeOfWork);
	CreateTypeOfWork.click();
}
public void DeleteTypeOfWorkMethod() throws InterruptedException
{
	visibilityofElement(driver,DeleteTypeOfWork);
	DeleteTypeOfWork.click();
}
public void DeleteTypesOfWorkAlertConfirmation()
{
	driver.switchTo().alert().accept();
}
	
}
