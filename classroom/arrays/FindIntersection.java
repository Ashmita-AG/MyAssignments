package week2.day2.classroom.arrays;

public class FindIntersection {

	public static void main(String[] args) {
			System.out.println("Intersection values in both arrays :");
		 // a) Declare An array for {3,2,11,4,6,7};	
			int a[]= {3,2,11,4,6,7};
		 // b) Declare another array for {1,2,8,4,9,7};
			int b[]= {1,2,8,4,9,7};
		 // c) Declare for loop iterator from 0 to array length
			for(int i=0;i<a.length;i++)
		 // d) Declare a nested for another array from 0 to array length
			for(int j=0;j<b.length;j++)
		 // e) Compare Both the arrays using a condition statement
			if(a[i]==b[j])
		 //  f) Print the first array (should match item in both arrays)
			System.out.print(a[i]+"  ");
					}
	}
