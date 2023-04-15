package week3.day1;

public class AshokLeyland extends Truck{
public void display() {
	
System.out.println("ashok leyland");
}
public static void main(String[] args) {
	AshokLeyland ak = new AshokLeyland();
	ak.display();
	ak.soundHorn();
	ak.applyBrake(); 
	ak.load();
}
}
