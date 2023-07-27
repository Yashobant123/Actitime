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

public class ActitimeCreateNewLeaveType extends BasePage implements Autoconstant
{
	public WebDriver driver;
@FindBy(id = "leaveTypeLightBox_nameField")
private WebElement LeaveTypeNameTextField;

@FindBy(id = "leaveTypeLightBox_commitBtn")
private WebElement CreateLeaveTypeButton;

@FindBy(xpath = "//span[.='Paid Leave']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
private WebElement DeleteLeaveType;

public ActitimeCreateNewLeaveType(WebDriver driver)
{
	this.driver=driver;
 PageFactory.initElements(driver,this);	
}

public void LeaveTypeNameTextFieldmethod() throws InterruptedException, IOException
{
	Utility.highlightElement(driver, LeaveTypeNameTextField);
	LeaveTypeNameTextField.sendKeys(Excellibrary.getCellValue(sheet_name_customer, 1, 3));
}

public void CreateLeaveTypeButtonmethod()
{
	visibilityofElement(driver, CreateLeaveTypeButton);
	CreateLeaveTypeButton.click();
}
public void DeleteLeaveTypeMethod() throws InterruptedException
{
	visibilityofElement(driver, DeleteLeaveType);
	DeleteLeaveType.click();
}
public void DeleteLeaveTypesAlertConformation()
{
	driver.switchTo().alert().accept();
}
}
