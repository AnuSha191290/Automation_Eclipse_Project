
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
	 // TODO Auto-generated method stub
	//	WebDriver driver=new ChromeDriver();
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		driver.findElement(By.xpath("//div[@class='h--msg']/p/a")).click();
		driver.findElement(By.cssSelector("a[class='button-primary']")).click();
		Select account_type = new Select(driver.findElement(By.id("activateAccount")));
		account_type.selectByVisibleText("Investment");
		driver.findElement(By.id("activateCardNumber-input")).sendKeys("1234");
		driver.findElement(By.id("activateFirstName-input")).sendKeys("Anu");
		driver.findElement(By.id("activateLastName-input")).sendKeys("Sharma");
		driver.findElement(By.id("dateOfBirth-input")).sendKeys("19951005");
		driver.findElement(By.cssSelector("span[class='ButtonCorestyle__StyledButtonCoreBlock-canvas-core__sc-v39ho0-1 eJzgIP ButtonCore__block']")).click();
        WebElement text = driver.findElement(By.cssSelector("div[class='TextBodystyle__Text-canvas-core__sc-xx5i8s-0 gxqSRH TextBody__text _1B_0odpLQ61GpNiG9a5ZYI ']"));
		System.out.println("Error Message:"+ text.getText());
        Alert alert = driver.switchTo().alert();
		
		String alertMessage= driver.switchTo().alert().getText();
		
	//	System.out.println(alertMessage);

	}

}
