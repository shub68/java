package readDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readData {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\data\\import.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Sheet1");

		XSSFRow r2 = ws.getRow(1);
		XSSFRow r3 = ws.getRow(2);

		XSSFCell c2 = r2.getCell(1);
		String c3 = r3.getCell(1).toString();
		System.out.println("ce:-" + c2);
		// System.out.println(c3);

		// String c4=c2.concat(c3);
		// System.out.println(c4);
	}

}
