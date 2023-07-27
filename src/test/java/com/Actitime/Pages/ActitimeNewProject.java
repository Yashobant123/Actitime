package com.Actitime.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeNewProject 
{
	public WebDriver driver;
	
//Declaration
@FindBy(xpath = "//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
private WebElement EnterProjectNameTextfield;

@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
private WebElement DropDownarrowButton;

@FindBy(xpath ="//div[@class='itemRow cpItemRow ']")
private List<WebElement> DropdownList;

@FindBy(xpath = "//div[.='Create Project']")
private WebElement CreateProjectButton;

//initialization
public ActitimeNewProject(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

//Utilization
public void EnterProjectNameTextfield() throws InterruptedException
{
	Thread.sleep(2000);
    EnterProjectNameTextfield.sendKeys("Yashobant");
}
public void DropDownarrowButton()
{
	DropDownarrowButton.click();
}
public void DropdownList() throws InterruptedException 
{
	for(int i=0;i<DropdownList.size();i++)
	{
	   if(DropdownList.get(i).getText().equalsIgnoreCase("Big Bang Company"))
	   {
		   Thread.sleep(3000);
		   DropdownList.get(i).click();
		   break;
	   }
	}
}
public void CreateProjectButton()
{
	CreateProjectButton.click();
}
}
