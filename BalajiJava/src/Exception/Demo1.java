package Exception;

public class Demo1
{
public static void main(String[] args) 
{
	
int a=20;
int b=0;

System.out.println("Start");

try
{
System.out.println(a/b);
}

catch(ArithmeticException e)
{
System.out.println("---the value of b is not equal to 0----");	
}
int ar[]= {1,2,3};
try
{
System.out.println(ar[5]);
}
catch(Exception e)
{
//	e.printStackTrace();
	System.out.println("Exception handle");	
}

System.out.println("Transiction complete");
		
}
}
