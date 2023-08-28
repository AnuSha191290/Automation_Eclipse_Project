import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class complete_project {


		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			String baseURL = "https://demowebshop.tricentis.com/";
			WebDriver driver=new SafariDriver();
			driver.get(baseURL);
			driver.manage().window().maximize();
			
			// NAMES OF CATEGORIES
			List<WebElement> categoriesList = driver.findElements(By.xpath("//div[@class='block block-category-navigation']/div[2]/ul"));

			for (int i = 0; i< categoriesList.size(); i++) {
				
				String categoryName = categoriesList.get(i).getText();
				
				System.out.println(categoryName);
			}
			
			
			// Signup for newsletter//
			
			driver.findElement(By.cssSelector("input[id='newsletter-email']")).sendKeys("anusharmacan1@gmail.com");
			driver.findElement(By.cssSelector("input[id='newsletter-subscribe-button']")).click();
		
			Thread.sleep(1000);
		
			String successMessage = driver.findElement(By.cssSelector("div[id='newsletter-result-block']")).getText();
			System.out.println("Message:"+successMessage);
			
			
			// CLICK ON JWELLERY
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='block block-category-navigation']/div[2]/ul/li[6]/a")).click();
			
			// NAMES OF JEWELLERY PRODUCTS
			Thread.sleep(1000);
			
			List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-item']/div[2]/h2"));
			
			for (int i=0 ; i< productList.size() ; i++ ) {
			   
				String productName = productList.get(i).getText();
			    
				System.out.println(productName);
					
			}
			
				driver.findElement(By.xpath("//div[@class='product-grid']/div[2]/div/div[2]/div[3]/div[2]/input")).click();
				
				Thread.sleep(1000);

				String addCartSuccess = driver.findElement(By.cssSelector("p.content")).getText();

				System.out.println("Sucess Message:>" + addCartSuccess);
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='product-grid']/div[1]/div/div[2]/div[3]/div[2]/input")).click();
			
				Thread.sleep(2000);
				driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("12");
				
				driver.findElement(By.id("addtocart_71_EnteredQuantity")).sendKeys("2");
				
				Thread.sleep(1000);
				driver.findElement(By.id("add-to-cart-button-71")).click();
				
				Thread.sleep(1000);
				String addCartFirstSuccess = driver.findElement(By.cssSelector("p.content")).getText();
				System.out.println("Sucess Message For 2 and 3:->" + addCartFirstSuccess);
				
				
				driver.findElement(By.xpath("//li[@id='topcartlink']/a/span[1]")).click();
				
				
				Thread.sleep(1000);
				driver.findElement(By.id("termsofservice")).click();
				
				driver.findElement(By.id("checkout")).click();
				
				Thread.sleep(1000);

				
				driver.findElement(By.xpath("//div[@class='customer-blocks']/div[1]/div[3]/input[1]")).click();
				
				
				Thread.sleep(1000);
				driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Anu");
				
				driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Sharma");
				
				driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("anusharmacan1@gmail.com");
				
				driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("XYZ");
				
				Thread.sleep(1000);
				Select country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
				country.selectByVisibleText("Canada");
				
				Thread.sleep(1000);
				Select province = new Select(driver.findElement(By.id("BillingNewAddress_StateProvinceId")));
				province.selectByVisibleText("Quebec");
				
			
				driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Montreal");

				driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("909 Rue Saint");
				
				driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("H4l5E7");
				
				driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("514-876-0987");

				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='billing-buttons-container']/input")).click();

				Thread.sleep(1000);
				driver.findElement(By.id("PickUpInStore")).click();

				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id='shipping-buttons-container']/input")).click();
				
				//choose po
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//ul[@class='method-list']/li[4]/div/div[2]/input")).click();
			
				Thread.sleep(1000);
				driver.findElement(By.xpath("//ul[@class='method-list']/li[1]/div/div[2]/input")).click();
		
				
				driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();

				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/input")).click();

				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();

				Thread.sleep(3000);
				String orderCompleted = driver.findElement(By.xpath("//div[@class='section order-completed']/div[1]")).getText();
				
				System.out.println("Sucess order Completed:>" + orderCompleted);
				
			
			//	driver.findElement(By.partialLinkText(""));
				
				Thread.sleep(10000);
				driver.close();
		
		}
	
			
			
			
}
			
			
			
		
	
