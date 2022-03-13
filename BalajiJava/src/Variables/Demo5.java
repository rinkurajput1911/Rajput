package Variables;

public class Demo5 {   //same gloable varible use this keyword
 int d=500;  // global variable
 
 public void m7()  //non static method
 {   int d=600;   //local variable
	 System.out.println(this.d);
 }
 public static void main(String[] args) {
	
	 Demo5 uu=new Demo5();
	 uu.m7();
}
}
