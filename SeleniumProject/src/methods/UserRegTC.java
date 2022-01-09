package methods;

import java.io.IOException;

public class UserRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res = null;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.org_Launch("Firefox", bm.url);
		System.out.println("Application Launch "+res);
		
		res = bm.org_Login(bm.u, bm.p);
		System.out.println("Application Login "+res);
		
		res = bm.org_UserReg("Second Test", "ASecondTest", "Test@7418529630");
		System.out.println("User Registration "+res);
		
		res = bm.org_Logout();
		System.out.println("Application Logout "+res);
		
		bm.org_Close();
		System.out.println("Application closed successfully");

	}

}
