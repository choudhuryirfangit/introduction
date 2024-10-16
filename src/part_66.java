import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class part_66 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("div[data-testid='one-way-radio-button']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[text()='Kangra Airport']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[text()='Netaji Subhash Chandra Bose International Airport']")).click();
//		Assert.assertEquals(driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div[2]")).getText(), "Dharamshala (DHM)");
//		Assert.assertEquals(driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div")).getText(), "Netaji Subhash Chandra Bose International Airport");
//		driver.quit();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).click();
		Thread.sleep(1000);
		int i=0;
		while(i<4) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("div[class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'] div[class='css-1dbjc4n r-zso239'] svg g:nth-child(1)")).click();
//		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
//		Thread.sleep(1000);
		driver.quit();
	
	}
}
