import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="rahul";
		//String password="rahulshettyacademy";
		//System.setProperty("webdriver.edge.driver", "C:\\Selenium_2024\\edgedriver_win64 (1)\\msedgedriver.exe");
		//WebDriver driver= new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();

	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String retrievePassword=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String[] passArray=retrievePassword.split("'");
		String password=passArray[1].split("'")[0];
		return password;
		
	}

}
