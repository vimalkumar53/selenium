package ChromeDriver;

import java.awt.AWTException;
//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class practiceprogram {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@loading='lazy']")).click();
		
	   // WebElement outer = driver.findElement(By.id("ad_position_box"));
	    
	   //driver.switchTo().frame(outer);
		    
		//WebElement frame1 = driver.findElement(By.id("dismiss-button"));
		    
		//driver.switchTo().frame(frame1);
		    
		 //driver.switchTo().defaultContent();
    Robot r=new Robot();
		
	r.keyPress(KeyEvent.VK_ESCAPE);
		
		r.keyRelease(KeyEvent.VK_ESCAPE);
       				
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   	  	   	
		r.keyPress(KeyEvent.VK_ESCAPE);
		
		r.keyRelease(KeyEvent.VK_ESCAPE);
	
		driver.findElement(By.xpath("//a[text()='View Basket']")).click();
		
        r.keyPress(KeyEvent.VK_ESCAPE);
		
     	r.keyRelease(KeyEvent.VK_ESCAPE);
     	
     	boolean close = true;
     	
     	if (close) {		
			
		}
	  				
		driver.findElement(By.xpath("//a[contains(@href,'practice.automationtesting.in/checkout')]")).click();	
		
	 //    r.keyPress(KeyEvent.VK_ESCAPE);
			
	//	r.keyRelease(KeyEvent.VK_ESCAPE);
			
		WebElement firstname = driver.findElement(By.id("billing_first_name"));
		
		firstname.sendKeys("vimal");
		
		WebElement lastname = driver.findElement(By.id("billing_last_name"));
		
		lastname.sendKeys("kumar");
		
        WebElement companyname = driver.findElement(By.id("billing_company"));
		
		companyname.sendKeys("company");
		
        WebElement email = driver.findElement(By.id("billing_email"));
		
		email.sendKeys("vimal53kumar@gmail.com");
		
        WebElement phone = driver.findElement(By.id("billing_phone"));
		
		phone.sendKeys("1234567890");
		
    //   WebElement country = driver.findElement(By.xpath("//span[text()='India']"));
		
	  // Select s=new Select(country);
		
	   //s.selectByVisibleText("India");
		
        WebElement address1 = driver.findElement(By.id("billing_address_1"));
		
	    address1.sendKeys("sunkadakatte");
		
        WebElement address2 = driver.findElement(By.id("billing_address_2"));
		
	    address2.sendKeys("bangalore");
	    
        WebElement town = driver.findElement(By.id("billing_city"));
		
	    town.sendKeys("karnataka");	
	    
       // WebElement State = driver.findElement(By.id("//span[text()='Telangana']"));
		
	   // State.sendKeys("Telangana");
	    
        WebElement postcode = driver.findElement(By.id("billing_postcode"));
		
	    postcode.sendKeys("560091");	
	    
	    driver.findElement(By.xpath("//label[@for='payment_method_cod']")).click();
	    
       driver.findElement(By.id("place_order")).click();   
	  }
}
