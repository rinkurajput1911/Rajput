package Return_type;

public class Demo3 {
	
public int Shirt()
{ 	int qty=2;
	int Shirt=1250;
	System.out.println("Shirt total price :"+(Shirt*qty));
	return (Shirt*qty);
}

public int pant()
{	int qty=1; 
	int pant=1500;
System.out.println("Pant total price"+(pant*qty));
return (pant*qty);
}




public static void main(String[] args) {
	Demo3 d3=new Demo3();
	int s=d3.pant();
	int p=d3.Shirt();
//	int total=d3.Shirt+d3.pant; 
//	System.out.println(total);

	
	int t=s+p;
	System.out.println("total : "+t);
	float Disc=t*.1f;
	float AAD=t-Disc;
	float GST=t*0.18f;
	System.out.printf("Your total Disc is RS: "+Disc);
	System.out.println("\nAmount after discount RS: "+AAD);
	System.out.println("\nNet bill Amount to pay incluse of all tax Rs :"+AAD*1.18f);
	System.out.println("THANK YOU VISIT AGAIN !!!");
}

}
