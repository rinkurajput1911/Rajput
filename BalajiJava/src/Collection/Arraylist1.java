package Collection;

import java.util.ArrayList;
import java.util.Iterator;

import Practice.exception;

public class Arraylist1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());
		ar.add(525);
		
		ar.add('A');
		ar.add("Rajput");
		ar.add(null);
		ar.add(525);
		ar.add(0);
		System.out.println(ar.size());
		System.out.println(ar);
	System.out.println(ar.isEmpty());
		System.out.println(ar.clone());
	
		System.out.println(ar.contains(null));
		ar.add("rinku");
		System.out.println();
	   System.out.println(ar.remove(2));
	   System.out.println(ar);
	   ar.add(5, "ooooo");
	   System.out.println(ar);
	  System.out.println("------------------------------------------");
	  System.out.println(ar.get(1));
	  System.out.println(ar.indexOf(null));
	  System.out.println(ar.lastIndexOf(525));
 Iterator uu = ar.iterator();
//	   while(uu.hasNext()) {
//		   Thread.sleep(2000);
//		   System.out.println(uu.next());
//		    } // or
 for(int i=0; i<ar.size(); i++)
 {
	 System.out.println(ar.get(i));
	 Thread.sleep(2000);
 }
	   
	   
	   

		
		
		
		
		
	}

}
