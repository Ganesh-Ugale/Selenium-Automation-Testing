package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		
		// Up casting is Done here to achive Gendralization
		WebDriver driver = new ChromeDriver();
		
		// To maximize the window of chrome browser
		driver.manage().window().maximize();  // Method Chaining was done here 
		
		// to open the perticular website
		driver.get("https://demowebshop.tricentis.com");
//		driver.navigate().to("https://demowebshop.tricentis.com");
		
//		to close the browser
		driver.close();
	}
}