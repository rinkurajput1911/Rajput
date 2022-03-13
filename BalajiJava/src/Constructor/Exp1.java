package Constructor;

public class Exp1 {
	int Roll; // decalalring the variable
	String name; // decalalring the variable

	Exp1() // non parameterized constructor

	{
		Roll = 25;
		name = "Rajput";
	}

	Exp1(int c, String f)// parameterized constructor 
	{
		Roll = c;
		name = f;
	}

	public static void main(String[] args) {
		Exp1 e = new Exp1();
		System.out.println(e.Roll);
		System.out.println(e.name);

		Exp1 e1 = new Exp1(25, "Sam");
		System.out.println(e1.Roll);
		System.out.println(e1.name);

		Exp1 e2 = new Exp1(100, "Smit");
		System.out.println(e2.Roll);
		System.out.println(e2.name);

	}
}
