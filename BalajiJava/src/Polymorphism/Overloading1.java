package Polymorphism;

public class Overloading1 {
	
        // method Overloading	
	public void Add(int a, int b) // 2 integer parameter
	{
		System.out.println(a+b);
	}
	
	public void Add(int d, int c, int e) //3 integer parameter
	{
		System.out.println(d+c+e);
	}
	public void Add() // without parameter
	{
		System.out.println("non paramerized method");
	}
	
	public static void main(String[] args) {
		Overloading1 re=new Overloading1();
		re.Add(50, 100);
		re.Add(100, 100, 200);
		re.Add();
	}
}
