package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1 {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\lakshmiprasanna\\OneDrive\\Desktop\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		String data=sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		String data1=sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data1);
		String data2=sh.getRow(2).getCell(2).getStringCellValue();
		System.out.println(data2);
		String data3=sh.getRow(3).getCell(3).getStringCellValue();
		System.out.println(data3);
	}

}
