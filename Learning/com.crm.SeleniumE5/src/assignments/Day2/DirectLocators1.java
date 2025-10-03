package assignments.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Write an Script for Demo Webshop WebApplication:
 * 1. Open the Browser
 * 2. After Opening it Maximize it
 * 3. Enter into the DemowebShop website
 * 4. Click on Register Link
 * 5. Close the Browser.
 * */

public class DirectLocators1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
//		WebElement filed = driver.findElement(By.className("ico-register"));
//		filed.click();
		driver.findElement(By.className("ico-register")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
