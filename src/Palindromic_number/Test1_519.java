package Palindromic_number;

public class Test1_519 {
	public static void main(String[] args) {
		
		int remainder, reverse_num=0, temp;
	    int n=519;
	 temp=n;
		while(n!=0)  //519 |51| 5|0
		{
			remainder=n%10;  //9|1|5     
			reverse_num=(reverse_num*10)+remainder;
              n=n/10;
		}
		if(temp==reverse_num)
		{
			System.out.println("palindrom number");
		}
		else
		{
			System.out.println("is not palindrom number");
		}
		
		
		
		
		
	}

}
