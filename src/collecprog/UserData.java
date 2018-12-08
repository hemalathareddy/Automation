package collecprog;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class UserData {
	
	String xlFilePath="C:\\Users\\hemalatha.e\\Desktop\\Capillary\\CSVFiles\\TestData.xlsx";
	String sheetName="Credentails";

	
	@BeforeMethod
	public void SaveExcel(){
		System.out.println("Excel Sheet is Saved");
	}
	
	
  @Test
  public void testData(String xlFilePath, String sheetName) throws Exception{
	  Object[][] data=null;
	  
	  File file=new File(xlFilePath);
      
      ///////Instance for fileInputStream
      FileInputStream fis= new FileInputStream(file);
      
      XSSFWorkbook workbook=new XSSFWorkbook();
      ////Get the Sheet from WorkBook and create instance for it
      XSSFSheet sheet=workbook.getSheet(sheetName);
      int rowCount=sheet.getLastRowNum();
      int ColCount=sheet.getRow(0).getLastCellNum();
      data= new Object[rowCount][ColCount];
      for (int rCnt=1; rCnt<=rowCount;rCnt++){
    	  for (int cCnt=0; cCnt<ColCount;cCnt++){
    		  data[rCnt-1][cCnt] = sheet.getRow(rCnt).getCell(cCnt).getStringCellValue();
    		  System.out.println(data[rCnt-1][cCnt]);
    	  }
      }
      workbook.close();
      fis.close();
	  
      
	  
  }
}
