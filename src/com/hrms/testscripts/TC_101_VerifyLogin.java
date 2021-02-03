package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_101_VerifyLogin {
	
	@Test
	public void Login_TC101() throws Exception{
		DOMConfigurator.configure("Log4j.xml"); //for logs
		General g = new General();
		g.openApplication();
		g.verifyTitle("OrangeHRM - New Level of HR Management");
		g.login();
		g.verifyTitle("OrangeHRM");
		g.logout();
		g.closeBrowser();
	}
	
}
