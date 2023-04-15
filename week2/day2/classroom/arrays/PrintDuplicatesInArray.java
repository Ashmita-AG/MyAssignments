package week2.day2.classroom.arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		int len=arr.length;
		// declare an int variable named count
		int count=0;
		// iterate from 0 to the array length-1 (outer loop starts here)
		for(int i=0;i<=len-1;i++)
		{
			// assign 0 to count 
			//count=0;
						
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for(int j=i+1;j<=len-1;j++)
				// compare both the loop variables & check they're equal
				
			{
				if(arr[j]==arr[i])
					count++;
							// print the matching value
							}
			
	}
		System.out.println("Number of Duplicates in an array : "  +count);
	}
}
