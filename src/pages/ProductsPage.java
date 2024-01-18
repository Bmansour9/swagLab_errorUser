package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ProductsPage  {
	
	private WebDriver driver;
public ProductsPage(WebDriver driver) {
	this.driver=driver;
}

	// locators
	private By CartCounter = By.className("shopping_cart_badge");
	private By Description= By.className("inventory_item_desc");
	private By ImageProduct = By.className("inventory_item_img");
	private By Price = By.className("inventory_item_price");
	private By AddToCart = By.tagName("button");
	private By ContainerofItem = By.className("inventory_list");
	// Actions
	public boolean ImageProductIsVisible() {

		List<WebElement> AllImages = driver.findElements(ImageProduct);
		boolean ResultImg = true;
		for (int i = 0; i < AllImages.size(); i++) {
			if (!AllImages.get(i).isDisplayed()) {
				ResultImg = false;
				break;
			}

		}
		return ResultImg;
	}

	public boolean AddToCartNotClicked() {

		List<WebElement> AllButtons = driver.findElements(AddToCart);
		boolean ResultBtn = true;
		for (int i = 0; i < AllButtons.size(); i++) {
			if (!AllButtons.get(i).getText().equals("Add to cart")) {
				ResultBtn = false;
				break;

			}

		}
		return ResultBtn;
	}

	public boolean AddAllItems() throws InterruptedException {
       

		int c = 0;
WebElement conItems=driver.findElement(ContainerofItem);
		List<WebElement> AllButtons =conItems.findElements(AddToCart);
		boolean ResultBtn = true;
		
		
		for (int i = 0; i < AllButtons.size(); i++) {
			AllButtons.get(i).click();
			c++;
	}
		Thread.sleep(2000);
	int countproducts = Integer.parseInt(driver.findElement(CartCounter).getText());
		if (countproducts == AllButtons.size()) {
		return true;
		} else {
			return false;
		}

	}
	public boolean DescriptionOfProductIsVisible() {

		List<WebElement> AllDes = driver.findElements(Description);
		boolean Resultdes = true;
		for (int i = 0; i < AllDes.size(); i++) {
			if (!AllDes.get(i).isDisplayed()) {
				Resultdes = false;
				break;
			}

		}
		return Resultdes;
	}

	
	
	public boolean PriceOfProductIsVisible() {
		List<WebElement> prices= driver.findElements(Price);
		boolean Resultp = true;
		for (int i = 0; i <prices.size(); i++) {
			if (!prices.get(i).isDisplayed()) {
				Resultp = false;
				break;
			}

		}
		return Resultp;
	}
	
//	public boolean Sorting() {
//		List<WebElement> prices= driver.findElements(Price);
//	
//		return Resultp;
//	}
}
