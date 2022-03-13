package Casting;

public class Up_casting2 extends Up_casting1
{

	     void m2()
	    {
	    	System.out.println("sub class own mtheod");
	    }
	public static void main(String[] args) {
		
		Up_casting2 up=new Up_casting2(); // NORMAL OBJECT
		up.m1();
		up.m2();
		
		Up_casting1 up1=new Up_casting2();
		up1.m1();
		//up1.m();
		
		System.err.println("----------------------------");
		
		Up_casting2 LL=new Up_casting2();
		LL.m2();
		LL.m1();
		
		
	} 

}
