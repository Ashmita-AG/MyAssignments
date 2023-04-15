package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMultipleWindows {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
driver.get("https://leafground.com/window.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Click and Confirm new Window Opens
driver.findElement(By.className("ui-button-text ui-c")).click();
String open = driver.getWindowHandle();
//driver.switchTo().window(open);
System.out.println("open url "+driver.getCurrentUrl());
	}

}
