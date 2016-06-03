import org.testng.annotations.Test;


public class Multiple_DataProvider_Tests {

	
	@Test(dataProviderClass=Multiple_dataProviders.class, dataProvider = "dp1")
	public static void datareturn(String name, String password)
	{
		System.out.println(name+"***"+password);
	}
	
	@Test(dataProviderClass=Multiple_dataProviders.class,dataProvider = "dp1")
	public static void datareturn2(String name, String password, String age)
	{
		System.out.println(name+"***"+password+"***"+age);
	}
}
