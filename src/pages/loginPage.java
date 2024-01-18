package pages;
import java.sql.Driver;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginPage {
	
	 private WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver=driver;
		
	}


	// locators
	By userNameField = By.id("user-name");
	By PasswordFieldField = By.id("password");
	By loginButton = By.id("login-button");
	//////
	

	//Method to enter usernames
	public void enterUsername(String user) {
		driver.findElement(userNameField).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(PasswordFieldField).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		
		driver.findElement(loginButton).click();
		
	}
	

	
	}

