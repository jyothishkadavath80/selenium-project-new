package seleniumprojectnew;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class QAPRACTICEPROJECT {
	@Test

	public void qapracticesite() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"sidebarCollapse\"]/span[3]")).click();
		System.out.println("click close button");
		// Thread.sleep(1000);
		
		  driver.findElement(By.id("sidebarCollapse")).click();
		  System.out.println("click side menu button");
		  driver.findElement(By.xpath("//*[@id=\"auth-shop\"]/b")).click();
		 driver.findElement(By.xpath("(//ul[@class='list-unstyled components']//li)[1]")).click();
		 System.out.println("click Ecommerce - Login, Add to Cart, Submit order, Logout");                // loging
		 Thread.sleep(1000);
		 driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		 System.out.println("enter email id");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin123");
		 System.out.println("enter password");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"submitLoginBtn\"]")).click();
		 System.out.println("click submit button");
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[1]/div/button")).click();
		 System.out.println("click Apple iPhone 12, 128GB, Black add to cart button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[2]/div/button")).click();
		 System.out.println("click Huawei Mate 20 Lite, 64GB, Black add to cart button ");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[3]/div/button")).click();
		 System.out.println("click Samsung Galaxy A32, 128GB, White add to cart button ");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[4]/div/button")).click();
		 System.out.println("click Apple iPhone 13, 128GB, Blue add to cart button ");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[5]/div/button")).click();         //add cart
		 System.out.println("click Nokia 105, Black add to cart button ");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/div[2]/div[1]/div[2]/input")).sendKeys("2");
		 System.out.println("enter a number 2");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/div[2]/div[1]/div[2]/button")).click();
		 System.out.println("click remove button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/button")).click();
		 System.out.println("click proceed button");
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9876543210");
		 System.out.println("enter phone number"); 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"shippingForm\"]/div[2]/input")).sendKeys("kadungallur");
		 System.out.println("enter street");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"shippingForm\"]/div[3]/input")).sendKeys("goa");           //checkout
		 System.out.println("enter city");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"countries_dropdown_menu\"]")).click();
		 System.out.println("click country box");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"countries_dropdown_menu\"]")).sendKeys("india");
		 System.out.println("click country box");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"submitOrderBtn\"]")).click();
		 System.out.println("click submit button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		 System.out.println("click logout button");
		 Thread.sleep(1000);
		  
		 driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		 System.out.println("click home button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"bugs-form\"]")).click();
		 System.out.println("click CHALLENGE - Spot the BUGS button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ABU");
		 System.out.println("enter last name");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Saleem");
		 System.out.println("enter last name");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9876543210");
		 System.out.println("enter phone number");
		 Thread.sleep(1000);
		    WebElement countryDropdown = driver.findElement(By.xpath("//*[@id=\"countries_dropdown_menu\"]"));    //bug challenge
            Select selectCountry = new Select(countryDropdown);
            selectCountry.selectByVisibleText("India");
            System.out.println("select country");
            Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("abusalim@gmail.com");
		 System.out.println("enter email");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("*ennekollalle");
		 System.out.println("enter password");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"registerBtn\"]")).click();
		 System.out.println("click register button");
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
			 System.out.println("click home button"); 
			 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"graphql-testing\"]/b")).click();                 //graphQL testing
		 System.out.println("click graphQL testing");
		
	 driver.get("https://qa-practice.netlify.app/graphql-testing");
		 driver.navigate().refresh();
		 driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		 System.out.println("click home button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"api-testing\"]/b")).click();                       //API TESTING
		 System.out.println("click API TESTING button"); 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"products-list\"]/b")).click();
		 System.out.println("click productlist shop button"); 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[1]/div/button")).click();
		 System.out.println("click Apple iPhone 12, 128GB, Black add to cart button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[2]/div/button")).click();
		 System.out.println("click Huawei Mate 20 Lite, 64GB, Black add to cart button ");
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[3]/div/button")).click();
		 System.out.println("click Samsung Galaxy A32, 128GB, White add to cart button ");
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[4]/div/button")).click();     //purchace PRODUCT LIST
		 System.out.println("click Apple iPhone 13, 128GB, Blue add to cart button ");
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[5]/div/button")).click();
		 System.out.println("click Nokia 105, Black add to cart button ");
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/div[2]/div[1]/div[2]/input")).sendKeys("5");
		 System.out.println("enter a number 2");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/div[2]/div[1]/div[2]/button")).click();
		 System.out.println("click remove button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/button")).click();
		 System.out.println("click purchace button button");
		 driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		 System.out.println("click home button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"intercept-api\"]/b")).click();                       //INTERCEPT API TESTING
		 System.out.println("click Intercept API Request button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"postTitleInput\"]")).sendKeys("hello");
		 System.out.println("enter helo");     
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"content\"]/form/button[1]")).click();
		 System.out.println("click create post button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"content\"]/form/button[2]")).click();                 
		 System.out.println("clck update button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		 System.out.println("click home button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"visual\"]")).click();                              // VISUAL TESTING
		 System.out.println("click visual testing button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"forms\"]")).click();
		 System.out.println("click forms button button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		 System.out.println("click login button");
		 Thread.sleep(1000);
		 driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		 System.out.println("enter email id");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin123");            //FORM LOGIN PROCEED CHECK OUT
		 System.out.println("enter password");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"submitLoginBtn\"]")).click();
		 System.out.println("click submit button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[1]/div/button")).click();
		 System.out.println("click Apple iPhone 12, 128GB, Black add to cart button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[2]/div/div[2]/div/button")).click();
		 System.out.println("click Huawei Mate 20 Lite, 64GB, Black add to cart button ");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/div[2]/div[1]/div[2]/button")).click();
		 System.out.println("click remove button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"prooood\"]/section[1]/button")).click();
		 System.out.println("click proceed button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("7865432190");
		 System.out.println("enter phone number"); 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"shippingForm\"]/div[2]/input")).sendKeys("kondotty");
		 System.out.println("enter street");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"shippingForm\"]/div[3]/input")).sendKeys("kanoor");          //CHECK OUT DETAILS
		 System.out.println("enter city");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"countries_dropdown_menu\"]")).click();
		 System.out.println("click country box");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"countries_dropdown_menu\"]")).sendKeys("india");
		 System.out.println("click country box");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"submitOrderBtn\"]")).click();
		 System.out.println("click submit button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		 System.out.println("click logout button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"forms\"]")).click();
		 System.out.println("click forms button button");
		 Thread.sleep(1000);
		 driver.get("https://qa-practice.netlify.app/register");
		 System.out.println("to navigate register page");
		 Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("vishnu");
		 System.out.println("enter last name");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("kgr");
		 System.out.println("enter last name");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9876765410");
		 System.out.println("enter phone number");
		 Thread.sleep(1000);
		    WebElement countryDropdown1 = driver.findElement(By.xpath("//*[@id=\"countries_dropdown_menu\"]"));  //FORM REGISTRATION
            Select selectCountry1 = new Select(countryDropdown1);
            selectCountry1.selectByVisibleText("India");
            System.out.println("select country");
            Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("abusalim@gmail.com");
		 System.out.println("enter email");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("*ennekollalle");
		 System.out.println("enter password");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"exampleCheck1\"]")).click();
		 System.out.println("click checkbox");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"registerBtn\"]")).click();
		 System.out.println("click regster button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"forms\"]")).click();
		 System.out.println("click forms button button");
		 Thread.sleep(1000);
		driver.get("https://qa-practice.netlify.app/recover-password");
		 System.out.println("to navigate recoverypassword page");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("arun@gmail.com");                 //form recovery password
		 System.out.println("enter email");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
		 System.out.println("click recovery button");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"buttons\"]")).click();
		 System.out.println("click buttons button");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"checkboxes\"]")).click();
		 System.out.println("click check boxs ");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		 System.out.println("click checkbox1 ");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();                          //check box
		 System.out.println("click checkbox2");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		 System.out.println("click checkbox3");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/button")).click();
		 System.out.println("click rest button");
		 Thread.sleep(1000);
		 
	//................................................................................................................	 
	//	 driver.findElement(By.xpath("//*[@id=\"buttons\"]")).click();
		// System.out.println("click buttons button");
				
		// driver.get("https://qa-practice.netlify.app/radio buttons");
		// System.out.println("click radio button");
		// driver.findElement(By.xpath("//*[@id=\"radio-button1\"]")).click();       //radio button  "not working" problem
		 //System.out.println("click radio buttons 1");
		 //Thread.sleep(1000);
		// driver.findElement(By.xpath("//*[@id=\"radio-button2\"]")).click();
		 //System.out.println("click radio buttons 2");
		// driver.findElement(By.xpath("//*[@id=\"radio-button3\"]")).click();
		// System.out.println("click radio buttons 3");

