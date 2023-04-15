package MarathonDay_3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class MarathonProjectSpecific 
	{
		public RemoteWebDriver driver;
		public String excelfilename;

		@BeforeMethod

		public void openBrowser()
		{  


			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.get("https://login.salesforce.com/");
			//2. Login to Salesforce with your username and password
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			driver.findElement(By.id("password")).sendKeys("Leaf@123");
			driver.findElement(By.id("Login")).click();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		@AfterMethod
		public void closeBrowser()
		{
			//driver.close();
		}
		@DataProvider
		public String[][] senddata() throws IOException
		{
			String[][] data = MarathonReadExcel.getData(excelfilename);
			return data;
		}

	}

	

