package com.Actitime.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCustomersAndProject 
{
	public WebDriver driver;
@FindBy(xpath = "//div[@class='addNewButton']")
private WebElement AddNewButton;

@FindBy(xpath = "//div[@class='item createNewCustomer']")
private WebElement newcustomer;

@FindBy(xpath = "//div[@class='item createNewProject']")
private WebElement NewProjectButton;

@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]")
private WebElement SearchBar;

@FindBy(xpath = "(//div[.='Big Bang Company'])[2]/../../..//span[contains(text(),'Yashobant')]")
private WebElement HighlightedProjectName;

@FindBy(xpath = "(//div[contains(text(),'Yashobant')])[2]/..//div[@class='editButton']")
private WebElement CreatedProjectEditButton;

@FindBy(xpath = "(//div[.='Yashobant'])[4]/../../..//div[@class='actionButton']")
private WebElement CreatedProjectnameActionButton;

@FindBy(xpath = "(//div[.='Delete'])[3]")
private WebElement CreatedProjectDeleteButton;

@FindBy(xpath = "//span[.='Delete permanently']/..")
private WebElement CreatedProjectDeletePermanentlyButton;

@FindBy(xpath = "//span[contains(text(),'Yashobant')]")
private WebElement HighLightedOption;

public ActitimeCustomersAndProject(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void AddNewButtonmethod()
{
	AddNewButton.click();
}
public void newcustomermethod()
{
	newcustomer.click();
}
public void NewProjectButton() 
{
	NewProjectButton.click();
}
public void SearchBar()
{
	SearchBar.sendKeys("Yashobant");
}
public void HighlightedProjectName() throws InterruptedException
{
	Thread.sleep(2000);
	HighlightedProjectName.click();
}
public void CreatedProjectEditButton() throws InterruptedException
{
	Thread.sleep(2000);
	CreatedProjectEditButton.click();
}
public void CreatedProjectnameActionButton() throws InterruptedException
{
	Thread.sleep(2000);
	CreatedProjectnameActionButton.click();
}
public void CreatedProjectDeleteButton() throws InterruptedException
{
	Thread.sleep(2000);
	CreatedProjectDeleteButton.click();
}
public void CreatedProjectDeletePermanentlyButton() throws InterruptedException 
{
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",CreatedProjectDeletePermanentlyButton);
}
public void Highlightedoption() throws InterruptedException
{
	Thread.sleep(3000);
	HighLightedOption.click();
}
}
