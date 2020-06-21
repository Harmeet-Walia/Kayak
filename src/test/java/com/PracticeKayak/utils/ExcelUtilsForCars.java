package com.PracticeKayak.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsForCars {
	
	static XSSFWorkbook ExcelWBook;
	static XSSFSheet xsfSheet;
	static XSSFCell Cell;

	public static Object[][] getCarDataFromExcel(String FilePath, String sheetName, int maxColumns)
			throws Exception {
		String[][] tabArray = null;
		FileInputStream file = new FileInputStream(FilePath);
		
		ExcelWBook = new XSSFWorkbook(file);
		xsfSheet = ExcelWBook.getSheet(sheetName);
		int startRow = 1;
		int startCol = 0;
		int ci, cj;
		int totalrows = xsfSheet.getLastRowNum();
		int totalCols = maxColumns;
		tabArray = new String[totalrows][totalCols];
		ci = 0;
		for (int i = startRow; i <=totalrows; i++, ci++) {
			cj = 0;
			for (int j = startCol; j <totalCols; j++, cj++) {
				tabArray[ci][cj] = getCellData(i, j);
				System.out.println(tabArray[ci][cj]);
}

			

		}
		return tabArray;
	}
	
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			Cell = xsfSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			return "";
		}

	}

}
