package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();//capture the text
		System.out.println(text);
		alert.sendKeys("Pepsi");//send the text
		//Thread.sleep(500);
		alert.accept();
		/*driver.findElement(By.xpath("//p[@id='demo']"));
		String text2 = alert.getText();
		System.out.println(text2);*/
		driver.switchTo().defaultContent();
		
	}

}
