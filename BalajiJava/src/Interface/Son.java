package Interface;

public class Son implements father, Mother {

     public void zero1()
     {
    	 System.out.println("father method zero");
     }
     public void zero2()
     {
    	 System.out.println("father method zero2");
     }
     public void zero3()
     {
    	 System.out.println("Mother method zero3");
     }
     public void zero4()
     {
    	 System.out.println("Mother method zero4");
     }
	
     public static void main(String[] args) {
		   Son r=new Son();
		   r.zero1();
		   r.zero2();
		   r.zero3();
		   r.zero4();
    	 
	}
}
