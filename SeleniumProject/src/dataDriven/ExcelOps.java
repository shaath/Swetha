package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import method.OrgHRM;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOps {

	public static void main(String[] args) throws IOException
	{
		OrgHRM om=new OrgHRM();
		String xlpath="F:\\Swetha_Recordings\\Swetha\\SeleniumProject\\src\\testdata\\Emp_TestData.xlsx";
		String xlout="F:\\Swetha_Recordings\\Swetha\\SeleniumProject\\src\\results\\EmpRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Empreg");
//		XSSFRow r=ws.getRow(8);
//		XSSFCell c=r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		System.out.println(rc);

		om.org_Launch("http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c1=r.getCell(0);
			XSSFCell c2=r.getCell(1);
			XSSFCell c3=r.createCell(2);
			
			String f=c1.getStringCellValue();
			String l=c2.getStringCellValue();
			
			System.out.println(f+"---"+l);
			String res=om.org_Empreg(f, l);
			
			c3.setCellValue(res);
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

}
