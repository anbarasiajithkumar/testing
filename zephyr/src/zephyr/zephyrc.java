package zephyr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class zephyrc 
{
	@Test
		public void zephyrtesting()
	{
		System.out.println(" Welcome to my world");
		System.setProperty("webdriver.chrome.driver","F:\\selenium-files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