//		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
//		 System.out.println("click home button");                                 //new tab button
//		 driver.get("https://qa-practice.netlify.app/tab");
//		 System.out.println("click new tab button");
//		 driver.findElement(By.xpath("//*[@id=\"newTabBtn\"]/a")).click();
//    	 System.out.println("click press me new tab button");
// 		driver.get("https://qa-practice.netlify.app/window");                //problem stoping here browser /success hear selenium
//		 System.out.println("click new window button");
		 
		 //...........................................................................................................
		 driver.findElement(By.xpath("/html/body/div/div/nav/div/div/ul/li[1]/a")).click();
		 System.out.println("click home button");

         driver.navigate().refresh();
    	// driver.findElement(By.xpath("//*[@id=\"content\"]/form/button[1]")).click();              //new browser button
    	// System.out.println("click new browser button");
		 //...........................................................................................................
		 
		 driver.get("https://qa-practice.netlify.app/double-click");
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"double-click-btn\"]"));                  //double click
         Actions actions = new Actions(driver);
         actions.doubleClick(element).perform();
         System.out.println("click the double click button");
         Thread.sleep(1000);
              
         driver.findElement(By.xpath("//*[@id=\"actions\"]")).click();
         System.out.println("click button action button");
         Thread.sleep(1000);
         
         driver.findElement(By.id("scrolling")).click();
         System.out.println("click the scrool down  button");
         
         WebElement paragraph = driver.findElement(By.xpath("//*[@id=\"main\"]/p"));  // Use the correct locator
         // Initialize JavaScript Executor
         JavascriptExecutor js = (JavascriptExecutor) driver;
         // Get the initial scroll height of the paragraph
         long scrollHeight = (Long) js.executeScript("return arguments[0].scrollHeight;", paragraph);
         long scrollPosition = 0;  // Start from the top
         int scrollStep = 100;     // Pixels to scroll per step
         // Scroll until reaching the bottom of the paragraph
         while (scrollPosition < scrollHeight) {
             js.executeScript("arguments[0].scrollTop = arguments[1];", paragraph, scrollPosition);        //scrolling paragraph
             scrollPosition += scrollStep;
             // Add delay for smoother scrolling
             try {
                 Thread.sleep(100);  // Adjust as needed for smoother experience
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             // Update scrollHeight in case content is dynamically loaded
             scrollHeight = (Long) js.executeScript("return arguments[0].scrollHeight;", paragraph);
         }
         System.out.println("Finished scrolling the paragraph.");
         Thread.sleep(100);
                    
             driver.findElement(By.xpath("//*[@id=\"actions\"]")).click();
         System.out.println("click button action button");
         Thread.sleep(1000);
         
         driver.get("https://qa-practice.netlify.app/mouse-hover");
         System.out.println("click mouse hover button"); 
         WebElement hoverElement = driver.findElement(By.xpath("//*[@id=\"button-hover-over\"]"));  //mouse hover
         Actions actions1 = new Actions(driver);
         actions1.moveToElement(hoverElement).perform();
         System.out.println("Mouse hover action performed successfully.");
         Thread.sleep(1000);
            
         driver.findElement(By.xpath("//*[@id=\"actions\"]")).click();
         System.out.println("click button action button");
         Thread.sleep(1000);
         driver.get("https://qa-practice.netlify.app/show-hide-element");              //hide/show button
         System.out.println("click show-hide-element button"); 
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"showHideBtn\"]")).click();
         System.out.println("click show-hide-element button"); 
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"showHideBtn\"]")).click();
         System.out.println("click show-hide-element button"); 
         Thread.sleep(1000);
         
         driver.get("https://qa-practice.netlify.app/web-table");  //(not get tables button)
         System.out.println("click static table"); 
         Thread.sleep(1000);
         driver.get("https://qa-practice.netlify.app/dynamic-table");                         //dynamic table
         System.out.println("click dynamic table");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		 System.out.println("click home button");
		 Thread.sleep(1000);
		 	 
		 
	}
	@Test
	public void qapracticesite1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-practice.netlify.app/");
		driver.manage().window().maximize();	 
		 driver.findElement(By.xpath("//*[@id=\"dropdowns\"]")).click();
		 WebElement countryDropdown = driver.findElement(By.xpath("//*[@id=\"dropdown-menu\"]"));     //drop down country
       Select selectCountry = new Select(countryDropdown);
	selectCountry.selectByVisibleText("India");
       System.out.println("select country");

		 driver.findElement(By.xpath("//*[@id=\"multi-level-dropdown-btn\"]")).click();		 
			System.out.println("select dropdown options");
			 Thread.sleep(1000);
			WebElement element=driver.findElement(By.xpath("//*[@id=\"multi-level-menu-ul\"]/li[4]/a"));             //multi dropdown
			Actions actions=new Actions(driver);
			actions.moveToElement(element).perform();
			 Thread.sleep(1000);
			WebElement dropdownElementmenu = driver.findElement(By.xpath("//*[@id=\"multi-level-menu-ul\"]/li[4]/ul/li[2]/a"));
			    actions.moveToElement(dropdownElementmenu).perform();
			WebElement secdropdownElement = driver.findElement(By.xpath("//*[@id=\"multi-level-menu-ul\"]/li[4]/ul/li[2]/ul/li[2]/a"));
			secdropdownElement.click();
			 System.out.println("click multi level dropdown");

		 driver.findElement(By.xpath("//*[@id=\"iframes\"]")).click();
		 System.out.println("click iframe");
		 driver.findElement(By.xpath("//*[@id=\"alerts\"]")).click();
		 System.out.println("click alert button");
		 
