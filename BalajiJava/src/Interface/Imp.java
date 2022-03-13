package Interface;

public class Imp implements Demo1 {

	public void r1() {
		System.out.println("Method R1");
	}

	public void r2() {
		System.out.println("Method R2");
	}

	public void r3() {
		System.out.println("Method R3");
	}

	public static void main(String[] args) {
		Imp mp = new Imp();
		mp.r1();
		mp.r3();
		mp.r2();
	}

}
