package com.Actitime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.Generics.BasePage;

public class ActitimesLeaveTypes extends BasePage
{
	public WebDriver driver;
@FindBy(xpath = "//span[.='Create Leave Type']")
private WebElement CreateLeaveType;

public ActitimesLeaveTypes(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void CreateLeaveTypemethod()
{
	visibilityofElement(driver, CreateLeaveType);
	CreateLeaveType.click();
}
}
