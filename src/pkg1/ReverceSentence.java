package pkg1;

public class ReverceSentence {
	
	// Reverse each word in string on same position

	public static void main(String[] args) {
 
		 String a = "Logical programs are very easy";
		 System.out.println(a);
		 
		 String[] k = a.split(" ");
		 
		 String reverseWholeString = "";
		 
		 for(int i=0; i<k.length; i++)
		 {
			 String r = k[i];
			 
			 String reverseString = "";
			 
			 for(int j= (r.length()-1); j>=0; j--)
			 {
				 reverseString = reverseString + r.charAt(j);
			 }
			 
			 reverseWholeString = reverseWholeString + reverseString + " ";
		 }
		 
		 System.out.println(reverseWholeString);

	}

}
