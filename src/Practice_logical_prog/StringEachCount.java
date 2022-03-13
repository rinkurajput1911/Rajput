package Practice_logical_prog;

public class StringEachCount {
	public static void main(String[] args) {
		

	String pp="Welcome india";
			int count =0;
	for (int i=0; i<pp.length(); i++)//6
	{
		if(pp.charAt(i)==' ')
		{
			System.out.println("string count: "+count);
			count++;
		}
		else {
			count++;
		}
	} System.out.println("String count: "+count);

}
}