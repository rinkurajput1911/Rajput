package Exception;

public class Demo3 {

	public static void main(String[] args) {
try {
		String rt = null;

		System.out.println(rt.length());}
catch (NullPointerException e) {
	
	System.out.println("Exception occer");
}
System.out.println("program end");
     int ar[]= {14,528,47};
    
     try {
     System.out.println(ar[89]);
     }
     catch(Exception k) {
    	 System.out.println("ecxeption occuer");
     }

  System.out.println("after arry");
	}

}
