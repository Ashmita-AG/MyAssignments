package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HTML1
		//launch the urlhtml.com/tags/table/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tables");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//locate the table
		
		//get the count the number of rows
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		int rsize=row.size();
		System.out.println("no of rows  "+rsize);
		//get the count the number of columns
		List<WebElement> cols= driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
	int csize = cols.size();
	System.out.println("the number of columns  "+csize);
	}

}
