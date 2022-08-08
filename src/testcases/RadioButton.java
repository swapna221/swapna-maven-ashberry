package testcases;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		
//		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("swapna");
//		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("achary");
//		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("9742657040");
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("swapna.achary966@gmail.com");
//		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("marathalli");
//		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Bangalore");
//		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Bangalore");
//		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("560037");
//		List<WebElement> elements = driver.findElements(By.xpath("//select[@name='country']/option"));
//		
//		for(WebElement ele:elements) {
//			if(ele.getText().equals("INDIA")){
//				ele.click();
//				break;
//			}
//		}
//		driver.findElement(By.name("email")).sendKeys("Tapan");
//		driver.findElement(By.name("password")).sendKeys("12345");
//		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		
		//Remove Adds ChromeOptions
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/newtours");
		
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		
	
		List<WebElement> radioButtons = driver.findElements(By.name("servClass"));
		
		radioButtons.get(1).click();
		
		Thread.sleep(3000);
	

	}

}
