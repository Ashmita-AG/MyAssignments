package week2.day2.classroom.arrays;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class MisssingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				Arrays.sort(arr);
				
				// loop through the array (start i from arr[0] till the length of the array)
				//int k= arr.length;
				
				for(int i= arr[0];i<=arr.length;i++)//arrayname.length
				{
					
				// check if the iterator variable is not equal to the array values respectively
				if (i!= arr[i-1])
				{
						// print the number
						System.out.println("Misssing Element in an Array : "  +i);
				
						// once printed break the iteration
						break;
				}
				
				}
						
				
	}
	}


