package week2.day2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
//trial 
	public static void main(String[] args) {
		//01) Launch Firefox / Chrome and add  implicitlyWait
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver();
		  ChromeDriver driver = new ChromeDriver(options);
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//02) Load https://www.redbus.in/
		//03) Type ""Chennai"" in the FROM text box
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		
		//04) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[@class='sub-city']/i[1]")).click();

		//05) Type ""Bangalore"" in the TO text box
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		//06) Click the first option from the pop up box
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[2]")).click();

		//07) Select tomorrow's date in the Date field

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).click();

		//08) Click Search Buses
		driver.findElement(By.xpath("//button[contains(text(),'Search Buses')]")).click();
		
		//09) Print the number of buses shown as results (104 Buses found) (use .getText())
		String noOfBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(noOfBuses);
		
		//10) Choose SLEEPER in the left menu - checkbox
		driver.findElement(By.xpath("//label[contains(text(),'SLEEPER')]")).click();
		
		//11) Print the name of the second resulting bus (use .getText())
		String result = driver.findElement(By.xpath("//div[contains(text(),'V2K Travels')]")).getText();
		System.out.println(result);
		
		//12) Get the Title of the page(use .getTitle())
		String title = driver.getTitle();
		System.out.println("Title of the page  : " + title);
		driver.quit();
	}

}
