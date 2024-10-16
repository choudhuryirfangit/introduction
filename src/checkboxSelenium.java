import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Select a checkbox
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount")).isSelected());
		
		//count the number of checkbox in a page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
//		driver.manage().window().maximize();
//		driver.get("https://www.spicejet.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Assert.assertFalse(driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).isSelected());
//		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).isSelected());
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).isSelected());
//		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).isSelected());
		driver.quit();

		
		
	}

}
