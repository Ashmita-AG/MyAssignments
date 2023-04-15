package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
 
//		 * 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
 
//		 * 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

//		 * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
 
//		 * 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
	
//		 * 6. Click on Merge Contacts using Xpath Locator

		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		Set<String> wind = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(wind);
		driver.switchTo().window(list.get(0));
		
		//driver.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']")).sendKeys("Halfway");
		//driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']")).sendKeys("care");
		
		
//		 * 7. Click on Widget of From Contact
		

//		 * 8. Click on First Resulting Contact

//		 * 9. Click on Widget of To Contact

//		 * 10. Click on Second Resulting Contact
 
//		 * 11. Click on Merge button using Xpath Locator

		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
//		 * 12. Accept the Alert
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		

//		 * 13. Verify the title of the page
		
	}

}
