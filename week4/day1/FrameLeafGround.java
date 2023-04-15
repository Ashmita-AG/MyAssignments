package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//Click Me (Inside frame)
		// frame using index value
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		//come out of the frame
		driver.switchTo().defaultContent();
		//Click Me (Inside Nested frame)
		//1. frame using index 2. frame using framename
		driver.switchTo().frame(2); //outer frame
		// using frame name
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();// come out of the frame
		//last frame
		driver.switchTo().frame(1);
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
	}

}
