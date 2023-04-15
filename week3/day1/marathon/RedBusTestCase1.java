package week3.day1.marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusTestCase1 {

	public static void main(String[] args)
	{
		//1) Launch Firefox / Chrome and add  implicitlyWait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//02) Load https://www.redbus.in/
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		//03) Type ""Chennai"" in the FROM text box
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		//04) Click the first option from the pop up box
		//driver.findElement(By.xpath("(//li[text()='Chennai']/ following-sibling::li")).click();
		
		//driver.findElement(By.xpath("//li[text()='Chennai']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//li[text()='Koyambedu, Chennai']")).click();
		
		//05) Type ""Bangalore"" in the TO text box
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		
		//06) Click the first option from the pop up box
		
		//07) Select tomorrow's date in the Date field
		driver.findElement(By.xpath("//td[text()='26']")).click();
		
		//08) Click Search Buses
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		//09) Print the number of buses shown as results (104 Buses found) (use .getText())
		String noOfBuses = driver.findElement(By.xpath("//span[contains(text(),'108')]/..")).getText();
		System.out.println("Number of Buses  "+ noOfBuses);
		
		//10) Choose SLEEPER in the left menu 

		//11) Print the name of the second resulting bus (use .getText())

		//12) Get the Title of the page(use .getTitle()){

		System.out.println("Title of the page  --> "+driver.getTitle());
	}

}
