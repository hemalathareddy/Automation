package collecprog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class splitstring {
  
	@Test
	public void getDeliveryModeDetails() throws Exception {
		
		String format="json";
		
		////Get the env details from Properties file
		File file_prop= new File("C:\\Users\\snagulla_hbad\\Desktop\\Automation\\API\\TestNG\\Configuration.properties");
		
		////Call the FileInutStream class 
		FileInputStream fileinput= new FileInputStream(file_prop);
		
		////Call the properties class
		Properties prop= new Properties();
		try{
			prop.load(fileinput);
		}
		catch(Exception exe){
			exe.printStackTrace();
		}
		
		String Endpoint_Url= prop.getProperty("Server_url");
		//System.out.println("Server End Point is: "+Endpoint_Url);
		
		
		/**File file_testdata= new File("C:\\Users\\snagulla_hbad\\Desktop\\Automation\\API\\TestData\\PH_TestData.xlsx");
		FileInputStream fis= new FileInputStream(file_testdata);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("GetDeliveryModes");
		String resourceURL=sheet.getRow(1).getCell(0).getStringCellValue();**/
		//System.out.println(cellValue);
		
		String Final_URL= Endpoint_Url+resourceURL;
		
		
		StringBuffer sb= new StringBuffer(Final_URL);		
		
		
		sb.append(prop.getProperty("MerchantId"));
		
		String NewFinalURL=sb.toString();
		
		URL url= new URL(NewFinalURL);
		
		HttpURLConnection conn= (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("Accept-Language", "en-US,en;q=0.8l");
		conn.connect();
		
		int resCode= conn.getResponseCode();
		String resMsg= conn.getResponseMessage();
		
		System.out.println("Response Code is: "+resCode+"\n"+"Response Message is: "+resMsg);
		
		InputStream IS=conn.getInputStream();
		
		InputStreamReader ISR= new InputStreamReader(IS);
		
		BufferedReader BR= new BufferedReader(ISR);
		
		String inputline="";
		
		StringBuffer response=new StringBuffer();
		
		while((inputline=BR.readLine())!=null){
			response.append(inputline);
			
		}
		System.out.println("Get the response as: "+"\n"+response.toString());
		
		/*
		String temp[]=response.toString().split(":");
		System.out.println("Delivery Modes are: "+temp[1]);
		String temp1[]=temp[1].toString().split("],");
		System.out.println("Individual Delivery Modes are: "+temp1[0]);
		String temp2[]=temp1[0].toString().split("[");
		System.out.println("Individual Delivery Modes are: "+temp2[1]);
		*/
		
		
		String temp[]=response.toString().split("]");
		System.out.println("Delivery Modes are: "+temp[0]);
		String temp1[]=temp[0].toString().split(":");
		System.out.println("Individual Delivery Modes are: "+temp1[1]);
		
		
		
		
		
		/*
		FileOutputStream fos= new FileOutputStream(file_testdata);
		XSSFWorkbook wb1= new XSSFWorkbook(fos);
		wb1.write(fos);
		*/
		
		
  }
}