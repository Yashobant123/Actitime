package com.Actitime.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Actitime.Generics.BaseTest;
import com.Actitime.Pages.ActitimeCreateNewTypeofWork;
import com.Actitime.Pages.ActitimeCreateTypeOfWork;
import com.Actitime.Pages.ActitimeHomePage;
import com.Actitime.Pages.ActitimeLoginpage;

public class ActitimeCreateTypesOfWork extends BaseTest
{
@Test
public void Actitime_CreateAndDeleteTypesOfWork() throws InterruptedException, IOException 
{

	ActitimeLoginpage loginpage=new ActitimeLoginpage(driver);
	loginpage.loginmethod();
	
	ActitimeHomePage homepage=new ActitimeHomePage(driver);
    homepage.settingsmethod();
    homepage.TypesOfWorkmethod();
    

	ActitimeCreateTypeOfWork createtypeofwork=new ActitimeCreateTypeOfWork(driver);
    createtypeofwork.CreateTypeOfWorkmethod();
    
    ActitimeCreateNewTypeofWork TypesOfWork=new ActitimeCreateNewTypeofWork(driver);
    TypesOfWork.Nametextfieldmethod();
    TypesOfWork.createtypeofworkbuttonmethod();
    
    createtypeofwork.DeleteTypeOfWorkMethod();
    createtypeofwork.DeleteTypesOfWorkAlertConfirmation();
    
    homepage.logoutmethod();
}

}
