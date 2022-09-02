package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	 XSSFWorkbook wb;
	
	 public ExcelDataProvider() throws Exception {
		
		//Excel sheet Data read add jar in pom.xml-->1)apachi poi common
                                               //--->2)apachi poi OOxml


       String path="C:\\Users\\uSER\\eclipse-workspace\\Batch12_Framework\\TestData\\Test.xlsx";
       
       FileInputStream fis1=new FileInputStream(path);
       
       wb=new XSSFWorkbook(fis1);

		
	}
	 
	 //Read data on Excel sheet used to method to call
	 
	 public String getStringData(String sheetname,int row,int cell) {
		 
		return  wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		 
	 }
	 
	 
	
	
	                                         

}
