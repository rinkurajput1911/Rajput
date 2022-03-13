package Methods;

public class Demo2A {
int a;			//declaration of global varible
int b;
//  parameterrized constructor 
Demo2A(int x,int y)
{
a=x;
b=y;
}	
public void add() //non static method 
{
System.out.println(a+b);	 
}
public void multi()    //non static method 
{
System.out.println(a*b);	
}

}
