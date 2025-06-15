package com.app.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Selenium {
	
	
	public static void excelread() {
		File fl = new File("C:\\Users\\Dell\\eclipse-workspace\\FebProjectClass\\MayProjectClass1\\src\\test\\resources\\resources\\MayExcelData.xlsx");
	    try {
			FileInputStream fis = new FileInputStream(fl);
			Workbook wk = new XSSFWorkbook(fis);
			Sheet sheet = wk.getSheet("Sheet1");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(1);
			System.out.println(cell);	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void excelread1(String sht,int r,int c) {
		File fl = new File("C:\\Users\\Dell\\eclipse-workspace\\FebProjectClass\\MayProjectClass1\\src\\test\\resources\\resources\\MayExcelData.xlsx");
	    try {
			FileInputStream fis = new FileInputStream(fl);
			Workbook wk = new XSSFWorkbook(fis);
			Sheet sheet = wk.getSheet(sht);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			System.out.println(cell);	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void excelreadAllData() {
		File fl = new File("C:\\Users\\Dell\\eclipse-workspace\\FebProjectClass\\MayProjectClass1\\src\\test\\resources\\resources\\MayExcelData.xlsx");
	    try {
			FileInputStream fis = new FileInputStream(fl);
			Workbook wk = new XSSFWorkbook(fis);
			Sheet sheet = wk.getSheet("Sheet1");
			int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			for(int i =0;i<physicalNumberOfRows;i++) {
				Row row = sheet.getRow(i);
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < physicalNumberOfCells; j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String excelreadformat(String sheetname,int i,int j) {
		 String value = null;
		File fl = new File("C:\\Users\\Dell\\eclipse-workspace\\FebProjectClass\\MayProjectClass1\\src\\test\\resources\\resources\\MayExcelData.xlsx");
	    try {
			FileInputStream fis = new FileInputStream(fl);
			Workbook wk = new XSSFWorkbook(fis);
			Sheet sheet = wk.getSheet(sheetname);
				Row row = sheet.getRow(i);
					Cell cell = row.getCell(j);
					int cellType = cell.getCellType();
					if(cellType==1) {
						value = cell.toString();
					}else if(cellType==0) {
						if(DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue(); //15-May-2025
							SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
							value = sf.format(dateCellValue);
							//System.out.println(format);
						}else {
							double numericCellValue = cell.getNumericCellValue();
							long number = (long)numericCellValue;
							System.out.println(number);
						}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static void excelWrite() {
		File fl = new File("C:\\Users\\Dell\\eclipse-workspace\\FebProjectClass\\MayProjectClass1\\src\\test\\resources\\resources\\MayProjectExcelWrite.xlsx");
	    try {
			FileInputStream fis = new FileInputStream(fl);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.createSheet("MayProject");
			Row row = sheet.createRow(1);
			Cell cell = row.createCell(2);
			cell.setCellValue("Lavanya");
			FileOutputStream fos = new FileOutputStream(fl);
			wb.write(fos);
			wb.close();
			System.out.println("SuccessFully Executed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
	public static void excelWriteReuse(String sheetname,int r ,int c,String celldata) {
		File fl = new File("C:\\Users\\Dell\\eclipse-workspace\\FebProjectClass\\MayProjectClass1\\src\\test\\resources\\resources\\MayProjectExcelWrite.xlsx");
	    try {
			FileInputStream fis = new FileInputStream(fl);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.createSheet(sheetname);
			Row row = sheet.createRow(r);
			Cell cell = row.createCell(c);
			cell.setCellValue(celldata);
			FileOutputStream fos = new FileOutputStream(fl);
			wb.write(fos);
			wb.close();
			System.out.println("SuccessFully Executed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
	
	
	public static void main(String[] args) {
//		excelread();
//		excelread1("Sheet1", 2, 1);
//		excelread1("Sheet1", 0, 2);
//		excelreadAllData();
		//excelreadformat();
		//excelWrite();
		//excelWriteReuse("Evangelin", 3, 1, "Sindhuja");
	}

}
