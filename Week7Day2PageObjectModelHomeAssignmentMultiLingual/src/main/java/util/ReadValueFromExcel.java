package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcel {
public static String[][] readValue(String fileName) throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		short cellcount = sheet.getRow(1).getLastCellNum();
		//declared array
		String data[][] = new String[rowNum][cellcount];
		
		//storing value into array from excel
		for(int i=1;i<=rowNum;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]= stringCellValue;
			}
		}
		wbook.close();
		return data;
		
	}

}
