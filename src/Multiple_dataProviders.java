import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Multiple_dataProviders {

	
	
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m)
	{
		//Object[][] data = new Object[2][2];
		Object[][] data=null;
		
		if (m.getName().equals("datareturn"))
		{
			data = new Object[2][2];
		data[0][0] = "Rudra";
		data[0][1]="rudra456";
		
		data[1][0] = "Rudra1";
		data[1][1]="rudra4536";
		}
		
		else if (m.getName().equals("datareturn2"))
		{
			data = new Object[2][3];
			data[0][0] = "Rudra";
			data[0][1]="rudra456";
			data[0][2]="32";
			
			data[1][0] = "Rudra1";
			data[1][1]="rudra4536";
			data[1][2]="54";
			
		}
		return data;
				
	}
	/*@DataProvider(name="dp2")
	public Object[][] getData1()
	{
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Rudra";
		data[0][1]="rudra456";
		data[0][2]="32";
		
		data[1][0] = "Rudra1";
		data[1][1]="rudra4536";
		data[1][2]="54";
		
		return data;
				
	}
	*/
}
