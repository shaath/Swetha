package method;

import java.io.IOException;

public class UserLoginTC extends Constants
{

	public static void main(String[] args) throws IOException
	{
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("SharathChandra", "SharathChandra");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed successfully");

	}

}
