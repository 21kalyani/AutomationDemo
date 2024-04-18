package CVS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize();
          
          //CVS
          
	  driver.get("https://phplaravel-1181092-4364813.cloudwaysapps.com/login");   
		
	    WebElement username =driver.findElement(By.id("email"));
		WebElement password =driver.findElement(By.id("password"));
		WebElement login =driver.findElement(By.xpath ("//*[contains(@type,'sub')]"));
		  
		username.sendKeys("info@desino.be");
		password.sendKeys("developertest");
		login.click();
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();
        
		//VOLT
		
		driver.get("https://www.volt-mysteryshopper.be/en/login");   
			
		    WebElement username1 =driver.findElement(By.id("email"));
			WebElement password1 =driver.findElement(By.id("password"));
			WebElement login1 =driver.findElement(By.xpath ("//*[contains(@type,'sub')]"));
			  
			username1.sendKeys("info@desino.be");
			password1.sendKeys("123456");
			login1.click();
			
			
			
	}

}
