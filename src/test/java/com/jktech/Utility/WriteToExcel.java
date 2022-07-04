package com.jktech.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteToExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Ragavendran.v\\eclipse-workspace\\TestNGExample\\TestData\\WriteToExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		// if file is .xlsx type, use XSSFWorkbook and file is of .xls type, then use
		// HSSFWorkbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet2");
		String UN = ws.getRow(1).getCell(0).getStringCellValue();
  	    System.out.println(UN);
  	    System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
  	    WebDriver driver  = new ChromeDriver();
  	    driver.manage().window().maximize();
  	    driver.get("https://www.w3schools.com/html/html_tables.asp");
  	    String cellValue = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText();
  	    
  	    ws.getRow(1).createCell(2).setCellValue(cellValue);
  	    FileOutputStream fos = new FileOutputStream(file);
  	    wb.write(fos);
  	    wb.close();
  	    
	}

}
