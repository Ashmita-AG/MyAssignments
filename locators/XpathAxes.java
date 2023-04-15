package locators;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	//private static String ;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		//self
		/*String text = driver.findElement(By.xpath("//a[contains(text(),'Bajaj Steel Ind.')]/self::a")).getText();
		System.out.println(text);
		//eg 2
		 
		//parent
		String text2 = driver.findElement(By.xpath("//a[contains(text(),'Bajaj Steel Ind.')]/parent::td")).getText();
		System.out.println(text2);
		// ancestor
		System.out.println("ancestor");
		String text3 = driver.findElement(By.xpath("//a[contains(text(),'Bajaj Steel Ind.')]/ancestor::tr")).getText();
		System.out.println(text3);
		// no of child for ancestor using grandchild
		//List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Bajaj Steel Ind.')]/ancestor::tr/child::td")).size();
		//System.out.println(childs.size());
	
	//descendant
		String text4 = driver.findElement(By.xpath("//a[contains(text(),'Bajaj Steel Ind.')]/ancestor::tr/descendant::*")).getText();
	System.out.println(text4);*/
		
	// self eg 2
		String text = driver.findElement(By.xpath("//a[contains(text(),'Pan Electronics')]/self::a")).getText(); 
		System.out.println(text);
	//parent eg 2
		String text2 = driver.findElement(By.xpath("//a[contains(text(),'Pan Electronics')]/parent::td")).getText();
		System.out.println(text2);
	// no of childs for grandparents from self node a
		List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'Pan Electronics')]/ancestor::tr/child::td"));
		System.out.println("no of child nodes " +list.size());
		
		
		
		
		
	}

}
