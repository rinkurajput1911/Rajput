package Blocks;

public class Sample2 {

   public static void f1() // non static method
   {
	   System.out.println("This is method in different class");
   }
   
  static
   {
	   System.out.println("Running  static block in different class");
   }
  
  {
	  System.out.println("running non static block");
  }
  
   
   
	
}
