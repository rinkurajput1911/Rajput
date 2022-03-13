package acessSpecifiers;

public class Sample1 

{
 public void test1()
 {
	 System.out.println("Running public access specifier");
	 
 }
 public static void main(String []args)
 {
	 Sample1 t=new Sample1();
       t.test1();
	 Sample2 n=new Sample2(); //object samle2
	 n.s1(); // call
//	 
//	 Sample5 l=new Sample5();
//	 l.lan();
	 

 }
 
}
