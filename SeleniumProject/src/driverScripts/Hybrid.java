package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import method.OrgHRM;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid 
{
	public static void main(String[] args) throws IOException
	{
		String res=null;
		String uname=null;
		String cpswd=null;
		OrgHRM oh=new OrgHRM();
		String xlpath="F:\\Swetha_Recordings\\Swetha\\SeleniumProject\\src\\testdata\\Hybrid.xlsx";
		String xlout="F:\\Swetha_Recordings\\Swetha\\SeleniumProject\\src\\results\\HybridRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("TestData");
		XSSFSheet ws3=wb.getSheet("Empreg");
		
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		int empRc=ws3.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++)
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcId)) 
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						switch (key) 
						{
						case "Launch":
							String url=ws2.getRow(1).getCell(0).getStringCellValue();
							res=oh.org_Launch(url);
							break;
						case "login":
							String u=ws2.getRow(1).getCell(1).getStringCellValue();
							String p=ws2.getRow(1).getCell(2).getStringCellValue();
							res=oh.org_Login(u, p);
							break;
						case "logout":	
							res=oh.org_Logout();
							oh.org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= empRc; k++)
							{
								String f=ws3.getRow(k).getCell(0).getStringCellValue();
								String l=ws3.getRow(k).getCell(1).getStringCellValue();
								res=oh.org_Empreg(f, l);
								ws3.getRow(k).createCell(2).setCellValue(res);
							}
							
							break;
						case "Usereg":
							
							String ename=ws2.getRow(1).getCell(5).getStringCellValue();
							uname=ws2.getRow(1).getCell(6).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(7).getStringCellValue();
							cpswd=ws2.getRow(1).getCell(8).getStringCellValue();
							res=oh.org_Userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":	
							res=oh.org_Login(uname, cpswd);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();

	}

}
