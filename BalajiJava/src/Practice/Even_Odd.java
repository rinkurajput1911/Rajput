package Practice;

import java.util.Scanner;

public class Even_Odd {
Scanner kb=new Scanner(System.in);

int a=kb.nextInt();

public void m1()
	{
		if(a%2==0) 
		{
			System.out.println("Even No");	
		}
		else
		{
			System.out.println("Odd No");
		}
		}
	
	//print 10 even no
	public void m2()
	{	
		System.out.println("even no wants to print up to ----Max--?");
		int oddno=kb.nextInt();
		System.out.println("\neven no wants to print from ----Min--?\n");
		//int z=kb.nextInt();
		for(int z=kb.nextInt();z<=oddno;z=z+2)
		{
			System.out.println(z);
		}}
		
		public void m3()
		{	
			System.out.println("odd no wants to print up to ----Max--?");
			int oddno=kb.nextInt();
			System.out.println("\nodd no wants to print from----Min--?\n");
			//int z=kb.nextInt();
			for(int x=kb.nextInt();x<=oddno;x=x+2)
			{
				System.out.println(x);
			}

	}
 public static void main(String[]args)
 {	Scanner s=new Scanner(System.in);
	 System.out.println("Enter no to check even or odd");
	 Even_Odd oe=new Even_Odd();
	 oe.m1();

	 	 oe.m2();
	 	 oe.m3();
 }
+}
