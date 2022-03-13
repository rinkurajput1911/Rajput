package Package2;

import acessSpecifiers.*;


public class B {
	public static void s1() {
		int A = 100;
		int B = 40;
		int result = A + B;

		System.out.println("Add=  " + result);
	}

	public static void s2() {
		float A = 100;
		float B = 40;
		float result = A / B;

		System.out.println("Devision=  " + result);
	}

	public static void main(String[] args) {
		s1();
		s2();
		Sample2 n = new Sample2();
		n.s1();

	}

}
