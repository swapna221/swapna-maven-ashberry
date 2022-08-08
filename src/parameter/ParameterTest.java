package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	@Test
	@Parameters({"url","user","password","browser","env"})
	public void initializeAndLogIn(String url,String user,String password,String browser,String env) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\selenium downloads\\chromedriver_win32\\gecko.exe");
			driver = new FirefoxDriver();
			
		}
		driver.get(url);
		driver.findElement(By.className("cursor-pointer")).click();
		driver.findElement(By.xpath("//input[@name=\"userId\"]")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//span[@class=\"ng-star-inserted\"]")).click();
		//driver.close();
	}
	

}
