package ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		//object creation
		WebDriver driver=new ChromeDriver();
		
		//launch the url
		driver.get("https://www.flipkart.com/");
		
		//maximize the window
		driver.manage().window().maximize();
	
	}

}
