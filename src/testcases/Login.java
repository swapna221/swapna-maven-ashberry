package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.finzipp.com/");
		driver.findElement(By.className("cursor-pointer")).click();
		driver.findElement(By.xpath("//input[@name=\"userId\"]")).sendKeys("tapanachary.44@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Qwerty@12345");
		driver.findElement(By.xpath("//span[@class=\"ng-star-inserted\"]")).click();
		driver.close();
		
	}

}


//https://demo.guru99.com/test/newtours/
//https://demo.guru99.com/test/newtours/register.php