package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_Class {
	
	public static void main(String[] args) {
		Vector tt=new Vector();
		System.out.println(tt.capacity());
		System.out.println(tt.isEmpty());
		    tt.add("Robin");
	  	    tt.add(555);
	  	    tt.add('g');
             tt.add(null);
             tt.add(555);
             tt.add(null);
		System.out.println(tt); //[Robin, 555, g, null, 555, null]
		System.out.println(tt.size());//6
		System.out.println(tt.contains("Robin"));//true
		
		System.out.println(tt.remove(3)); // remove 3 index element
		System.out.println(tt);
		System.out.println(tt.set(0, 888));
		System.out.println(tt);
		System.out.println(tt.indexOf(555));//doubt
        System.out.println(tt.lastIndexOf(555));	// 3 index	
       System.out.println(tt.contains(null)); // true
       tt.add(3, "Ram");
       System.out.println(tt);
       System.out.println("------------------Reading using enumratior");
       
        Enumeration enm = tt.elements();
        
        while(enm.hasMoreElements())
        {
        	System.out.println(enm.nextElement());
        }
       
   Collections.reverse(tt);
   System.out.println("--------------reading vector reverse");
   
   Enumeration enm1 = tt.elements();
   
   while(enm1.hasMoreElements())
   {
   	System.out.println(enm1.nextElement());
   }
  
       
       
       
       
       
       
       
       
       
       
       
       
       
     //  System.out.println(tt);
       
       
       
		
	}

}
