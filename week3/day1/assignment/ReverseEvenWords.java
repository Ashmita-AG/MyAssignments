package week3.day1.assignment;

import java.util.Iterator;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="i am a software tester";
		String[] test1 = test.split("");
		for(int i=0;i<test.length();i++)
		{
			if(i%2!=0)
				  char[] word = test1[i].toCharArray();
				String reverse = "";
				for(int k=test.length();k>=0;k--)
				{
					reverse=reverse+word[k-1];
				}
			
		}
		
		
		
				
	}

}
