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

public class ActitimeCreateNewTypeofWork extends BasePage implements Autoconstant
{
public WebDriver driver;
	//declaration
@FindBy(id = "name")
private WebElement Nametextfield;

@FindBy(xpath = "//input[@type='submit']")
private WebElement createtypeofworkbutton;

@FindBy(xpath = "//input[@onclick='handleCancel();']")
private WebElement CancelButton;

//initialization
public ActitimeCreateNewTypeofWork(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);

}

//utilization
public void Nametextfieldmethod() throws InterruptedException, IOException
{
	Utility.highlightElement(driver, Nametextfield);
	Nametextfield.sendKeys(Excellibrary.getCellValue(sheet_name_customer, 1, 2));
}
public void createtypeofworkbuttonmethod()
{
	visibilityofElement(driver, createtypeofworkbutton);
	createtypeofworkbutton.click();
}
}
