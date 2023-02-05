package Week1.day2;

public class Car 
{
	
public  int getRegistrationNumber()
{
int registrationNum=5678;
return registrationNum;
}
private String getOwnersName()
{
	String  ownername="parthy";
	return ownername;
	
}
void printTheCarModel()
{
 System.out.println("honda");
}

public boolean isPunctured()
{
	return false;
}
public int subtractTwoNumbers(int a,int b)
{ //a=10;b=5;
	return a-b;
}
public int multiplyOfTwoNum(int x, int y,int z)
{ 
	x=3;y=10;z=2;
return x*y*z;
}
public int divideTwoNumbers(int c, int d)
{
	c=12;d=3;
	return c/d;
}
public static void main(String[] args) {
	Car obj=new Car();
	
	System.out.println(obj.getOwnersName());
	
	//int divideTwoNumbers = obj.divideTwoNumbers(12, 4);
	System.out.println(obj.divideTwoNumbers(12, 0));
	System.out.println(obj.getRegistrationNumber());
	System.out.println(obj.isPunctured());
	  int multiplyOfTwoNum = obj.multiplyOfTwoNum(2, 3, 5);
	System.out.println(multiplyOfTwoNum );
	int subtractTwoNumbers = obj.subtractTwoNumbers(18, 10);
	System.out.println(subtractTwoNumbers);
	obj.printTheCarModel();
	System.out.println(obj.isPunctured());
	
	
}
}	 


