package Polymorphism;

public class TestSon {
        // Example of method overloading
	public static void main(String[] args) {
		Father f=new Father ();
		f.car();
		f.money();
		f.home();
		
		System.out.println("------------------------ ");
		
		Son s=new Son();
		s.car();
		s.money();
		s.home();
		

	}

}
