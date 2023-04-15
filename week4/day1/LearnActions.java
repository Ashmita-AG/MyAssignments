package week4.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.switchTo().frame(0);
		WebElement dragElement = driver.findElement(By.xpath("//span[@class='ui-panel-title']"));
		WebElement dropElement = driver.findElement(By.id("form:conpnl_content"));
		Actions builder= new Actions(driver);
		builder.dragAndDrop(dragElement, dropElement).perform();
		driver.quit();
		
	}

}
