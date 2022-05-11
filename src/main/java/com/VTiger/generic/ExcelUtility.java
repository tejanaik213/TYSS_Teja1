package com.VTiger.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String readDatafromExcel(String sheetname,int rownum,int cellnum) throws Throwable, Throwable, Throwable 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\teja\\OneDrive\\Desktop\\SDET6.xlsx");
	  return  WorkbookFactory.create(fis).getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	    
	}
	public int readNumericDatafromExcel(String sheetname,int rownum,int cellnum) throws Throwable
	{
	FileInputStream fis = new FileInputStream("C:\\Users\\teja\\OneDrive\\Desktop\\SDET6.xlsx");
	int value=(int) WorkbookFactory.create(fis).getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
	return value;
	}
	
	public int getlastrow(String Sheetname) throws Throwable
	
	{
	FileInputStream fis = new FileInputStream("C:\\Users\\teja\\OneDrive\\Desktop\\SDET6.xlsx");
	int lastrow = WorkbookFactory.create(fis).getSheet(Sheetname).getLastRowNum();
	return lastrow;
	
	}
}
