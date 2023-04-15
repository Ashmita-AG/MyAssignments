package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentBuyTheValue {

	public static void main(String[] args) {
//		Week4.Day2
//		Assignment 1
//		--------------------
//		1. Load https://buythevalue.in/
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		2. Click on first product (eg: Hamdard Hing - 50GM)
		
		//driver.findElement(By.xpath("//input[@name='q']/following::span[text()='Hamdard Hing - 50GM']")).click();
//search bar		
		driver.findElement(By.xpath("//input[@name='q']/following::span[text()='Hamdard Hing - 50GM']")).click();
		
		driver.findElement(By.xpath("(//input[@name='q'])[1]")).click();
		
//		//Handle Frame
//		3. Close chat widget
		WebElement findElement = driver.findElement(By.xpath("//div[@class='zoomContainer']/following::iframe"));
		driver.switchTo().frame(findElement);
//		4. Enter the pincode 
//		5. Click on Check
//		6. Click on ADD TO CART
//		7. Click on View
//		8. Click on CHECK OUT
//		//Handle alert
//		9. Accept the alert

	}

}
