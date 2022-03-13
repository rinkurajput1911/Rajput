package Interface;

public class Result implements B {

	public void h1() {
		System.out.println("A1 property");
	}

	public void h2() {
		System.out.println("A2 peroperty");
	}

	public static void main(String[] args) {
		Result r = new Result();
		r.h1();
		r.h2();
	}

}
