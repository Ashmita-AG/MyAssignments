package LearningTestNgExamples;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class HandlingWindowEx39 {
	@Test
public void runHandling()
{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 	System.out.println("welcome to parent window");
		String windowHandle = driver.getWindowHandle();
		System.out.println("parent window ref"+windowHandle);
		System.out.println("parent window ref"+driver.getCurrentUrl());
		System.out.println("first title"+driver.getTitle());
		System.out.println("--------------------");
		System.out.println("new try");
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		
	
		System.out.println("welcome to child window");
		//driver.findElement(By.xpath("//button[@id='home']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println("child window ref "+windowHandles);
		System.out.println("child window url"+driver.getCurrentUrl());
		System.out.println("parent window is closed ");
		driver.switchTo().window(list.get(0));
		driver.close();
		System.out.println("-------");
		System.out.println("multi window");
		Set<String> windowHandles2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles2);
		driver.switchTo().window(list.get(0));// child index is 0
		System.out.println("current url is "+driver.getCurrentUrl());
		System.out.println("title of the page ***"+driver.getTitle());

		
		driver.quit();
		
		

	}

	}


