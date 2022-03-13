package Preactice2;
import Practice.Example3;
public class Example1 {

	 static void test1()
	{
		System.out.println("Running defauld specifier in the same class");
	}
	
	protected static void test7()
	{
		System.out.println("Running protected specifier in same class");
	}
	
	public static void main(String[] args) {
		Example3.test10();
//		Example2.test2();
//		Example3.test3();
//		//Example2.test6(); private specifier
//		test7();
//		Example2.test8();
	Example2.test9();
		
	}
}

