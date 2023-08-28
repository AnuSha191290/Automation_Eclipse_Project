import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class Practice_for_final_project {

	
		// TODO Auto-generated method stub

		
		
		public static void main(String[] args) throws InterruptedException {
		    String baseURL = "https://demowebshop.tricentis.com/";
			WebDriver driver=new SafariDriver();
			driver.get(baseURL);
			driver.manage().window().maximize();
			
			
			driver.findElement(By.xpath("//div[@class='block block-category-navigation']/div[2]/ul/li[6]/a")).click();
			
			Thread.sleep(1000);
// 
//			List<WebElement> jewellery_list = driver.findElements(By.xpath("//div[@class='product-item']/div[2]/h2"));
//			for(int i =0;i<jewellery_list.size();i++) {
//				
//				 System.out.println(jewellery_list.size()); 
//
//				 String jewellery_products = jewellery_list.get(i).getText(); 
//				 System.out.println(jewellery_products); 
//			 
//			}
		
		  
			//Click on add to cart -Add any three items
			WebElement btn_cart = driver.findElement(By.cssSelector(".item-box:nth-child(2) .button-2"));
			btn_cart.click();
	}

}
