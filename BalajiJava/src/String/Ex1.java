package String;

public class Ex1
{
public static void main(String[] args) 
{
	
	String s="Velocity";
	String s2="VELOCITY";
	String s1=new String ("abcabdc");
	String s3=new String ("IaAmaSmitaDeulkar");
	System.out.println(s.length());
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.indexOf('y'));
	System.out.println(s1.indexOf('b'));	
	System.out.println(s1.lastIndexOf('a'));	//3
	System.out.println(s.equals(s1));	//false
	System.out.println(s.equals(s2));	//false
	System.out.println(s.equalsIgnoreCase(s2));	//true
	System.out.println(s.startsWith("Ve"));	//true
	System.out.println(s.endsWith("y"));	//true
	System.out.println(s.substring(4));
	System.out.println(s.substring(4, 7));
//	System.out.println(s3.split("a"));---we have to convert it into array
	String S4[]=s3.split("a");
	System.out.println(S4.length);
	System.out.print(S4[0]);
	System.out.print(S4[1]);
	System.out.print(S4[2]);
	System.out.print(S4[3]);
	System.out.print(S4[4]);	//5		index no 0-4
	System.out.println("\n------for loop-----");
	
	for(int i=0;i<=4;i++)
	{
		System.out.println(S4[i]);
	}
	System.out.println("---------for each loop--------");

	for(Object a:S4)
	{
		System.out.println(a);
		
	}




}
}
