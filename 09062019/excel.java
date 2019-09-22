package Domaci;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Exel {
	private static HSSFWorkbook wb;
	private static HSSFSheet sheet = null;

	public static boolean setExel(String path) {
		if (wb != null) {
			try {
				wb.close();
			} catch (Exception e) {
				System.out.println(e.toString());
				return false;
			}
		}
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);

			wb = new HSSFWorkbook(fis);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lose otvaranje fajla!");
			return false;
		}
	}

	public static boolean setWorkeSheet(int index) {
		try {
			sheet = wb.getSheetAt(index);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lose otvaranje worksheeta!");
			return false;
		}
	}

	public static String getDataAt(int row, int coulme) {
		try {
			HSSFRow r = sheet.getRow(row);
			HSSFCell celija = r.getCell(coulme);
			return celija.toString();

		} catch (NullPointerException e) {
			System.out.println();
			System.out.println("nesto je null");
		} catch (Exception e) {
			System.out.println();
			System.out.println("Doslo je do greske");
		}
		return "";

	}

	public static boolean closeExcel() {
		if (wb != null) {
			try {
				wb.close();
				wb = null;
				return true;
			} catch (IOException e) {
				e.printStackTrace();
				wb = null;
				return false;
			}
		}
		return true;
	}
}
