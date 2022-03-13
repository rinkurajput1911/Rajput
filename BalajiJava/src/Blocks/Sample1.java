package Blocks;

public class Sample1 {

	// decalre static block
	static {
		System.out.println("This is Static block");
	}

	{
		System.out.println("this is non satatic block");
	}

	public static void main(String[] args) {

		System.out.println("This is main method");
//		
		Sample1 s = new Sample1();
//		
//  Sample2 e=new Sample2();
//   	      e.f1();
		Sample2.f1();
	}

}
