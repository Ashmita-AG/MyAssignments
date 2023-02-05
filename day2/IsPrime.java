package Week1.day2;

public class IsPrime {
public static void main(String[] args) 
{	
	int num=9 ;
	boolean res= false;
	for(int i=2;i<num-1;i++)
		{
		if(num%i==0)   //returns true   
		{
			res = true;
			
			break;
		}
		}  // for loop end
		if (res == false)
			System.out.println(num + " is  a prime number");
		
		else
		
			System.out.println( num + "   is  not a prime number");  
		
	
	

		
}
}

	