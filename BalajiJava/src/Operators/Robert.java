package Operators;

//public class Robert {
//	
//	public static void main(String[] args) {  ///pre-decrement
//		int a=30;
//		System.out.println("value before decreement of a= "+a);//30
//		int b=--a;
//		System.out.println("value of b= "+b ); //29
//		System.out.println("after decrement value of a = " +a); //29
//		
//	}
//
//}


public class Robert {
	
	public static void main(String[] args) {  ///post-decrement
		int a=10;
		System.out.println("value before decreement of a= "+a);//10
		int b=a--;
		System.out.println("value of b= "+b ); //10
		System.out.println("after decrement value of a = " +a); //9
		
		int c=a--;
		System.out.println("vlue of c=" +c);//9
		
		System.out.println("value after again decrement of a =" +a);
		
	}

}
