package ChromeDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class jsExecute {
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://leafground.com/");
			
			driver.manage().window().maximize();
			
			JavascriptExecutor js =(JavascriptExecutor) driver;
			
			WebElement browser = driver.findElement(By.xpath("//span[text()='Browser']"));
			Thread.sleep(2000);
			
			WebElement send = driver.findElement(By.xpath("//span[text()='Send']"));
			
			js.executeScript("arguments[0].click()", browser);
			
			WebElement box = driver.findElement(By.xpath("(//input[@type='text'])[1]"));	
			
			String attribute = box.getAttribute("value");
			
			System.out.println(attribute);
			
	    	js.executeScript("arguments[0].setAttribute('value','vimal')", box);
	    	Thread.sleep(2000);
	    			
			String attribute1 = box.getAttribute("value");
			System.out.println(attribute1);
			
			Thread.sleep(2000);
			
	    	js.executeScript("arguments[0].scrollIntoView(true)", send);
	    	Thread.sleep(2000);
			
	    	js.executeScript("arguments[0].scrollIntoView(false)", box);		
	}
	}

