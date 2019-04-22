package Tests;

import org.openqa.selenium.WebDriver;

import pages.LoginPageFactory;

public class LoginFactory {
	
	String username = "shaswatasaha24@gmail.com";
	String password = "Fight2liv";
	
	public void loginTestPageFactory() {
		// 1. Initialize driver
		WebDriver driver = utilities.DriverFactory.open("Chrome");
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		//2. Enter Login
		LoginPageFactory loginPage = new LoginPageFactory(driver);//pass driver
		loginPage.login(username,password);
	}

}
