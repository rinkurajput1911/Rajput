package Variables;

public class Demo3 { // GLOBAL VARIABLE NOT DECLARING ANY VALUE
	int a;        // initialize global variable
	String b;     // initialize global variable
     float c;
	public void m4() // not Staic method
	{
		System.out.println(c);
	}

	public void m5() // not static method
	{
		System.out.println(b);
	}

	public static void main(String[] args) {

		Demo3 tt = new Demo3();
		tt.m4();
		tt.m5();
	}

}
