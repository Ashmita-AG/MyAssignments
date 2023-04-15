package week3.day1.org.system;

public class Desktop extends Computer{
private void desktopSize() 
{
	System.out.println("Desktop Size");

}
	public static void main(String[] args) {
	System.out.println("Single Level Inheritance");
	Desktop dk = new Desktop();
	dk.desktopSize();
	dk.computeModel();

	}

}
