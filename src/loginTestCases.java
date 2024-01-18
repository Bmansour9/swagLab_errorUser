import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import pages.ProductsPage;

import pages.loginPage;

public class loginTestCases extends BaseTests {

	@Test(description = "this is Happy Scenario")
	public void loginTestHappy() throws InterruptedException {
		loginPage = new loginPage(driver);
		// Open the login page
NavigateTo();
		Thread.sleep(3000);

		// Perform login
		loginPage.enterUsername("error_user");
		loginPage.enterPassword("secret_sauce");
		sleep(2000);
		loginPage.clickLogin();
		sleep(2000);

		Assert.assertEquals((driver.getCurrentUrl().contains("inventory.html")), true);

	}

	@Test(description = "this is Sad scenario", enabled = false)
	public void loginTestSad() throws InterruptedException {
		// Open the login page
		NavigateTo();

		// Create an instance of the LoginPage
		loginPage loginPage = new loginPage(driver);

		// Perform login
		loginPage.enterUsername("asdfg");
		loginPage.enterPassword("sadfgrfedwf");
		sleep(5000);
		loginPage.clickLogin();
		sleep(5000);

		Assert.assertEquals((driver.getCurrentUrl().contains("inventory.html")), true);

	}

}