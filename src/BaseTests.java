
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.ProductsPage;
import pages.loginPage;

public class BaseTests {
	protected WebDriver driver;
	protected loginPage loginPage;
	protected ProductsPage productsPage;

	public String username = "error_user";
	public String Password = "secret_sauce";
	public String url = "https://www.saucedemo.com/";

	public void NavigateTo() {

		driver.get(url);
		System.out.println("navigate to");

	}

	public void sleep(int ms) throws InterruptedException {
		Thread.sleep(ms);
	}

	@BeforeSuite
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("this is before suite");
	}

	@AfterSuite
	public void tearDown() {
		// Close the browser
//        if (driver != null) {
//            driver.quit();
//        }
	}

}
