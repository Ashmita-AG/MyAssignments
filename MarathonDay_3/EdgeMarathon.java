package MarathonDay_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EdgeMarathon extends MarathonProjectSpecific
{
	@BeforeTest
	public void setData() 
	{
		excelfilename="marathon_2";
	}
	@Test(dataProvider= "senddata")

	public void runEdgeMarathon(String oppName,String amt) 
	{
		EdgeDriver driver=new EdgeDriver();
		//1. Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		
		//2. Click on toggle menu button from the left corner
		driver.findElement(By.className("slds-icon-waffle")).click();

		//3. Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
						
		//4. Click View All Key Deals in Key Deals 
		WebElement element = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		driver.executeScript("arguments[0].click();", element);
				
		//6. Click on New
		driver.findElement(By.xpath("//div[@title='New']")).click();
				
		//7. Give Opportunity Name  (From Excel)
		
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys(oppName);
		
		
		//8. Select Type as New Customer and Lead Source as Partner Referral
				
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')]//span)[2]")).click();
		driver.findElement(By.xpath("//span[text()='New Customer']")).click();
		
		//partner Referral
		driver.findElement(By.xpath("(//button[@role='combobox'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		
		//9. Give Amount as 75000 (from Excel)
		
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amt);

		//10. Select Close Date as tomorrow
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='23']")).click();
		
		//11. Select Stage as Needs Analysis
		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		//12. Click in Primary Campaign  Source and Select first option
		driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]")).click();
		driver.findElement(By.xpath("//span[@title='test']")).click();
		
		//13. Click Save and Verify the opportunity is created"
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//div[text()='Opportunity']")).getText();
		if (text.contains("sales"))
		{
			System.out.println("opportunity is created");
		
		}
		else
		{
			System.out.println("opportunity is not created");
		}
		
		//14. Close the browser
		//driver.quit();		
	}

}
