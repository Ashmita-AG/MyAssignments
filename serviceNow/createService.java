package serviceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class createService {

	public static void main(String[] args) 
	{
		
//developer.servicenow.com

//1. Launch ServiceNow application
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://dev62925.service-now.com/navpage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//2. Login with valid credentials (refer the document to create the instance)
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("GAhMak34tH-^");
		driver.findElement(By.id("sysverb_login")).click();
		
//3. Enter Incident in filter navigator and press enter"
//		Shadow dom = new Shadow(driver);
//		WebElement path = dom.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']");
//		path.click();

		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(20);
		WebElement all = dom.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']");
		all.click();
		System.out.println("welcome");
		//filter
		//WebElement filter = dom.findElementByXPath("//input{@id='filter']");
		WebElement filter = dom.findElementByXPath("//*/span[contains(text(),'Incident')]");
		//dom.setImplicitWait(20);
		filter.sendKeys("Incident",Keys.ENTER);
		
		
		
		
//4. Click on Create new option and fill the manadatory fields
		driver.findElement(By.id("sysverb_new")).click();
		//short description
		driver.findElement(By.id("incident.short_description")).sendKeys("Halfway Done");
		WebElement dropdown = driver.findElement(By.id("incident.urgency"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("1 - High");
		//state
		WebElement state = driver.findElement(By.cssSelector("incident.state"));
		Select dd1 = new Select(state);
		dd1.selectByVisibleText("New");
		//knowldege&catalog
		WebElement kcatlog = driver.findElement(By.id("searchresource_dropdown"));
		Select dd2 = new Select(kcatlog);
		dd2.selectByValue("Open Outages");
		driver.findElement(By.id("sysverb_insert_bottom")).click();
//5. Verify the newly created incident ( copy the incident number and paste it in search field and enter then verify the instance number created or not)
String text = driver.findElement(By.id("incident.number")).getText();
if(text.equals("INC0010121"))
{
	System.out.println("incident number is matched");
	
}
else
{
	System.out.println("incident number is not matched");
}


	}

}
