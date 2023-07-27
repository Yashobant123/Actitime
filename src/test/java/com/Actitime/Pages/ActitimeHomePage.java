package com.Actitime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.Generics.BasePage;

public class ActitimeHomePage extends BasePage
{
	public WebDriver driver;
@FindBy(xpath="'//div[@class='logoSwitcherText']'")
private WebElement logoSwitcherText;

@FindBy(xpath="//div[.='Time-Track']")
private WebElement timeTrack;

@FindBy(xpath="//div[.='Tasks']")
private WebElement tasks;

@FindBy(xpath="//div[.='Reports']")
private WebElement reports;

@FindBy(xpath="//div[.='Users']")
private WebElement users;

@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_calendar']")
private WebElement calenderButton;

@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings ']")
private WebElement settingsButton;

@FindBy(xpath="//a[.='Types of Work']")
private WebElement TypesOfWork;

@FindBy(xpath = "//a[.='Leave Types']")
private WebElement LeaveTypes;

@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_addons']")
private WebElement addonBuuton;

@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_support']")
private WebElement supportButton;

@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_tips']")
private WebElement tipsButton;

@FindBy(id="logoutLink")
private WebElement logout;

//initialization

public ActitimeHomePage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

//utilization

public void tasksmethod() throws InterruptedException
{
	visibilityofElement(driver, tasks);
	tasks.click();
}

public void settingsmethod() throws InterruptedException
{
	visibilityofElement(driver, settingsButton);
	settingsButton.click();
}

public void TypesOfWorkmethod() throws InterruptedException
{
	visibilityofElement(driver,TypesOfWork );
	TypesOfWork.click();
}

public void LeaveTypesmethod() throws InterruptedException
{
	visibilityofElement(driver, LeaveTypes);
	LeaveTypes.click();
}

public void logoutmethod() throws InterruptedException
{
    visibilityofElement(driver, logout);
	logout.click();
}

}
