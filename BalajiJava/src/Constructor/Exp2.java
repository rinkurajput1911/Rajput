package Constructor;

public class Exp2 {

	String name;
	float per;

	Exp2() {
		name = "Mishu";
		per = 65.2f;
	}

	public static void p1()

	{	
		Exp2 c=new Exp2 ();
		System.out.println(c.name +"  \n " + c.per);
	}

	public static void main(String[] args) {
		//Exp2 w=new Exp2 ();
		p1();
		
		
	}

}
