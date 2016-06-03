package arrayrowcol;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class testNG_DataPRovider {

	@Test(dataProvider = "dp")
	public void f(String emailid, String password, int age) {
System.out.println(emailid + emailid + age);
	}

	@DataProvider
	public Object[][] dp() {
		{
			Object[][] data = new Object[2][3];
			
			data[0][0] = "savithajsp@gmail.com";
			data[0][1] = "pass@123";
			data[0][2] = 23;

			data[1][0] = "savithajsp3@gmail.com";
			data[1][1] = "pass@12345";
			data[1][2] = 45;

			return data;
		}
	}
}
