package LetCodeWithKowshik;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println(driver.getCurrentUrl());
		//get x and y locations
		WebElement locat = driver.findElement(By.id("position"));
		Point point = locat.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x value "+x);
		System.out.println("y value"+y);
		//color of the button
		WebElement b_color = driver.findElement(By.id("color"));
		String cssValue = b_color.getCssValue("background-color");
		System.out.println(cssValue);
		//heigth and width of the button
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		System.out.println("heigth of the button = "+ rect.getHeight());
		System.out.println("width of the button =" + rect.getWidth());
		// is enabled
		boolean enabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(enabled);
		System.out.println("thank u universe");
		driver.quit();	
		
	}
	
	
	
	
	
	
	
	
}
