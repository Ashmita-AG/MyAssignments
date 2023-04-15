package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		//https://www.leafground.com/input.xhtml
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Type your name
		driver.findElement(By.xpath("//div[@class='col-12']/input[1]")).sendKeys("Gnanasekaran");
		//2. Append Country to this City
		driver.findElement(By.xpath("(//div[@class='col-12'])[2]/input")).sendKeys("TamilNadu");
		//3. Verify if text box is disabled
		boolean displayed = driver.findElement(By.xpath("(//div[@class='col-12'])[3]/input")).isDisplayed();
		System.out.println(displayed);
		//4. Clear the typed text
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]")).clear();
		//5. Retrieve the typed text
		String text = driver.findElement(By.xpath("(//div[@class='col-12'])[5]/input")).getAttribute("value");
		System.out.println(text);
		//6. Type email and Tab. Confirm control moved to next element
				 
		driver.findElement(By.xpath("//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::input")).sendKeys("abc@gmail.com",Keys.TAB);
		Thread.sleep(3000);
		//7. Type about yourself
		driver.findElement(By.xpath("//h5[text()='Type about yourself']/following::textarea")).sendKeys("I Enjoy my life the Rightway");
		//8. Text Editor
		driver.findElement(By.xpath("//h5[text()='Text Editor']/following::div[@class='ql-editor ql-blank']")).sendKeys("Edit your text");
		//9. Just Press Enter and confirm error message*
		//driver.findElement(By.xpath("(//h5[text()='Just Press Enter and confirm error message*']/following::input)[2]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).sendKeys(Keys.ENTER);
		//10. Click and Confirm Label Position Changes

		//11. Type your name and choose the third option

		//12. Click and Confirm Keyboard appears

		//13. Custom Toolbar


	}

}
