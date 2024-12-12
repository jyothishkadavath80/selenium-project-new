package seleniumprojectnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoappbyapplitool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.applitools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("arjun");
		driver.findElement(By.id("password")).sendKeys("aavaniarju");
		driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[1]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"log-in\"]")).click();
		

	}

}
