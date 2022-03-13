package Practice_logical_prog;

public class string_char {
	public static void main(String[] args) {
		
		
		String str= "My name is Rajput";
		int count=0;
		System.out.println("Lenght of string: "+str.length());
		//string  without space
		for (int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total length of string without space:  " +count);
	}

}