//		 Alert alert = driver.switchTo().alert();
//
//	        // Print alert text (optional)
//	        System.out.println("Alert message: " + alert.getText());
//
//	        // Accept the alert (click OK button)
//	        alert.accept();

		 driver.findElement(By.xpath("//*[@id=\"alert-btn\"]")).click();                      //alert button
		 System.out.println("click alert button");
		 Alert alert1 = driver.switchTo().alert();

	        // Print alert text (optional)
	        System.out.println("Alert message: " + alert1.getText());

	        // Accept the alert (click OK button)
	        alert1.accept();

		 Thread.sleep(1000);
		 	 
		 driver.findElement(By.xpath("//*[@id=\"file-upload-item\"]")).click();	 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
         WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"file_upload\"]"));          //file upload

         String filePath = "C:\\Users\\Admin\\Downloads\\phone-call.png";

         uploadElement.sendKeys(filePath);
         System.out.println("uplod file");
         
         driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/button")).click();
         System.out.println("click submit button button");
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//*[@id=\"date-picker\"]")).click();
         System.out.println("click date pickers button");
         
         driver.findElement(By.xpath("//*[@id=\"range-date-calendar\"]")).click();                          //range date picker
         System.out.println("click date ranger piker box"); 
         Thread.sleep(1000);
         
         WebElement startDate = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]"));
         startDate.click();

         WebElement endDate = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/table/tbody/tr[5]/td[6]"));
         endDate.click();

         WebElement applyButton = driver.findElement(By.xpath("/html/body/div[2]/div[4]/button[2]"));
         applyButton.click();

         System.out.println("Date range selected successfully."); 
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//*[@id=\"calendar\"]")).click();
         System.out.println("click basic date picker.");
         
         driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[3]")).click();
         System.out.println("click basic date picker box");
         Thread.sleep(1000);                                                                     //basic date picker 
         driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[2]/td[5]")).click();
         System.out.println("select a date");
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//*[@id=\"loader\"]")).click();                             //loader button
         System.out.println("click loader button");
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("//*[@id=\"pagination\"]")).click();
         System.out.println("click pagination button");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"content\"]/nav[2]/ul/li[2]/a")).click();
         System.out.println("click page number 1 button");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"content\"]/nav[2]/ul/li[3]/a")).click();               //pagination page
         System.out.println("click page number 2 button");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"content\"]/nav[2]/ul/li[4]/a")).click();
         System.out.println("click page number 3 button");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//*[@id=\"content\"]/nav[2]/ul/li[5]/a")).click(); 
         System.out.println("click next button");
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("/html/body/div/div/nav/div/div/ul/li[1]/a")).click();
		 System.out.println("click home button");
		 
		 driver.findElement(By.xpath("//*[@id=\"contact\"]")).click();


		 	}
}
	