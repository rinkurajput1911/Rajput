package Variables;

public class Demo1    // FOR LOCAL VERIABLE
{
  public void s1()   // non static method
  {
	  int a=58;   // local varibale
	  int b=50;  // local varibale
	  System.out.println("local varable value a & b = "+a+ "\n" +b);
  }
  
  public void s2()  // non static method
  {
	  int c=58;    // local varibale
	  int d=80;    // local varibale
	  System.out.println("local variable value c & d= "+c+ "\n" +c);
  }
  public static void main(String[] args) {
	Demo1 de=new Demo1();
	de.s1();
	de.s2();
	
}
}
