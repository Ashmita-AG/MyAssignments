package Week1.day2;

public class Fibbinocci 
{
public static void main(String[] args) {
	int firstNum=0;
	int secondNum=1;
	int sum=0;
	System.out.println(firstNum);
	for (int i=1;i<11;i++)
	{
		sum=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=sum;
		sum=firstNum;// withot assign this st output will be 0 1 2 3 based on the ques 0 1 1 2 3 "i tried it"
		System.out.println(sum);
	}
} 

}
