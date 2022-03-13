package Inheritence;

public class Super2 extends Super1 {
	
	int p=90;

	public void t1()
	{
		//Super1 r=new Super1();
		int p=100;
		System.out.println("local variable= " + p);
		System.out.println("Globle variable= " +(this.p));
		System.out.println("Globle varibale= " +(super.p));
	}
	
	public static void main(String[] args) {
		Super2 s=new Super2();
		s.t1();
		
		

	}

}
