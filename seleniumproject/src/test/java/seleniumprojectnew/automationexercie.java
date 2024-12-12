package seleniumprojectnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class automationexercie {
	@Test
	public void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("arjun");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("arjunarjun3j0jkrrw1038@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		driver.findElement(By.id("password")).sendKeys("kadavath");
		
		 WebElement dayDropdown = driver.findElement(By.xpath("//*[@id=\"days\"]"));  // Replace with the actual 'day' dropdown locator (ID, name, etc.)
	        Select daySelect = new Select(dayDropdown);
	        daySelect.selectByVisibleText("25");  // Select 15th day

	        WebElement monthDropdown = driver.findElement(By.xpath("//*[@id=\"months\"]"));  // Replace with the actual 'month' dropdown locator
	        Select monthSelect = new Select(monthDropdown);
	        monthSelect.selectByVisibleText("August");  // Select August month

	        WebElement yearDropdown = driver.findElement(By.xpath("//*[@id=\"years\"]"));  // Replace with the actual 'year' dropdown locator
	        Select yearSelect = new Select(yearDropdown);
	        yearSelect.selectByVisibleText("1997");  // Select 1990 year
	        
	        driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
	        driver.findElement(By.id("first_name")).sendKeys("arjun");
	        driver.findElement(By.id("last_name")).sendKeys("kadavath");
	        driver.findElement(By.id("company")).sendKeys("ABC Company");
	        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("kondotty,manjeri PO, ABC company");
	        driver.findElement(By.id("address2")).sendKeys("Areacode,puthalam PO , XYZ company");
	        
	        WebElement countryDropdown = driver.findElement(By.xpath("//*[@id=\"country\"]"));
	        Select selectCountry = new Select(countryDropdown);
	        selectCountry.selectByVisibleText("India");
	        
	        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
	        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("kondotty");
	        driver.findElement(By.id("zipcode")).sendKeys("676767");
	        driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9048789056");
	        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	        driver.findElement(By.linkText("Continue")).click();
	        
	        driver.findElement(By.linkText("Test Cases")).click();
	        driver.navigate().back();
	        driver.findElement(By.linkText("APIs list for practice")).click();
	        driver.navigate().back();
	        driver.findElement(By.xpath("/html/body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div/div[2]/ul/li/a")).click();
	        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
	        
	      //  driver.findElement(By.linkText("Continue Shopping")).click();
	      //  driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
	     //   driver.findElement(By.cssSelector("#cartModal > div > div > div.modal-footer > button")).click();
	        
	        driver.get("https://automationexercise.com/view_cart");
	        
	        driver.findElement(By.linkText("Proceed To Checkout")).click();
	        driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("not good");
	        driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input")).sendKeys("arjun");
	        driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input")).sendKeys("1232345");//*[@id="payment-form"]/div[5]/div
	        driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input")).sendKeys("30");
	        driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input")).sendKeys("12");
	        driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input")).sendKeys("1999");
	        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
	        
	        
	}

}
