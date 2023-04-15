package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CherCher {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//first frame using frame id

		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("HalfWay care");
		//driver.switchTo().defaultContent(); don't comeout from the frame we have to work on inner frame
		//switch to inner frame for selecting checkbox
		WebElement findElement = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(findElement);

		//checkbox is inside the first frame
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();
		
		//handle the dropdown in another frame
		WebElement fName = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(fName);
		WebElement dropdown = driver.findElement(By.id("animals"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Avatar");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.close();

	}


}
