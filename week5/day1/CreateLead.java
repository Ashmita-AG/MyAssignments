package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods //child class
{

	@BeforeTest
	public void setData()
	{
		excelfilename="demosales";
	}
	@Test(dataProvider= "senddata")
	public void runCreateLead(String username,String password,String companyName,String firstName,String lastName)
	//String url,String browser
	{

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	}

	@DataProvider
	public String[][] senddata() {
		String[][] data = new String[2][5];
		// First set of data
		data[0][0] = "Demosalesmanager";
		data[0][1] = "crmsfa";
		data[0][2] = "Testleaf";
		data[0][3] = "Hari";
		data[0][4] = "R";

		// Second set of data
		data[1][0] = "Demosalesmanager";
		data[1][1] = "crmsfa";
		data[1][2] = "Testleaf";
		data[1][3] = "Vikram";
		data[1][4] = "C";

		return data;
	}
}

