package Return_type;

public class Walter {
	
	
	public void parameter(int a, float b, String n, char d, boolean f )

	{
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		System.out.println(d);
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
	 Walter se=new Walter();
	
	//se.parameter(1 ,58.5f, "Rajput", 'A', true);
   se.parameter("interger value= " +58+ "\n float value= " +25.26f+
	  "\n String value" +"Rajput"+ "\n Character value" +'D'+ "\n Boolean value= "+true);
			 
		
		
		
	}
}
