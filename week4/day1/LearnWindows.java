package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("homepage url"+driver.getCurrentUrl());
		String windowHandle = driver.getWindowHandle();
		
		driver.switchTo().window(windowHandle);
		System.out.println("parent window "+windowHandle);
		
		System.out.println("welcome to child window");
		
	driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
	driver.findElement(By.xpath("//span[text()='Window']/..")).click();
	driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> list = new ArrayList<String>(windowHandles);
	driver.switchTo().window(list.get(1));
	System.out.println("child window ref"+ windowHandles);	
	System.out.println("child window url "+driver.getCurrentUrl());
	System.out.println("Switch to  the parent window");
	driver.switchTo().window(list.get(0));
	System.out.println("close the parent window");
	driver.close();
	Thread.sleep(3000);
	System.out.println("coming back to child");;
	Set<String> windowHandles2 = driver.getWindowHandles();
	list.clear();
	list.addAll(windowHandles2);
	System.out.println("display the child window ref"+ windowHandles2);
	//switch to the child
	driver.switchTo().window(list.get(0));
	System.out.println("recent window url "+driver.getCurrentUrl());
	driver.quit();
	
	
	
	
	
//		String currentWindowRef = driver.getWindowHandle();
//		System.out.println(currentWindowRef);
//		driver.findElement(By.xpath("//span[text()='Open']/..")).click();
//		Set<String> set = driver.getWindowHandles();
//		List<String> list = new ArrayList<String>(set);
//		driver.switchTo().window(list.get(1));
//		System.out.println();
//		System.out.println(currentWindowRef);
//		  System.out.println(driver.getCurrentUrl());
//		  System.out.println(driver.getTitle()); 
//		  //driver.close();
//		  	  
//	}
//
//	private static Object get(int i) {
//		// TODO Auto-generated method stub
//		return null;
		
		
		
	}

}
