package com.Actitime.Generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellibrary implements Autoconstant
{
	public static String getCellValue(String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		String cellvalue=workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
	}


	
}
