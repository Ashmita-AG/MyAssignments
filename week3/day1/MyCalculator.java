package week3.day1;

public class MyCalculator extends Calculator{

	public void sub() {
		System.out.println("subtract the values");

	}
public void mul(int a, int b) {
	
System.out.println("multiply 2 num " + a*b);
}
public void mul(int a,int b, int c) {
	// TODO Auto-generated method stub
System.out.println("product of three number " + a*b*c);
}
	public static void main(String[] args) {
		MyCalculator cal=new MyCalculator();
		cal.sub();
		cal.mul(30, 10);
		cal.mul(2, 3, 5);

	}

}
 