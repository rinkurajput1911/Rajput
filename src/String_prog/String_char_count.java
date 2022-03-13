package String_prog;

public class String_char_count {
	
	//total number  number of character in string
	public static void main(String[] args) {
		String str="Hello World";
		int count =0;
		System.out.println("Enter string is : " + str);
		System.out.println(" lenght: " +str.length());
		// count the character without space
		//System.out.println(str.charAt());
		for (int i=0; i<str.length(); i++)
		{
		   if (str.charAt(i)!=' ')	
		   {
			   count++;
		   }
		   //dispalays the total count of string
		   	}
		System.out.println("Total number of character in the string: " + count);
	}

}
