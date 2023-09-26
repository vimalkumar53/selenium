package ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_dropdown {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		driver.manage().window().maximize();
		
		WebElement multi = driver.findElement(By.xpath("(//select[@size='10'])[1]"));
		
		Select s=new Select(multi);
		
		s.selectByValue("Russia");
		
		s.selectByIndex(1);
		
		s.selectByVisibleText("Germany");
		
		s.selectByValue("Italy");
		
		s.deselectByIndex(1);
		
		List<WebElement> list = s.getOptions();
		
		for (WebElement webElement : list) {
			
			String text = webElement.getText();
			
			System.out.println(text);
		
		}
		
		
		
		
	}
}
