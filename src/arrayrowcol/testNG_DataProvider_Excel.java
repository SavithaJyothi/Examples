package arrayrowcol;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class testNG_DataProvider_Excel {

	public static Xls_Reader reader = null;
	@Test(dataProvider = "dp")
	public void f(String username, String password, String is_Correct) {
		
		System.out.println(username +"***"+password+"***"+is_Correct);
	}

	@DataProvider
	public Object[][] dp() {
		
	//	Object[][] data = new Object[2][3];
		
		if (reader==null)
		{
			reader=new Xls_Reader("E:\\Selenium\\testData.xlsx");
		}
		
		String sheetName = "LoginTest";
		int rows=reader.getRowCount(sheetName);
		int cols = reader.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		System.out.println(rows);
		System.out.println(cols);
		
		for (int rowNum=2; rowNum<=rows;rowNum++){
		//System.out.println("Row num:" + rowNum);
			for (int colNum=0;colNum<cols;colNum++){
				//System.out.println("Col num:" + colNum);
				
				data[rowNum-2][colNum]=reader.getCellData(sheetName, colNum, rowNum);
				
			//System.out.println(data[rowNum-2][colNum]);
			}
		
		}
		return data;
		}
}
