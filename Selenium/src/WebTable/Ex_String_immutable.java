package WebTable;

public class Ex_String_immutable 
{
public static void main(String[] args)
{
	String s1="abc";
	String s2="abc";
	if(s1==s2)
	{
		System.out.println("address same");
	}
	System.out.println("--after modification--");
	
	s1="123";
	if(s1==s2)
	{
		System.out.println("address same");
	}
	else
	{
		System.out.println("address no same --> immutable");
	}
	int a=13;
	int b=13;
	if(a==b)
	{
//	&%=address value=%d	
			System.out.println("address same");
	}
	System.out.println("--after modification--");
	
	
	
	
	
	if(a==b)
	{
		System.out.println("address same");
	}
	else
	{
		System.out.println("address not same");
	}
}
}
