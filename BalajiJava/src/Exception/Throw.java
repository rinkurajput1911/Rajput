package Exception;

public class Throw {
    public static void main(String[] args) throws Exception  {
		int age=85;
    	if(age<18)
		{
			throw new Exception ("Cant eligible for vote");
		}
		
		else {
			
			System.out.println("eligible");
		}
    	
    	
	} 
	
	
	
}
