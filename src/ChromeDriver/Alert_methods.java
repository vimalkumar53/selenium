package ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_methods {
	
	public static void main(String[] args) {
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0wma98zh45j4r1vuf18pqbdvc377576.node0");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[contains(@onclick,'simple a')]")).click();
	
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//button[contains(@onclick,'you call')]")).click();
	
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//button[contains(@onclick,'prompt')]")).click();
	
	driver.switchTo().alert().sendKeys("hello");
	
	driver.switchTo().alert().accept();
	
	
	
	}

}
