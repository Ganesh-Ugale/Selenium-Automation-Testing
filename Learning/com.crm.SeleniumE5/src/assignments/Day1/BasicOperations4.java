package assignments.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicOperations4 {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://in.puma.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
