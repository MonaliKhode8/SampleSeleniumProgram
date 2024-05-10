import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;

public class TestSelenium {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumproject\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("page title is... "+ driver.getTitle());
		
		
		WebElement SignIn = driver.findElement(By.id("twotabsearchtextbox"));
		SignIn.sendKeys("one nord ce3 lite 5g");
		
		Thread.sleep(3000);
		
		WebElement Search = driver.findElement(By.id("nav-search-submit-button"));
		Search.click();
		
		WebElement MobImg = driver.findElement(By.xpath("//span[normalize-space()='OnePlus Nord CE 3 Lite 5G (Pastel Lime, 8GB RAM, 128GB Storage)']"));
		MobImg.click();
		
		driver.manage().logs().get(LogType.BROWSER);
		
		
		
		
		
		
		
		//JavascriptExecutor use = (JavascriptExecutor)driver;
		//jse.executeScript("Window.scrollBy(0,500)","");
	    
		//WebElement AddCart = driver.findElement(By.name("submit.add-to-cart"));
		//AddCart.click();
		
		
		
	}

}
