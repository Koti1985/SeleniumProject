package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.utility.Log;

public class General extends Global{
	public void openApplication() throws Exception {
		Log.info("****** Started Execution ****");
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to(url);
		Reporter.log("Application Opened");
		Log.info("Application Opened successfully");
		Thread.sleep(3000);
	}
	
	public void closeBrowser() {
		driver.quit();
		Log.info("Application closed.... ***** Stop Execution *****");
	}
	
	public void login() throws Exception{
		driver.findElement(By.name(txt_UserName)).sendKeys(userName);
		driver.findElement(By.xpath(txt_Password)).sendKeys(pwd);
		driver.findElement(By.xpath(btn_login)).click();
		Thread.sleep(3000);
		Reporter.log("Log in completed");
		Log.info("Log in completed");
	}
	
	public void verifyTitle(String title) {
		if (driver.getTitle().equals(title)) {
			Reporter.log("Title matched");
			Log.info("Title matched");
		}
		else {
			Reporter.log("Title not matched. Expected title is -- " + driver.getTitle());
			Log.info("Title not matched. Expected title is -- " + driver.getTitle());
		}
	}
	
	public void logout() {
		driver.findElement(By.linkText(link_Logout)).click();
		Reporter.log("Logout completed");
		Log.info("Logout completed");
	}
	
	public void navigatAddEmployee() throws Exception{
		element = driver.findElement(By.linkText(submenu_PIM));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText(submenu_AddEmp)).click();
		Thread.sleep(3000);
		
		Reporter.log("Add employee submenu clickd");
		Log.info("Add employee submenu clickd");
	}
	
	public void AddEmployee() throws Exception{
		//move to iframe
		driver.switchTo().frame(iframe_id);
		
		String empid =  driver.findElement(By.xpath(txt_empid)).getAttribute("value");
		System.out.println("Add Employee page opened and new emp id is: " + empid);
		
		//add employee details
		driver.findElement(By.xpath(txt_empLastname)).sendKeys(empFirstName);
		Thread.sleep(3000);
		driver.findElement(By.xpath(txt_empFirstname)).sendKeys(empLastName);
		//add photo
		driver.findElement(By.xpath(txt_empPhotoid)).sendKeys(empPhotofile);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(btn_empSubmit)).click();
		Thread.sleep(3000);
		
		//verify added emp sucess or not
		if(driver.findElement(By.xpath(lbl_PersonalDetailsPage)).getText().equals("Personal Details"))
		{
			Reporter.log("New Employee Added Successfully");
			Log.info("New Employee Added Successfully");
			
			//back button click to display emp info page
			driver.findElement(By.xpath(btn_back)).click();
		}
		else
		{
			Reporter.log("Not added new employee... some error");
			Log.info("Not added new employee... some error");
		}

		// exit from frame
		driver.switchTo().defaultContent();

	}
	
	public void deleteEmployee() throws Exception {
		//move to iframe
		driver.switchTo().frame(iframe_id);
		//select 3rd row record
		driver.findElement(By.xpath(chk_employeerow)).click();
		//delete button
		driver.findElement(By.xpath(btn_delete)).click();
		Thread.sleep(2000);
		
		// exit from frame
		driver.switchTo().defaultContent();
		
		Reporter.log("Employee Deleted successfully");
		Log.info("Employee Deleted successfully");
	}
}
