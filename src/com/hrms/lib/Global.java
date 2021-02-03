package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Global {
		//variables
		public WebDriver driver;
		public WebElement element;
		public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
		public String userName = "admin";
		public String pwd = "admin";
		
		public String empFirstName = "Rajesh";
		public String empLastName = "CP";
		public String empPhotofile = "D:\\Selenium docs\\Sample Images\\pic3.png";
		
		//log in page objects
		public String txt_UserName = "txtUserName";
		public String txt_Password = "//input[@name='txtPassword']";
		public String btn_login = "//input[@type='Submit']";
		public String link_Logout = "Logout";
		
		//add employee objects
		public String submenu_PIM = "PIM";
		public String submenu_AddEmp = "Add Employee";
		public String txt_empid = "//*[@id=\"txtEmployeeId\"]";
		public String txt_empLastname = "//*[@id='txtEmpLastName']";
		public String txt_empFirstname = "//*[@name='txtEmpFirstName']";
		public String txt_empPhotoid = "//*[@id=\"photofile\"]";
		public String btn_empSubmit = "//*[@id='btnEdit']";
		public String lbl_PersonalDetailsPage = "//*[@id=\"personal\"]/div[1]/div[2]/div[1]/h2";
		public String btn_back = "/html/body/div[5]/input";
		
		//delete emplyee objects
		public String iframe_id = "rightMenu";
		public String chk_employeerow = "//*[@id=\"standardView\"]/table/tbody/tr[3]/td[1]/input";
		public String btn_delete = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";
		
		
}

