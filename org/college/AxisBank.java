package week3.day1.org.college;

public class AxisBank extends BankInfo{
public void deposit() 
{
	int amount = 5000;
	System.out.println("Deposit Amount is " + amount);
}
	public static void main(String[] args) {
		System.out.println("Overriding Concept");
		AxisBank ab= new AxisBank();
		ab.deposit(); // overriding
		ab.saving();
		ab.fixed();
}

}
