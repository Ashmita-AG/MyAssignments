package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Amazon
{

	public static void main(String[] args) 
	{
		//		Assignment 2 Amazon
		//		1.Load the URL https://www.amazon.in/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//		2.search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro" ,Keys.ENTER);

		//		3.Get the price of the first product
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("price of the first product " + price);

		//		4. Print the number of customer ratings for the first displayed product
		String ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Number of ratings  " + ratings);

		//		5. Click the first text link of the first image
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println("New window title  :" + driver.getTitle());

		//		6. Take a screen shot of the product displayed

		//		7. Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		// cart icon
		//driver.findElement(By.cssSelector("#nav-cart-count")).click();
		driver.findElement(By.id("nav-cart-count")).click();
		//		8. Get the cart subtotal and verify if it is correct.
		String text = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[3]")).getText();
		System.out.println("cart subtotal is"+text);
//		if(boolean.equals(text))
//			System.out.println("match");
//		else
			System.out.println("not match");
		//9.close the browser
		driver.quit();	
	}

}
