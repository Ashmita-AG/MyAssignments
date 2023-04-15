package week3.day1.collections;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		int len = data.length;
		Arrays.sort(data);
		
		for(int i=len-1;i>=0;)
		{
			System.out.println(data[i-1]);
		
		break;
		} 	 

	}

}
