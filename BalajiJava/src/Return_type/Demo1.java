package Return_type;

public class Demo1 {
	int a = 5;
	int b = 10;

	public int add() {
		System.out.println(a + b);
		return (a + b);
	}

	public int multi() {

		System.out.println(a * b);
		return (a * b);

	}

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		int i = d1.add();
//
		int i2 = d1.multi();

	int total=i+i2;
	float finalA=total*.9f;
	float TaxAmt=total*1.18f;
	System.out.println("Net paybale Amt :"+TaxAmt);
	

//	 Demo2 d2=new Demo2();
//		d2.divi(10, 2);

	}
}
