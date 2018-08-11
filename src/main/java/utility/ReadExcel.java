package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel 
{
@Test
	public Object[][] readExcel(String fileName) throws IOException
	{
		XSSFWorkbook wBook=new XSSFWorkbook("./Excel/"+fileName+".xlsx");
		
		XSSFSheet sheet=wBook.getSheet("sheet1");
		// TODO Auto-generated method stub
		
		int rowcount=sheet.getLastRowNum();
		short columncount=sheet.getRow(0).getLastCellNum();
		Object[][] dataArray=new Object[rowcount][columncount];
		
		//read data;
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<columncount;j++)
			{
				XSSFCell cell=row.getCell(j);
				dataArray[i-1][j]=cell.getStringCellValue();
				//System.out.println(datas);
			}
		}
		wBook.close();
		return dataArray;
		

	}

}
