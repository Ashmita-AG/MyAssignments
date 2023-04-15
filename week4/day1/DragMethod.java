package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement draggableElement = driver.findElement(By.id("form:drop_header"));
		Point location = draggableElement.getLocation();
		int x = location.getX();
		int y = location.getY();
		Actions builder1=new Actions(driver);
		builder1.dragAndDropBy(draggableElement, x+800,y+800).perform();
		
	}

}
