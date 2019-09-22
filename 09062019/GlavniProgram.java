package Domaci;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

// Hint: Pogledajte ApachePOI biblioteke kako biste nasli metodu koja vraca index poslednjeg reda koji je ubacen.
// Istraziti kako neki String prevesti u int.

public class GlavniProgram {

	public static void main(String[] args) {
		try {
		File src= new File("Data (DOM).xls");
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wbe = new HSSFWorkbook(fis);
		HSSFSheet sheet0= wbe.getSheetAt(0);
		int rowcount = sheet0.getLastRowNum();
		double sum=0;
		for (int i = 0; i <= rowcount; i++) {
			HSSFRow r= sheet0.getRow(i);
			if (r != null) {
				double data0 = r.getCell(0).getNumericCellValue();
			//	System.out.println("Podaci iz reda " + i + " is " + data0);
				sum+=data0;
				
			} else {
				System.out.println("<Empty row>");
			}
		}
		
		System.out.println("SUMA JE:" + sum);
		wbe.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		// Istraziti kako neki String prevesti u int.
		
		String s="234";
		Integer.parseInt(s);
		Integer.valueOf(s);
		System.out.println("Prvi nacin, Int: " +Integer.parseInt(s));
		System.out.println("Drugi nacin Int: " +Integer.valueOf(s));
		}

}
