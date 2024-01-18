import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductsPage;

import pages.loginPage;

public class ProductsTestCases extends BaseTests {
	

WebDriver driver=new ChromeDriver();
	@Test(enabled = false)
	public void CheckImageVisiblty() throws InterruptedException {


		// Create an instance of the product page
		 productsPage = new ProductsPage(driver);

		Assert.assertEquals((productsPage.ImageProductIsVisible()), true);

	}

	@Test()
	public void CheckButtonsNotClicked() throws InterruptedException {

		// Create an instance of the product page
		productsPage = new ProductsPage(driver);

		Assert.assertEquals(productsPage.AddToCartNotClicked(), true, "one or more buttons is already clicked ");

	}

	@Test(priority = 1,enabled = false)

	public void AddALLItems() throws InterruptedException {
//		 loginPage=new loginPage(driver);
//NavigateTo();	
//		
//		loginPage.enterUsername(username);
//		loginPage.enterPassword(Password);
//		loginPage.clickLogin();
		
		// Create an instance of the product page
	productsPage=new ProductsPage(driver);
		   System.out.println("this is do add to cart test");
		
		Assert.assertEquals((productsPage.AddAllItems()), true, "something wrong on click add to cart button ");

	}

	@Test(priority = 2, enabled = false)

	public void CheckdescriptionOfProduct() throws InterruptedException {

	sleep(3000);
		// Create an instance of the product page
		 productsPage = new ProductsPage(driver);

		Assert.assertEquals((productsPage.DescriptionOfProductIsVisible()), true, "description not visible ");

	}

	@Test(priority = 3, enabled = false)
	public void checkPricesOfproducts() {

		ProductsPage ProductsPage = new ProductsPage(driver);

		Assert.assertEquals((ProductsPage.PriceOfProductIsVisible()), true, "prices not visible ");

	}
}
