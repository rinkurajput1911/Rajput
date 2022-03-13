package Methods;

public class This {
	 static int a=5;
	
	public void m1()
	{
		static int a=8;
		System.out.println(a);
	}
	public static void main(String[] args) {
		//This t=new This ();
		m1();
	}

}
