package assignments.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Write an Script for Demo Webshop WebApplication:
 * 1. Open the Browser
 * 2. After Opening it Maximize it
 * 3. Enter into the DemowebShop website
 * 4. Click on Login Link
 * 5. Close the Browser.
 * */
public class DirectLocators2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
