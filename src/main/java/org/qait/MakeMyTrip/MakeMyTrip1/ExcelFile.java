package org.qait.MakeMyTrip.MakeMyTrip1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFile {
	static String fileName;
	public ExcelFile() {
		fileName="C:\\Users\\somilbansal\\Desktop\\Make_My_Trip.xls";
	}

	public Sheet readExcelFile(String path) {

		FileInputStream fin = null;
		try {
			fin = new FileInputStream(path);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(fin);
		}
		catch (BiffException | IOException e) {
			e.printStackTrace();
		}
		
		Sheet sh = workbook.getSheet(0);
        return sh;
	}

	
	public  String getUserName(){
		ExcelFile xls = new ExcelFile();
		Sheet sh=xls.readExcelFile(fileName);
		return sh.getCell(1, 0).getContents();
	}
	
	public  String getPassword(){
		ExcelFile xls = new ExcelFile();
		Sheet sh=xls.readExcelFile(fileName);
		return sh.getCell(1, 1).getContents();
	}
}
