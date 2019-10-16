package com;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExtractExcelData {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File("D:\\Excel Requirement\\Sample.xls"));
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			List<String> list = new ArrayList<String>();
			List<String> columns = new ArrayList<String>();
			boolean flag = true;
			boolean flag2 = false;
			for (Row row : sheet) {
				if (flag) {
						for (Cell cell : row) {
							if (cell.getStringCellValue().equals("Country") || cell.getStringCellValue().equals("Capital")
									|| cell.getStringCellValue().equals("Continent")) {
								columns.add(cell.getStringCellValue());
							} else {
								flag2 = true;
								columns.add(cell.getStringCellValue());
							}
						}
						flag = false;
				} else {
					for (Cell cell : row) {
						if (cell.getColumnIndex() == 0) {
							list.add(cell.getStringCellValue());
						}
					}
				}
			}
			System.out.println(columns);
			System.out.println(list);
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
