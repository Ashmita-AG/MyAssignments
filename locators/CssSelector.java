package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" 
//data-testid="royal_email" placeholder="Email or phone number" autofocus="1" 
//aria-label="Email or phone number" fdprocessedid="fstit">
	// TAG #ID
driver.findElement(By.cssSelector("#email")).sendKeys("abc_123@gmail.com");
//driver.findElement(By.cssSelector("input.#email")).sendKeys("abc_123@gmail.com");
// tag .class
//driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc_123@gmail.com");


	
	
	
	
	
	
	
	
	
	}

}
