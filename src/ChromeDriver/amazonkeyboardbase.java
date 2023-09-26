package ChromeDriver;

import org.openqa.selenium.By;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonkeyboardbase {

public static void main(String[] args) throws AWTException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		
		Actions a=new Actions(driver);
		
		a.contextClick(best).perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
			
			WebElement mob = driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]"));
					
			a.contextClick(mob).perform();
			
			r.keyPress(KeyEvent.VK_DOWN);
			
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Set<String> set = driver.getWindowHandles();
			
			System.out.println(set);
						
			for (String id : set) {
				
			driver.switchTo().window(id).getTitle();
					
		String title = driver.switchTo().window(id).getTitle();
			String bs="Amazon.in Bestsellers: The most popular items on Amazon";
		     if (title.equals(bs)) {
		      	driver.switchTo().window(id);
		    driver.quit();
				}
		}			
		
			
}

}