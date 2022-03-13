package ControlStatement;

public class Switch1 {
   public static void main(String[] args) {
	     int num1=12;
	     int num2=-100;
	     int result=1;
	   switch (result) {
	case 1: System.out.println("Addition of num1 & num2= " +(num1+num2));
	             if((num1+num2)>0)
	             {
	            	 System.out.println("Result is positive");
	             }
	             else {System.out.println("plz enter postive value");}
		break;
	case 2: System.out.println("Multiplication of num1 & num2= " +(num1*num2));
	    break;
	case 3: System.out.println("Substraction of num1 & num2= " +(num1-num2));
	    break;
	case 4: System.out.println("Devision of num1 & num2= " +(num1/num2));
	    break;
	case 5: System.out.println("Modulas of num1 & num2= " +(num1%num2));
	    break;

	default: System.out.println("Please enter the rite  number");
		break;
	}
	   
}
}
