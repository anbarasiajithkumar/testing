package zephyr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.junit.*;
//testing
public class zephyrc 
{
	@Test
		public void zephyrtesting()
	{
		System.out.println(" Welcome to my world");
		System.setProperty("webdriver.chrome.driver","F:\\selenium-files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String aTitle ="";
driver.get("https://www.google.com");
driver.manage().window().maximize();
aTitle= driver.getTitle();
if (aTitle.contentEquals("Google"))
{
	System.out.println("Test Passed");
}
else
{
	System.out.println("Test failed");	
}
driver.quit();
}
}