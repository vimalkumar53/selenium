package ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		
		driver.switchTo().frame(single);
		
		driver.findElement(By.id("click")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		
		driver.switchTo().frame(outer);
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("click")).click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vimal");
		
}
}
