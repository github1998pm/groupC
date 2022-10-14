package pkg1;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
	
		// check two string are anagram or not.
		
		String a = "Below arc";
		String b = "elbow cae";
		
		if(a.length() == b.length())
		{
			char[] x = a.toLowerCase().toCharArray(); //[a,r,c]
			char[] y = b.toLowerCase().toCharArray(); //[c,a,r]
		
			Arrays.sort(x);  // [a,c,r]
			Arrays.sort(y);  // [a,c,r]
			
			if( Arrays.equals(x, y))
			{
				System.out.println("Strings are anagram");
			}
			else
			{
				System.out.println("It is not an anagram but length is same");
			}
		}
		else
		{
			System.out.println("Not an anagram");
		}

	}

}
