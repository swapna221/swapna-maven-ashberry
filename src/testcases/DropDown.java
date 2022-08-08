package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("swapna");
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("achary");
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("9742657040");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("swapna.achary966@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("marathalli");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("560037");
		List<WebElement> elements = driver.findElements(By.xpath("//select[@name='country']/option"));
		
		for(WebElement ele:elements) {
			if(ele.getText().equals("INDIA")){
				ele.click();
				break;
			}
		}
		
		
	}

}
