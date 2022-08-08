package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//button[text()="Click for JS Alert"]
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
	
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		
		
		driver.quit();

	}

}
