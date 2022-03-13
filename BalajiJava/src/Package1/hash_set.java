

package Package1;

import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
	
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
     System.out.println(hs.size());
     
       hs.add(10);
       hs.add("Ram");
       hs.add('A');
       hs.add(5.25f);
       hs.add("Ram");
       hs.add(null);
       hs.add(null);
       System.out.println(hs);
       System.out.println(hs.contains("Ram"));
       System.out.println(hs.isEmpty());
       
       hs.add(88);
       System.out.println(hs);
       hs.remove('A');
       System.out.println(hs);
       
       System.out.println("fetch the element with iterator--------");
			
           Iterator cur = hs.iterator();
           while(cur.hasNext() ) 
        		   {
        	          System.out.println(cur.next());
        		   }
		
		
		
		
	}

}
