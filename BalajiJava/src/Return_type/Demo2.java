package Return_type;

public class Demo2 {	
public void Shirt()
{ 	int qty=2;
	int Shirt=1250;
System.out.println("Shirt total price :"+(Shirt*qty));	
}

public void pant()
{	int qty=1; 
	int pant=1500;
System.out.println("Pant total price"+(pant*qty));	
}



public static void main(String[] args) {
	Demo2 d2=new Demo2();
	d2.pant();
	d2.Shirt();
	int total=d2.Shirt+d2.pant; 
	System.out.println(total);
}
}
