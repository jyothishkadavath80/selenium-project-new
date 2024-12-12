package seleniumprojectnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoblazeexam {
	@Test

	public void demoblaze() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver .chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chrome.driver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
		driver.findElement(By.id("sign-username")).sendKeys("rohith kk");
		driver.findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
//		driver.findElement(By.id("loginusername")).sendKeys("arun kumar");
		driver.manage().window().minimize();
		

	}

}
