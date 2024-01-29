package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2 {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\lakshmiprasanna\\OneDrive\\Desktop\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		double data=sh.getRow(0).getCell(0).getNumericCellValue();
		System.out.println(data);
		
	}

}
