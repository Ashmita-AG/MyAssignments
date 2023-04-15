package week2.day2.marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {

	public static void main(String[] args) { 

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		//login
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//username
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		//password
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		
		//click Login
		driver.findElement(By.id("Login")).click();
		
		//click on more link in mobile publisher
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		
		//windowHandling
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
				
		//click confirm on confirm redirect
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		//click learning
		
		//and mouse hover on learning on trailahead
		//click on sales force certification
		//click on resulting certificate
		//verify administrator overview page
		//print the certifications available for administrator certifications(list)
		driver.quit();




	}

}
