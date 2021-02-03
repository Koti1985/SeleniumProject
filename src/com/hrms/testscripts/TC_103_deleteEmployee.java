package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class TC_103_deleteEmployee {
	public General g;
	
	@Test(priority=4)
	public void login_TC103() throws Exception{
		DOMConfigurator.configure("Log4j.xml"); //for logs
		g = new General();
		g.openApplication();
		g.verifyTitle("OrangeHRM - New Level of HR Management");
		g.login();
		g.verifyTitle("OrangeHRM");
	}
	
	@Test(priority=5)
	public void delEmp() throws Exception{
		g.deleteEmployee();
	}
	
	@Test(priority=6)
	public void logout_TC103() {
		g.logout();
		g.closeBrowser();
	}
}
