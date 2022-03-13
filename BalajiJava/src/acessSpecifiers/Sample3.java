package acessSpecifiers;

import Package1.A;

public class Sample3 
{
  private void ram()
  {
	  System.out.println("Running private access specifiers from same class");
  }
  
  public static void main(String []args)
  {
	  Sample3 m=new Sample3();
	  m.ram();
	  Sample4 k=new Sample4();
	 // k.sam(); ///due to Private access specifier we can not access 
	   A e=new A();
	   e.pub();
	   e.deft();
	  
	  
  }
}
