package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("welcome to parent window");
		String windowHandle = driver.getWindowHandle();
		System.out.println("parent window ref"+windowHandle);
		System.out.println("parent window url :"+driver.getCurrentUrl());
		
		System.out.println("welcome to child window");
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
		driver.findElement(By.xpath("//span[text()='Window']/..")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		
		driver.quit();
	}

}
