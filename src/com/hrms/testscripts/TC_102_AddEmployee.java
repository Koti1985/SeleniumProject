package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC_102_AddEmployee{
	public General g;
	
	@Test(priority=1)
	public void login_TC102() throws Exception{
		DOMConfigurator.configure("Log4j.xml"); //for logs
		g = new General();
		g.openApplication();
		g.verifyTitle("OrangeHRM - New Level of HR Management");
		g.login();
		g.verifyTitle("OrangeHRM");
		//g.navigatAddEmployee();
		//g.AddEmployee();
		//g.logout();
		//g.closeBrowser();
	}
	
	
	@Test(priority=2)
	public void addEmp() throws Exception{
		g.navigatAddEmployee();
		g.AddEmployee();
	}
	
	@Test(priority=3)
	public void logout_TC102() {
		g.logout();
		g.closeBrowser();
	}
	
}
