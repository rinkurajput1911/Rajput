package Exception;

public class Demo2
{
	public static void main(String[] args) 
	{
		
	int a=20;
	int b=2;

	System.out.println("Start");

	try
	{
	System.out.println(a/b);
	int ar[]= {1,2,3};
	System.out.println(ar[1]);
	}

	catch(ArithmeticException e)
	{
	System.out.println("---the value of b is not equal to 0----");	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("---the value of array index is max 2----");	
	}
	catch(Exception e)
	{
	System.out.println("---enter valid chice----");	
	}
	
	System.out.println("Transiction complete");
			
	}
	}

