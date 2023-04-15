package week2.day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class LaunchApplication {

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//driver.get("https://login.salesforce.com/");
		//EdgeDriver driver=new EdgeDriver();
		//driver.get("https://www.facebook.com/"); 
		driver.get("http://leaftaps.com/opentaps/control/login");
		// to load url
		/*driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.className("decorativeSubmit")).click();*/
		//username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//password
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		//Login
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}
}
		