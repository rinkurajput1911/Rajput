package Variables;

public class Demo2 {                                //GLOBAL VARIABLE
    float kk=552;              // Global variable
     int pp=1;                 // Global variable
   
    public void m1()    //  non static method
    {
    	System.out.println("Globle kk= "+kk);
    }
    public void m2()     //  non static method
    {
    	System.out.println("Globle pp =" + pp);
    }
    public static void main(String[] args) {
		Demo2 re=new Demo2();
		re.m1();
		re.m2();
//		
	}
}
