package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3SnapDeal {

	public static void main(String[] args) {
//		Assignment 3:SnapDeal
//		============
//		1. Launch https://www.snapdeal.com/
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		2. Go to Mens Fashion
		driver.findElement(By.xpath("//span[@class='catText']")).click();
		
//		3. Go to Sports Shoes
		driver.findElement(By.xpath("//span[@class='linkTest']")).click();
		
//		4. Get the count of the sports shoes
		String count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println("count of the sports shoes " + count);
		
//		5. Click Training shoes
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		
//		6. Sort by Low to High
		
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']/div")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']//li)[2]")).click();
//		driver.findElement(By.className("sort-drop clearfix")).click();
//		driver.findElement(By.xpath("(//li[contains(@class,'search-li')])[1]")).click();
		
				
//		7. Check if the items displayed are sorted correctly
		 String sorted = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		 if(sorted.equalsIgnoreCase("Price Low To High"))
		 {
			 System.out.println("sorted correctly");
		 }
		 else
		 {
			 System.out.println("sorted not correctly");
		 }
		
//		8.Select the price range (900-1200)
		WebElement startPrice = driver.findElement(By.className("input-filter"));
		startPrice.clear();
		startPrice.sendKeys("900",Keys.TAB);
		WebElement toPrice = driver.findElement(By.name("toVal"));
		toPrice.clear();
		toPrice.sendKeys("1200",Keys.TAB);
		driver.findElement(By.xpath("//div[contains(text(),'GO')] ")).click();
		
//		9.Filter with color Navy 
		//driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[5]/input")).click();
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		
//		10 verify the all applied filters 
		String filters = driver.findElement(By.xpath("//div[@class='filters'])[2]/div/a")).getText();
		System.out.println("Applied filters :"  +filters);
//		11. Mouse Hover on first resulting Training shoes
		
//		12. click QuickView button
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		//driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
//		13. Print the cost and the discount percentage
		
		
		
//		14. Take the snapshot of the shoes.
//		15. Close the current window
		//driver.close();
//		16. Close the main window
}
}