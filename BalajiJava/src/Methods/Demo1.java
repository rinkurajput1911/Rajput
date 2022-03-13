package Methods;

public class Demo1 {    // Regular method from call from  same class

	
public static void Add()   //  static method
{
System.out.println("Addition method");	
}

public void multi()   // non static class
{
System.out.println("Multilication method");	
}

public static void main(String[] args) {
	
	Demo1.Add();  // static method call
	Demo1 d1=new Demo1();
	d1.multi();     // non static method call
	
	
}


}
