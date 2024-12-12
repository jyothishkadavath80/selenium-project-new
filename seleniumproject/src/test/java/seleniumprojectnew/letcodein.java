package seleniumprojectnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class letcodein {
	@Test

	public void letcode() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver .chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chrome.driver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[1]")).click();
		driver.findElement(By.id("name")).sendKeys("arun kumar");
		driver.findElement(By.id("email")).sendKeys("arunkumar12hhfgmdhkgkk@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("81arun123");
		driver.findElement(By.id("agree")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div/div/div/form/div[5]/p/button")).click();
		
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a")).click();
		driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("arun kumar");
		driver.findElement(By.xpath("//*[@id=\"join\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"join\"]")).sendKeys("i am very very happy");
		driver.findElement(By.xpath("//*[@id=\"getMe\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"getMe\"]")).sendKeys("testing activity");
		driver.findElement(By.xpath("//*[@id=\"clearMe\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"clearMe\"]")).sendKeys("clear the text");
		driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[2]/app-learning-point/div/footer/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-main/section[1]/div/div/div[4]/div/a")).click();
		//driver.findElement(By.xpath("/html/body/app-root/app-cucumber/section[1]/div/div[2]/div/div/div[1]/a")).click();
		
		driver.get("https://letcode.in/test");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a")).click();
		WebElement dropdownElement = driver.findElement(By.id("fruits"));
	    Select dropdown = new Select(dropdownElement);
	    dropdown.selectByValue("2");
	    Thread.sleep(2000);  
	    WebElement dropdownElement1= driver.findElement(By.id("superheros"));
    Select dropdown1= new Select(dropdownElement1);
	    dropdown1.selectByValue("ds");
	    Thread.sleep(2000);
	    WebElement dropdownElement2= driver.findElement(By.id("lang"));
	    Select dropdown2= new Select(dropdownElement2);
	    dropdown2.selectByValue("swift");
	    Thread.sleep(2000);
   WebElement dropdownElement3= driver.findElement(By.id("country"));
    Select dropdown3= new Select(dropdownElement3);
    dropdown3.selectByValue("Brazil");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//*[@id=\"testing\"]")).click();
    driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();
//    driver.findElement(By.xpath("//*[@id=\"accept\"]")).click();
//    driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();
//    driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
//    driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();
//    driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
//    driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();
//    driver.findElement(By.xpath("//*[@id=\"modern\"]")).click();
    
    driver.findElement(By.id("testing")).click();
    driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[1]/app-menu/div/footer/a")).click();
    Thread.sleep(2000);
  //  driver.findElement(By.partialLinkText("Enter name ")).sendKeys("arun");
    //driver.findElement(By.partialLinkText("Enter email")).sendKeys("kumar");
    
    driver.findElement(By.id("testing")).click();
    driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[2]/app-menu/div/footer/a")).click();
    driver.findElement(By.xpath("//*[@id=\"yes\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"two\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"nobug\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"foo\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"going\"]")).click();
    driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input")).click();
    driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("testing")).click();	
    driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[3]/app-menu/div/footer/a")).click();
    driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
    
		
	}
	@Test
                  public void letcode2() throws InterruptedException {
                	  System.setProperty("webdriver .chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chrome.driver.exe");
              		WebDriver driver=new ChromeDriver();
              		 driver.get("https://letcode.in/elements");
              		driver.manage().window().maximize();
              		driver.findElement(By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/form/div/p[1]/input")).sendKeys("type and enter");
              		driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
              		 Thread.sleep(2000);
              		driver.findElement(By.id("testing")).click();	
              		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[1]/app-menu/div/footer/a")).click();
              		 driver.findElement(By.id("testing")).click();	
              		 driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[2]/app-menu/div/footer/a")).click();
              		 Thread.sleep(2000);
              		 WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"draggable\"]")); // Replace with actual source element locator
                     WebElement targetElement = driver.findElement(By.id("droppable")); // Replace with actual target element locator
                     // Create an instance of the Actions class
                     Actions actions = new Actions(driver);
                     // Perform the drag and drop
                     actions.clickAndHold(sourceElement)
                            .moveToElement(targetElement)
                            .release(targetElement)
                            .build()
                            .perform();
              		 
                     driver.findElement(By.id("testing")).click();	
                     driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[3]/app-menu/div/footer/a")).click();
                     driver.findElement(By.id("testing")).click();	
                     driver.get("https://letcode.in/selectable");
                     driver.findElement(By.id("testing")).click();
                     Thread.sleep(2000);
                     driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[1]/app-menu/div/footer/a")).click();
              		 
                   driver.findElement(By.xpath("/html/body/app-root/app-word-generator/section[1]/div/div/div[1]/div/div/div[1]/div/button")).click();
                     driver.findElement(By.id("testing")).click();
                     driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[2]/app-menu/div/footer/a")).click();
                     driver.findElement(By.id("testing")).click();
                     Thread.sleep(2000);
                     driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[3]/app-menu/div/footer/a")).click();
                     WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"advancedtable_length\"]/label/select"));
             	    Select dropdown = new Select(dropdownElement);
             	    dropdown.selectByValue("25");
             	    Thread.sleep(1000);
             	    driver.findElement(By.xpath("//*[@id=\"advancedtable_filter\"]/label/input")).sendKeys("oxford");
             	   driver.findElement(By.id("testing")).click();	
             	   driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[4]/app-menu/div/footer/a")).click();
             	   Thread.sleep(2000);
             	  driver.findElement(By.id("testing")).click();	
             	  driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[6]/div/div/div/div[1]/app-menu/div/footer/a")).click();
             	 Thread.sleep(2000);  
             	 
              	  
                  }
	@Test
	
	public void letcodein() {
		 System.setProperty("webdriver .chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chrome.driver.exe");
   		WebDriver driver=new ChromeDriver();
   		 driver.get("https://letcode.in/test");
   		driver.manage().window().maximize();
   			
    	 driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[6]/div/div/div/div[2]/app-menu/div/footer/a")).click();
    	 driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("arun");
    	driver.findElement(By.xpath("//*[@id=\"lasttname\"]")).sendKeys("kumar");
     	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
    	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("arunkumar@gmail.com");
    	System.out.println("enter email id");
    	   
         driver.findElement(By.xpath("//*[@id=\"Phno\"]")).sendKeys("765432189");
         WebElement countryCodeDropdown = driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[2]/div[2]/div/div/div/select"));
         
         Select selectCountryCode = new Select(countryCodeDropdown);
         
         // Select the country code by visible text
         selectCountryCode.selectByVisibleText("India (+91)");
  
         driver.findElement(By.xpath("//*[@id=\"Addl1\"]")).sendKeys("kunjanpadi");
         driver.findElement(By.xpath("//*[@id=\"Addl2\"]")).sendKeys("alinchuvadu");
         driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
         driver.findElement(By.xpath("//*[@id=\"postalcode\"]")).sendKeys("673642");
         WebElement countryDropdown = driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[5]/div[2]/div/div/div/select"));
         
         // Create a Select object
         Select selectCountry = new Select(countryDropdown);
         
         // Select the country by visible text
         selectCountry.selectByVisibleText("India");
         driver.findElement(By.id("male")).click();
         driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("22/2/1995");
         System.out.println("select date");
         driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[7]/div/label/input"));
         System.out.println("select date");
         driver.findElement(By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[8]/div/input"));
         System.out.println("select date");
   		
		
	}
}
