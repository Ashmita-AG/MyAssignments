package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {

	public static  String[][] getData(String excelfilename)throws IOException
	{
		// to open the excel sheet
		XSSFWorkbook book = new XSSFWorkbook("D:\\Testleaf\\Selenium\\TestData\\demosales.xlsx");
		//to open the specific sheet
		XSSFSheet sheet = book.getSheet("Sheet1");

		// to get the no of rows in the data available
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount); 

		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		// create 2d array
		String[][] data = new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow eachRow=sheet.getRow(i);
			for(int j=0;j<=colCount;j++)
			{
				XSSFCell cell=eachRow.getCell(j);
				String val=cell.getStringCellValue();
				data[i-1][j]=val;
				//System.out.println(val);

			} 
		}book.close();
		return data;
	}
}


