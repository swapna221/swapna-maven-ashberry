package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr[1]/td"));
		
		for (int i = 1; i < rows.size(); i++) {
			for (int j = 1; j < cols.size(); j++) {
				String text = driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText();
				System.out.println(text);
				
			}
			
		}

	}
	

}
