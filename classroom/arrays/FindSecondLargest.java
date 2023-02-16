package week2.day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7};

				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
			Arrays.sort(data);	// to sort the array
			System.out.println("Array in Ascending order");
			/*for (int j=0;j<6;j++)
				System.out.println(data[j]);*/	
			System.out.println("**********");
			for(int i=0;i<=data.length-1;i++)
			{
			System.out.println(data[i]);
			}
			System.out.println();
			int len=data.length;
			System.out.println("Lenght of the array is " +  len);
			System.out.println();
			int j=len-2;
			System.out.println("Second element from the last is " +  data[j]);
			
		
	}
}
