package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfCommonMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		//driver.findElement(By.name("firstName")).isDisplayed()
		driver.findElement(By.name("firstName")).sendKeys("Tapan");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.name("firstName")).isDisplayed());
		System.out.println(driver.findElement(By.name("firstName")).isEnabled());
		System.out.println(driver.findElement(By.name("firstName")).isSelected());
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).getAttribute("value");
		

	}

}
