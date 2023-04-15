package LearningTestNgExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	RemoteWebDriver driver;
	@Parameters({"emailId","password","browser"})
@Test
public void login(String username,String passwd,String browser)
{
		switch(browser)
		{
		case "chrome":
		{ driver = new ChromeDriver();
			break;
		}
		case "edge":
		{
			driver = new EdgeDriver();
			break;
		}
		default:
			System.err.println("browser is not match");
		}
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--disable-notifications");
	//ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://letcode.in/signin");
	//login
	driver.findElement(By.linkText("Log in")).click();
	//username
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	//password
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwd);
	//login
	driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	//title
	System.out.println("title"+driver.getTitle());
	driver.quit();

}
}
