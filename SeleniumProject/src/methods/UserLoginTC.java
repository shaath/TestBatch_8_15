package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws IOException, InterruptedException {
		String res = null;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.org_Launch("Firefox", bm.url);
		System.out.println("Application Launch "+res);
		
		res = bm.org_Login("ASecondTest", "Test@7418529630");
		System.out.println("Application Login "+res);
		
		res = bm.org_Logout();
		System.out.println("Application Logout "+res);
		
		bm.org_Close();
		System.out.println("Application closed successfully");

	}

}
