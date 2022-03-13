package Practice;
//which is greater no between 2
import java.util.Scanner;
public class Demo1 {
public void Gre_Small()
{Scanner kb=new Scanner(System.in);
System.out.println("Enter 2 no for compare");
int a=kb.nextInt();
int b=kb.nextInt();
if(a>b)
{
System.out.println(a+" is greater than "+b);	
}
else
{
	System.out.println(b+" is greater than "+a);		
}
}
public static void main(String[] args) {
	Demo1 d1=new Demo1();
	d1.Gre_Small();
 }
}
