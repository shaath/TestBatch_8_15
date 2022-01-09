package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Login
		String res = null;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.org_Launch("Firefox", bm.url);
		System.out.println("Application Launch "+res);
		
		res = bm.org_Login(bm.u, bm.p);
		System.out.println("Application Login "+res);
		
		res = bm.org_Logout();
		System.out.println("Application Logout "+res);
		
		bm.org_Close();
		System.out.println("Application closed successfully");
		
		//EmpReg
		res = bm.org_Launch("Firefox", bm.url);
		System.out.println("Application Launch "+res);
		
		res = bm.org_Login(bm.u, bm.p);
		System.out.println("Application Login "+res);
		
		res = bm.org_EmpReg("Second1", "Test1", "ST56741");
		System.out.println("Employee Registration "+res);
		
		res = bm.org_Logout();
		System.out.println("Application Logout "+res);
		
		bm.org_Close();
		System.out.println("Application closed successfully");
		
		//UserReg
		res = bm.org_Launch("Firefox", bm.url);
		System.out.println("Application Launch "+res);
		
		res = bm.org_Login(bm.u, bm.p);
		System.out.println("Application Login "+res);
		
		res = bm.org_UserReg("Second1 Test1", "ASecond1Test1", "Test@7418529630");
		System.out.println("User Registration "+res);
		
		res = bm.org_Logout();
		System.out.println("Application Logout "+res);
		
		bm.org_Close();
		System.out.println("Application closed successfully");

		//user Login
		
		res = bm.org_Launch("Firefox", bm.url);
		System.out.println("Application Launch "+res);
		
		res = bm.org_Login("ASecond1Test1", "Test@7418529630");
		System.out.println("Application Login "+res);
		
		res = bm.org_Logout();
		System.out.println("Application Logout "+res);
		
		bm.org_Close();
		System.out.println("Application closed successfully");
	}

}
