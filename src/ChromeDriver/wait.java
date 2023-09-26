package ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
	
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait w=new WebDriverWait(driver,6);
		
	    w.until(ExpectedConditions.alertIsPresent());
		
	//	FluentWait f=new FluentWait(driver);
		
	//	f.withTimeout(6, TimeUnit.SECONDS);
	//	f.pollingEvery(1,TimeUnit.SECONDS);
	//	f.ignoring(Exception.class);
	//	f.until(ExpectedConditions.alertIsPresent());
			
		driver.switchTo().alert().accept();
}
}