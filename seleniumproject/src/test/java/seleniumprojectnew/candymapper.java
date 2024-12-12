package seleniumprojectnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class candymapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(" webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://candymapper.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"popup-widget238491-close-icon\"]")).click();
		driver.findElement(By.cssSelector("#\\34  > div > svg")).click();
		driver.findElement(By.cssSelector("#n-238369238407-membership-create-account")).click();
		driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[1]/input")).sendKeys("jyothish");
		driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[2]/input")).sendKeys("kadungallur");
		driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[3]/input")).sendKeys("jyothishkadavath@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[4]/input")).sendKeys("8907563412");
		driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[6]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-73089\"]/li[1]/a")).click();
		
		
		//driver.findElement(By.xpath("//div[@class='x-el x-el-div c2-1 c2-2 c2-1b c2-3 c2-4 c2-5 c2-6 c2-7 c2-8']")).sendKeys("jyotish");
		//driver.findElement(By.cssSelector("#input58")).sendKeys("jyothikadungallur@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"bs-8\"]/span/div/div/div/form/div[3]/div/textarea")).sendKeys("hello");	
		driver.findElement(By.xpath("//*[@id=\"bs-8\"]/span/div/div/div/form/div[4]/div/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"bs-2\"]/span/a")).click();

	
		
		

	}
	//*[@id="bs-6"]/span/div/div/div/form/div[1]/input  //*[@id=":0.targetLanguage"]/span/a/span[3]
}
//*[@id="0f1719fa-57fa-4d21-89f8-c63672863a2a"]/div/section/div/div[2]/a[1]/svg

//driver.findElement(By.cssSelector("#\\34  > div > svg > path")).click();
//driver.findElement(By.cssSelector("#n-7307873115-membership-sign-in")).click();
//driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[1]/input")).sendKeys("jyothishkadungallur@gmail.com");
//driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[2]/input")).sendKeys("56565656");
//driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[3]/button")).click();


//WebElement dropdownElement = driver.findElement(By.id("tCounty"));
//
//   // Create a Select object for the dropdown
//   Select dropdown = new Select(dropdownElement);
//
//   // Select an option by visible text
//   dropdown.selectByVisibleText("Devon");
   
//   WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"tCounty\"]"));
//
//   // Create a Select object for the dropdown
//   Select dropdown = new Select(dropdownElement);
//
//   // Select an option by its value attribute
//   dropdown.selectByValue("Berkshire");
////	driver.findElement(By.xpath("//select[@id='tCounty']/opt]ion[7]")).click();

