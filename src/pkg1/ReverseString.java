package pkg1;

public class ReverseString {
	
	public static void main(String[] args)
	{
		
		// Reverse the given string
		
		String a = "Logical";
		
		String reverseString = "";
		
		for(int i=(a.length()-1); i>=0; i--)
		{
			reverseString = reverseString + a.charAt(i);
		}
		
		
		System.out.println(a+ "=" + reverseString);
		demo();
		//demo2();
	}

	
	public static void demo()
	{
		String s= "velocity";
		String reverseString = "";
		for(int i=(s.length()-1);i>=0;i--)
				{
			reverseString =reverseString + s.charAt(i);
				}
		System.out.println(s+"="+reverseString);
		
	}
	
	public static void demo2()
	{
		for(;;)
		{
			System.out.println("hello");
		}
	}
}
