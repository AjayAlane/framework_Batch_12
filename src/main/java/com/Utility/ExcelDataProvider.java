package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String path="F:\\Batch_Framework_12\\TestData\\Test.xlsx";
		FileInputStream fis1=new FileInputStream(path);
		 wb=new XSSFWorkbook(fis1);
		
	}
	public String getStringData(String Sheetname,int row,int cell) {
	return	wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
