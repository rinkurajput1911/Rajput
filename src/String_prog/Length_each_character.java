package String_prog;


// Length of each charcter
public class Length_each_character {
	
	public static void main(String[] args) {
		
		String str3= "i lived in nagpur";
		int count =0;
		
		for (int i=0; i<str3.length(); i++)//6
		{
			if (str3.charAt(i)== ' ')
			{  System.out.println("character String: "+ count);
				count=0;
			}
			else {
			count++;//4
			}
		} System.out.println("character of string :" +count);
		
		
	}

}
