package week3.day1.assignment;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test ="changename";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) 
		{
		if(i%2!=0)
			{
			//System.out.println(i);
			//System.out.println(test.toUpperCase());
			char upperCase = Character.toUpperCase(charArray[i]);
		System.out.print(upperCase);
			}
		else
			System.out.print(charArray[i]);
	 			
		}
	}
}
