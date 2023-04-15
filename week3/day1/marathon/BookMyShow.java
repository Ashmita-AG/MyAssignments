package week3.day1.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {
 
	public static void main(String[] args) {
//		Testcase:2
//		===========
//		01) Launch Edge / Chrome  add  implicitlyWait
//		02) Load https://in.bookmyshow.com/
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		03) Type the city as ""Hyderabad"" in Select City
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		
//		04) Confirm the URL has got loaded with Hyderabad 
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl .equals(driver.getCurrentUrl()))
		{
			System.out.println("url is matched");
		}
		else
			System.out.println("url is not matched");
//		05) Search for your favorite movie 
		driver.findElement(By.id("4")).click();
				
//		06) Click on movie
		driver.findElement(By.xpath("//a[contains(text(),'Orange ')]")).click();
//		07) Print the name of the theater displayed first
		String text = driver.findElement(By.xpath("//a[contains(text(),'Asian Lakshmikala Cinepride: Moosapet')]")).getText();
		System.out.println("Theatre Name is " +text);
//		08) Click on the info of the theater
		driver.findElement(By.className("venue-info-text")).click();
//		09) Confirm if there is a parking facility in the theater
		String text2 = driver.findElement(By.className("facility-text")).getText();
		if(text2.contains("Parking Facility"))
		{
			System.out.println("It contains Parking Facility");
		}
		else
		{
			System.out.println("No Parking Facility");
		}
		
//		10) Close the theater popup
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
//		11) Click on the first green (available) timing
		driver.findElement(By.xpath("(//div[@class='__text'])[3]")).click();
		//driver.findElement(By.xpath("(//a[@class='showtime-pill time_vrcenter data-enabled'])[2]")).click();
//		12) Click Accept
		
//		13) Choose 1 Seat and Click Select Seats
//		14) Choose any available ticket and Click Pay
//		15) Print the sub total

	}

}
