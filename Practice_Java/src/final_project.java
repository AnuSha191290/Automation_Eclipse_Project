import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class final_project {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://rahulshettyacademy.com/seleniumPractise/#/";
		WebDriver driver=new SafariDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i=0; i< products.size();i++){			
			String name = products.get(i).getText();
			Thread.sleep(2000);
			if (name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text() ='ADD TO CART']")).get(i).click();
			} else if (name.contains("Brocolli")){
				driver.findElements(By.xpath("//button[text() ='ADD TO CART']")).get(i).click();
			} else {
				System.out.println(name);
			}
		}
	}		
}
 
