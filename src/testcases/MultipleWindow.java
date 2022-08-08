package testcases;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[contains(text(),\"Click Here\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Click Here\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Click Here\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Click Here\")]")).click();
		//driver.close();
		// maximized the browser window
		//Implicit wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//Explicit wait
		Thread.sleep(8000);
		
		//Fluent Wait
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
//				.withTimeout(30, TimeUnit.SECONDS) 			
//				.pollingEvery(5, TimeUnit.SECONDS) 			
//				.ignoring(NoSuchElementException.class);
	
		
		//close~ browser
		driver.close() ;
		driver.quit();

	}

}
