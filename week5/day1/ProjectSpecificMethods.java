package week5.day1;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class ProjectSpecificMethods //base class write code for -> open & close browser,@DataProvider
{
	public RemoteWebDriver driver;
	public String excelfilename;

	@Parameters({"url","browser"})
	@BeforeMethod

	public void openBrowser(String url,String browser)
	{  

		switch (browser)
		{  
		case "Chrome":
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

			break;
		}
		case "edge":
		{
			driver=new EdgeDriver();

			break;
		}
		default:
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	@DataProvider
	public String[][] senddata() throws IOException
	{
		String[][] data = ExcelData.getData(excelfilename);
						//ExcelData className.getData methodName  used in class ExcelData
		return data;
	}

}