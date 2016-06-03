
public class EqualsandComparision {

	public static void main(String[] args) {
		String s1 ="Hello";
		String s2="Hello";
		
		// == it returns true if object reference or address is same
		//.equals compares the content in the variables
		
		System.out.println(s1==s2);;
		System.out.println(s1.equals(s2));
		
		int x=100;
		int y = 100;
		
		System.out.println(x==y);
		
		String s3= new String("Welcome");
		String s4= new String("Welcome");
		
		System.out.println(s3==s4);
		// it returned false although the content is same 
		//but s3 is pointing to some address location in memory 
		// and s4 to some other location in memory
		System.out.println(s3.equals(s4));
		
		//The below two object ref points to same address with the help of singleton design pattern 
		
		SingletonDesignPattern sing1 = SingletonDesignPattern.createInstance();
		SingletonDesignPattern sing2 = SingletonDesignPattern.createInstance();
		
		
		System.out.println(sing1);
		System.out.println(sing2);
	}

}
