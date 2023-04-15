package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args)
	{

		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		// Pseudo Code:

		//* Declare the input as Follow
		String test = "I am a software tester"; 
		test = test.trim();
		//a) split the words and have it in an array
		//String[] str = test.split("");
		String reverse ="";
		for(int i=0;i<test.length();i++)
		{
			if(i%2==0) {
				char[] charArray = test.toCharArray();
			}

			for(int j=test.length()-1;j>=0;j--)
				reverse=reverse+ test.toCharArray();

		}
		System.out.println(reverse);	











		//b) Traverse through each word (using loop)
		/*	for (int i = 0; i < str.length; i++) 
				      		{
								if(i%2==0)
								{ char[] charArray = str[i].toCharArray();
									for (int j = charArray.length-1 ; j >=0; j--)
									{
										reverse=reverse+charArray[j];
									}
									reverse=reverse+"";	
									}

								else
									reverse=reverse+str[i];
				      		}
				      		System.out.println(reverse);*/
	}
}