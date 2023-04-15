package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chittorgarh {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);

		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//launch the url
		//click on stock market
		driver.findElement(By.xpath("//a[contains(text(),'STOCK MARKET ')]")).click();
		//click on NSE bulk deals
		driver.findElement(By.xpath("(//a[contains(text(),'NSE Bulk Deals')])[1]")).click();
		//get all the security names
		List<WebElement> security = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']/tbody/tr/td"));
		int size = security.size();
		//get the text from security names

		List<String> list = new ArrayList<String>();
		//add the values in the list
		for(int i=0;i<size;i++)
		{
			list.add(security.get(i).getText());

		}

		//ensure whether there are duplicate security names
		//pass to string inorder to avoid duplicates
		Set<String> set = new HashSet<String>(list);
		if (list.size()!=set.size()) 
		{
			System.out.println("contains duplicates name");	
		} else 
		{
			System.out.println("no duplicates name");
		}
		
	}
}
