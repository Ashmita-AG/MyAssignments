 package week3.day1;

public class Truck extends Vehicle {
public void load() {
	System.out.println("load capacity");
}
public static void main(String[] args) {
	Truck tc=new Truck();
	tc.load();
	tc.soundHorn();
	tc.applyBrake();
	
}
}
