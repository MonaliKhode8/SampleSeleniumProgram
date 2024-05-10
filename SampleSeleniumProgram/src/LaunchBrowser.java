import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.diver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.name("I'm Feeling Lucky")).click();
		String Curl = driver.getCurrentUrl();
		System.out.println(Curl);
		
		driver.manage().deleteAllCookies();
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
        int elementsCount = elements.size();
        System.out.println("Total Number of Elements : " + elementsCount);
         
        //driver.close();
        
	}
	

}
