package Exception;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Demo4 {
	
	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
	    try {
		System.out.println(a/b);}
	    catch(Exception h) {
	    	System.out.println("exception occer");
	    }
	    System.out.println("end-----------------");
	}
	

}
