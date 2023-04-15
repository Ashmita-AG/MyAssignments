package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) 
	{
		//hthttps://erail.in/
		//		MAS -> SC

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("Mas",Keys.TAB);
		//Get All the train names and store it into a list
		//List<String>
		//Click on Train Name
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("Bangalore" ,Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		//WebElement table = driver.findElement(By.cssSelector("div#divTrainsList"));
		//WebElement table = driver.findElement(By.className("//table[contains(@class,'DataTable TrainList')]"));
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int size = rows.size();
		
		System.out.println("total no of rows in a table"  + size);
		List<String> list = new ArrayList<String>();
		List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		for(int i=2;i<size-1;i++)
		{
		String name = trainName.get(i).getText();
		//System.out.println(name);
		
//		After Sorting get the train names from the table
		
		list.add(name);
		
//		Sort the previously collected list
		Collections.sort(list);
//		Compare the Sort old list and new train names listtps://erail.in/	
		if(name.equals(list))
		{
			System.out.println("not sorted");
		}
		else
		{
			System.out.println("sorted");
			break;
		}
		
		//driver.close();
	}
	}
	}




