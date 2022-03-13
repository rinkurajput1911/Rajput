package Return_type;

public class Calci

{
	public static int add(int a, int b) {
		int result = a + b;
		//System.out.println();
		return result;
	
	}

	public static int sub(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int multi(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int divi(int a, int b) {
		int result = a / b;
		return result;
	}

	public static void main(String[] args) {
     // add(10,50);
	
	System.out.println("Addition: " +add(50, 10));
	System.out.println("Substraction: " +sub(50, 10));
     System.out.println("Multiplication: "+multi(50, 10));
	System.out.println("Devison: "+ divi(50, 10));

	}
}
