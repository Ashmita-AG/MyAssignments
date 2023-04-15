package MarathonDay_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeMarathon extends MarathonProjectSpecific
{
	@BeforeTest
	public void setData() 
	{
		excelfilename="marathon_1";
	}
	@Test(dataProvider= "senddata")
	 
	public void runChromeMarathon(String question ,String detail)
	{
//		1. Launch https://login.salesforce.com/ 
		driver.get("https://login.salesforce.com/");
		
//			2. Login to Salesforce with your username and password
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		
//			3. Click on the App Launcher (dots)
		driver.findElement(By.className("slds-icon-waffle")).click();
		
//			4. Click View All
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		
//			5. Type Content on the Search box
		driver.findElement(By.className("slds-input")).sendKeys("Content");
		
//			6. Click Content Link
		driver.findElement(By.xpath("//p[contains(text(),'Content')]")).click();
		
//			7. Click on Chatter Tab
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Chatter')]"));
		driver.executeScript("arguments[0].click();", element);
		
//			8. Verify Chatter title on the page
		String title = driver.getTitle();
		if(title.contains(driver.getTitle()))
				{
			System.out.println("title is match"); 
				}
		else
		{
			System.out.println("title is not match");
		}
//			9. Click Question tab
		driver.findElement(By.xpath("//span[contains(text(),'Question')]")).click();
		
//			10. Type Question with data (coming from excel)
		driver.findElement(By.tagName("textarea")).sendKeys(question);
		//driver.findElement(By.tagName("textarea")).sendKeys("Tell me your favourite color?");	
		
//			11. Type Details with data (coming from excel)
		driver.findElement(By.xpath("//div[@contenteditable='true']//p[1]")).sendKeys(detail);
		//driver.findElement(By.xpath("//div[@contenteditable='true']//p[1]")).sendKeys("Green");
		
//			12. Click Ask
		driver.findElement(By.className("cuf-region-sidebar")).click();
		
//			13. Confirm the question appears
		
		String text = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]")).getText();
		System.out.println(text);
		if (text.contains(" favourite "))
		{
				System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
//			14. Close the browser
//		driver.quit();
	}

}
