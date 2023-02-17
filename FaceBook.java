package week2.day1.assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vikash");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("9988776655");
		// Step 10: Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Cheerful123");
		// Step 11: Handle all the three drop downs
		 WebElement dayDropDown = driver.findElement(By.xpath("//select[@id='day']"));
		 Select dd=new Select(dayDropDown);
		 dd.selectByVisibleText("27");
		 
		 WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
		 Select dm=new Select(monthDropDown);
		 dm.selectByVisibleText("Oct");
		 
		 WebElement yearDropDowm = driver.findElement(By.xpath("//select[@id='year']"));
		 Select dy= new Select(yearDropDowm);
		 dy.selectByValue("2016");

		// Step 12: Select the radio button "Female" 
		 driver.findElement(By.xpath(" //label[contains(text(),'Female')]")).click();
		           // ( A normal click will do for this step) 

	}

}
