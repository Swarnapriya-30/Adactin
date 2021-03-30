package com.testng.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\DINESH\\eclipse-workspace\\ProjectMaven\\Credentials.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		//==============READ TEST DATA===================
		
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
					CellType cellType = cell.getCellType();
					
					if (cellType.equals(CellType.STRING)) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					}
					else if (cellType.equals(CellType.NUMERIC)) {
						double val = cell.getNumericCellValue();
						String getNumericCellValue = String.valueOf(val);
						System.out.println(getNumericCellValue);
					}
			 }
		}
		
		//=============WRITE TEST DATA==================
		
		Sheet createSheet = wb.createSheet("Personal Info3");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Name");
		
		Cell createCell1 = createRow.createCell(1);
		createCell1.setCellValue("Swarnapriya");
		
		Row createRow1 = createSheet.createRow(1);
		Cell createCell2 = createRow1.createCell(0);
		createCell2.setCellValue("Father's Name");
		
		Cell createCell3 = createRow1.createCell(1);
		createCell3.setCellValue("Sivakumar");
		
		Row createRow2 = createSheet.createRow(2);
		Cell createCell4 = createRow2.createCell(0);
		createCell4.setCellValue("DOB");
		
		Cell createCell5 = createRow2.createCell(1);
		createCell5.setCellValue("30/10/1998");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Write Operation done Successfully");
		
	}
}
