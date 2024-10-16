//import java.util.ArrayList;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice_15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="Irfan";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Password=getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(Password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("button.submit")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.cssSelector("button.logout-btn"));
		driver.quit();
		

	}
	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		Thread.sleep(3000);
		String PasswordText=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] PasswordArray= PasswordText.split("'");
		String Password=PasswordArray[1].split("'")[0];
		return Password;
		
		
	}

}
