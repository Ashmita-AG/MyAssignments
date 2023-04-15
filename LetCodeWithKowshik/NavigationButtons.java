package LetCodeWithKowshik;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationButtons
{

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentpage url :"+currentUrl);
		Thread.sleep(3000);
		// homepage
		driver.findElement(By.id("home")).click();
		String homeUrl = driver.getCurrentUrl();
		System.out.println("homepage url :"+homeUrl);
		Thread.sleep(3000);
		//back
		driver.navigate().back();
		String backUrl = driver.getCurrentUrl();
		System.out.println("backto homepage:"+backUrl);
		Thread.sleep(3000);
		//refresh
		driver.navigate().refresh();
		//navigate to another website
		driver.navigate().to("https://www.redbus.in/");
		
		driver.quit();
		
		
	}

}
