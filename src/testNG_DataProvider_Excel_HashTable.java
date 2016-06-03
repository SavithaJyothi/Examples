import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import arrayrowcol.Xls_Reader;


public class testNG_DataProvider_Excel_HashTable {
	
	public static Xls_Reader reader = null;
	
	@Test(dataProvider = "dp")
	public void f(Hashtable <String, String> data) {
		
		System.out.println(data.get("username")+"***"+data.get("password")+"***"+data.get("is_Correct")+"***"+data.get("age")+"***"+data.get("gender"));
		//System.out.println(data.get("username"));
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
		//per user key and value combination
		
		// A hash table for an user ... say for user 1....3 rows only 1 column
		// user -> username, paswd and age  only 
		Object[][] data = new Object[rows-1][1];
		
		Hashtable<String,String> table = null;
		
		System.out.println(rows);
		System.out.println(cols);
		
		for (int rowNum=2; rowNum<=rows;rowNum++){
		//System.out.println("Row num:" + rowNum);
			table=new Hashtable<String,String>();
			for (int colNum=0;colNum<cols;colNum++){
				//System.out.println("Col num:" + colNum);
				
				//data[rowNum-2][colNum]=reader.getCellData(sheetName, colNum, rowNum);
				table.put(reader.getCellData(sheetName, colNum, 1), reader.getCellData(sheetName, colNum, rowNum));
				data[rowNum-2][0]=table;
				
				
			//System.out.println(data[rowNum-2][colNum]);
			}
		
		}
		return data;
		}

}
