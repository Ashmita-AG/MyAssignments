package week3.day1;


public class Bike extends Vehicle{
public  void Engine()
{
	System.out.println("engine");
}
public void looks() {
	// TODO Auto-generated method stub
System.out.println("easy to drive");
}

public static void main(String[] args) {
	Bike b=new Bike();
	b.looks();
	b.Engine();
	b.applyBrake();
	b.soundHorn();
}
}
 