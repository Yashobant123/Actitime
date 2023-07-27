package com.Actitime.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Actitime.Generics.BaseTest;
import com.Actitime.Pages.ActitimeCreateNewLeaveType;
import com.Actitime.Pages.ActitimeHomePage;
import com.Actitime.Pages.ActitimeLoginpage;
import com.Actitime.Pages.ActitimesLeaveTypes;

public class Actitime_CreateAndDeleteLeaveTypes extends BaseTest
{
@Test
  public void CreateAndDeleteLeaveTypes() throws IOException, InterruptedException
  {
	ActitimeLoginpage loginpage=new ActitimeLoginpage(driver);
	loginpage.loginmethod();
	
	ActitimeHomePage homepage=new ActitimeHomePage(driver);
    homepage.settingsmethod();
    homepage.LeaveTypesmethod();
    
    ActitimesLeaveTypes LeaveTypes=new ActitimesLeaveTypes(driver);
    LeaveTypes.CreateLeaveTypemethod();
    
    ActitimeCreateNewLeaveType CreateNewLeaveType=new ActitimeCreateNewLeaveType(driver);
    CreateNewLeaveType.LeaveTypeNameTextFieldmethod();
    CreateNewLeaveType.CreateLeaveTypeButtonmethod();
    CreateNewLeaveType.DeleteLeaveTypeMethod();
    CreateNewLeaveType.DeleteLeaveTypesAlertConformation();
    
    homepage.logoutmethod();
    
  }
	

}
