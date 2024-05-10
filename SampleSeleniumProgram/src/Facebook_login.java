import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","E:\\seleniumproject\\MyProgram\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("www.google.com");
		driver.navigate().to("www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("12345");
		

	}

}
