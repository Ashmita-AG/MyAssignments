package LearningTestNgExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertAssignment {
	@Test
	public void runAlert() throws InterruptedException
	
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Jack");
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.quit();
//ctrl+shift\ --> comment xml
	} 

}
