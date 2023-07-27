package com.Actitime.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Actitime.Generics.BaseTest;
import com.Actitime.Pages.ActitimeHomePage;
import com.Actitime.Pages.ActitimeLoginpage;

public class Actitime_LoginLogout extends BaseTest
{
	@Test
	public void LoginLogout() throws IOException, InterruptedException
	{
	ActitimeLoginpage loginpage=new ActitimeLoginpage(driver);
	loginpage.loginmethod();
	
	ActitimeHomePage homepage=new ActitimeHomePage(driver);
	homepage.logoutmethod();
	}
}
