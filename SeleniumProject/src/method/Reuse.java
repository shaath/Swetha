package method;

import java.io.IOException;

public class Reuse 
{
	public static void main(String[] args) throws IOException 
	{
		MethodsEg m=new MethodsEg();
		
//		int res=m.sum(200,300);
//		System.out.println(res);
		
		m.br_Launc("firefox", "http://primusbank.qedgetech.com/");
		m.send_text("id", "txtuId", "Admin");
		m.send_text("id", "txtPword", "Admin");
		m.click("id", "login");
		
		m.takes_screenshot("Login");
		
	}

}
