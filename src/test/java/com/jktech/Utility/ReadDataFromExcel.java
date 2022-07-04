package com.jktech.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		  File file = new File(
		  "C:\\Users\\Ragavendran.v\\eclipse-workspace\\TestNGExample\\TestData\\WriteToExcel.xlsx"
		  ); FileInputStream fis = new FileInputStream(file); 
		  // if file is .xlsx type, use XSSFWorkbook and file is of .xls type, then use HSSFWorkbook 
		  XSSFWorkbook wb = new XSSFWorkbook(fis); 
		  XSSFSheet ws = wb.getSheet("Sheet2"); 
		  XSSFRow row = ws.getRow(1); 
		  XSSFCell cell = row.getCell(0); 
		  String UN = cell.getStringCellValue(); 
		  System.out.println(UN);
		  wb.close();
		
		
		
		//int rowCount = ws.getLastRowNum();
		
		/*
		 * for(int i=1;i<=rowCount;i++) {
		 * 
		 * String userName = ws.getRow(i).getCell(0).getStringCellValue(); String
		 * password = ws.getRow(i).getCell(1).getStringCellValue();
		 * System.out.println(userName); System.out.println(password);
		 * 
		 * }
		 */
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
