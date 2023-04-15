package week3.day1.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			/*
			 * Pseudo code 
			 
			 * a) Use the declared String text as input
				String text = "We learn java basics as part of java sessions in java week1";		
			 * b) Initialize an integer variable as count	  
			 * c) Split the String into array and iterate over it 
			 * d) Initialize another loop to check whether the word is there in the array
			 * e) if it is available then increase and count by 1. 
			 * f) if the count > 1 then replace the word as "" 
			 
			 * g) Displaying the String without duplicate words	
			 */
String text = "We learn java basics as part of java sessions in java week1";
int count =1;
char[] cha= text.toCharArray();
int length = text.length();
int count=0;
for(int i=0;i<length;i++)
{
	for(int j=0;j<i;j++)
		if(text[i]==text[j])
		{
			break;
		}
}
//if character is not present,add it to the result string
if(j==i)
	text[count++]= text[i];
	}
System.out.println(String.valueOf(Arrays.copyOf(text,count)));
	
	
	}

}
