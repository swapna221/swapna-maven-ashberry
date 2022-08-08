package testcases;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveAdds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));

	}



}
