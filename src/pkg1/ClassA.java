package pkg1;

public class ClassA {

	public static void main(String[] args) {
		
		String a="Sneha";
		String reverseString = "";
		
		for(int i=(a.length()-1);i>=0;i--)
		{
			reverseString =reverseString+a.charAt(i);
			//System.out.print(a.charAt(i));
		
		}
System.out.println(reverseString);

	}

}
