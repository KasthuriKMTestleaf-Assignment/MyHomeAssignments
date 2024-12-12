package week5.week5day2HomeAssignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcel {

	public static String[][] readExcel() throws IOException {
		XSSFWorkbook wbook= new XSSFWorkbook("./files/LegalEntityAdd.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(1).getLastCellNum();
		//declare 2D array
		String[][] data = new String[lastRowNum][lastCellNum];
		for(int i=1;i<=lastRowNum;i++)
		{
			for(int j=0;j<lastCellNum;j++)
			{
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]= stringCellValue;
			}
		}
		return data;
		

	}

}
