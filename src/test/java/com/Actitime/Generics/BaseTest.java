package com.Actitime.Generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements Autoconstant
{
	public WebDriver driver;
	@BeforeSuite
	public void executionStart()
	{
		Reporter.log("Execution Started",true);
	}
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void executionComplete()
	{
		Reporter.log("execution completed",true);
	}

}
