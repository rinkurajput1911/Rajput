package Palindromic_number;

public class Equals_Equal {
	
	public static void main(String[] args) {
		
		String s1=new String("Ram");
		String s2=new String("Ram");

		System.out.println(s1==s2);//== its used to address or references comparison
		String s3= "Amit";
		String s4="Amit";
		System.out.println(s3==s4);
		System.out.println("-------------------------");
		String a1="Jaipur";
		String a2="Jaipur";
		if(a1.equals(a2)) //equals methods is used to content comparisons
		{
			System.out.println("pass");
		}
		
	}

}
