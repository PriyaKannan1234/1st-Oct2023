package variousConcepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	   // What is Java associated with?
				//Classes
				//Objects
				
	// What is Class associated with?
	// Statements 
				//variables OR // Attributes OR // Fields 
			    // methods
	
	public static void main(String[] args) throws InterruptedException {
		
	//	Scanner scan = new Scanner(System.in);	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
}

}
