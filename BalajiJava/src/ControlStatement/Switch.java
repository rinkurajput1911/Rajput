package ControlStatement;

public class Switch {
	public static void main(String[] args) {
		
		int Atm=8;
		
	switch (Atm) {
	case 2: 
		System.out.println("Balance check");
	     break;
	case 5:
		System.out.println("Cash withdrwan");
		break;
	case 6:
		System.out.println("Mini statement");
		break;
	case 8:
		System.out.println("Reset pin");
	default:
		System.out.println("Please choose valid option");
		break;
	}
		
		
	}

}
