import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	   System.setProperty("webdriver.chrome.driver","chromedriver.exe");	   	     	
	   WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
        driver.manage().window().maximize();							
		driver.get("http://orangehrm.qedgetech.com");					
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");			
		Thread.sleep(5000);
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Change Password")).click();		  
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File srcfile = ts.getScreenshotAs(OutputType.FILE);
	    File trgfile = new File("C:\\Defect SC\\Bug1.jpg");
	    Files.copy(srcfile,trgfile);
	    
	}

	
}


