package Array_Duplicate;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int arr[]= {10,15,2,8,54,5,15};
		          // 0  1 2 3  4  5 6
		  int max=0;
		for (int i=0; i<arr.length; i++)//5
		{
			if(arr[i]>max)
			{
				max =arr[i]; //54
			}
			
			
		} System.out.println("Largest element:"+max);
		
		
		
	}

}
//int arr[]= {10,31,21,59,9,180,4};
//int max=0;
//
//for (int i = 0; i < arr.length; i++)
//{		
//	if (arr[i] > max)
//        		max = arr[i];
//	System.out.println("Largest element:"+max);
//}
//System.out.println("Largest element:"+max);
//}

