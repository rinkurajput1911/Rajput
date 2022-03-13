package Package1;

import Package2.*;

public class Methods {

	public static void main(String[] args)
	{
		m1();
		m2();
		Methods20122021.demo();
		Methods20122021 ref=new Methods20122021();
		
		ref.demo2();
		Method_A.m3();
		Method_A s=new Method_A();
		s.m4();
}
	public static void m1()
	{
		System.out.println("runing static method m1.....");
	}
    public static void  m2()
    {
    System.out.println("running static mothed m2.....");
    }
}
