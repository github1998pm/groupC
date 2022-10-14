package pkg1;

public class CountNumber {

	public static void main(String[] args) {

		// count the given character within string
		
		String a = " Logical programs are very easy";
		
		char k = 'e';
		int count = 0;
		for( int i=0; i<a.length(); i++)
		{
			if(a.charAt(i) == k)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
