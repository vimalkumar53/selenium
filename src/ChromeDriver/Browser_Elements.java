package ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Browser_Elements {
	
		public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("vimal");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("1234");
		
		WebElement login = driver.findElement(By.id("login"));
		
		login.click();
		
		driver.findElement(By.xpath("//a[@href='Register.php']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;  //downcasting
		
	    File file = ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Screenshot\\hi.png");	
		
		FileHandler.copy(file, f);
	}

}
