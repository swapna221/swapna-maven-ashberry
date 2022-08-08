package testng;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xlreaderutility.ReadXL;

public class TestNGBasics {

	@BeforeClass
	public void openBrowser() {

	}

	@BeforeMethod
	public void login() {

		// user
		// password
		// click login button

	}

	@DataProvider
	public Iterator<Object[]> getData() {
		List<Object[]> data = ReadXL.getXlData();
		return data.iterator();
		

	}

//	@Test(priority = 2)
//	public void test2() {
//		System.out.println("Test1");
//	}
	
	@Test(dataProvider = "getData")
	public void Test1(String country, String capital, double population,
			String phone,String email, String city,String address,String state,int pin) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys(country);
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys(capital);
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys(address);
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys(state);
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys(pin+"");
		Thread.sleep(2000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//select[@name='country']/option"));

		for (WebElement ele : elements) {
			if (ele.getText().equals(country)) {
				ele.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.close();

	}

//	@Test(priority = 2)
//	public void test3() {
//		System.out.println("Test3");
//	}
//	@Test(priority = 4)
//	public void test4() {
//		System.out.println("Test4");
//	}
	@AfterMethod
	public void logout() {

	}

	@AfterClass
	public void closeBrowser() {

	}

}
