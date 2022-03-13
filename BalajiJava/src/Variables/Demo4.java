package Variables;

public class Demo4 { ///STATIC GLOBAL VARIABLE or class variable
	
static int ff=25;  //static variable  we can use static as well non static method
  static int dd=88;
 public static void m6()  //static method
 {
	 System.out.println(dd);
 }
 public void m7()   //  non static method
 {
	 System.out.println("static varible dd= "+dd);
 }
      public static void main(String[] args) {
		Demo4.m6();
		Demo4 yy=new Demo4();
		yy.m7();
	} 
 


}
