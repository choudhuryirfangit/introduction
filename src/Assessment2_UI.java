import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment2_UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Irfan_C");
		driver.findElement(By.name("email")).sendKeys("irfan@email.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("irfan123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement options=driver.findElement(By.id("exampleFormControlSelect1"));
		Select Option=new Select(options);
		Option.selectByIndex(0);
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("08021999");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
