package Return_type;

public class Calci2

{
public  int add(int a, int b) {
	int result = a + b;
    return result;

}

public  int sub(int a, int b) {
	int result = a - b;
	return result;
}

public  int multi(int a, int b) {
	int result = a + b;
	return result;
}

public  int divi(int a, int b) {
	int result = a / b;
	return result;
}

public static void main(String[] args) {
   Calci2 cr=new Calci2();
   int u = cr.add(5,20);
   int r=cr.sub(50,20);
   int y=cr.multi(10,100);
   //cr.divi(25, 5);
   
   System.out.println("Addition="+u);
   System.out.println("Sub="+r);
   System.out.println("multi="+y);
   System.out.println("divi="+cr.divi(25, 5));
}
}