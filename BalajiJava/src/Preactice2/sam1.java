package Preactice2;

public class sam1 {

public int add()
{int a=20;
//System.out.println("add"+a);
return a;
}

public void equal()
{ sam1 s=new sam1();
System.out.println(s.add());	
}

public static void main(String[] args) {
	
	sam1 s=new sam1();
	int Ad=s.add();
	s.equal();
//	System.out.println(Ad);
}
	
}
