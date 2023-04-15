package week3.day2;

public class OnePlus extends AndroidTv{

	@Override
	public void MyOwn() {
		System.out.println("welcome to my own");
		
		
	}
 
	public static void main(String[] args) {
		OnePlus one= new OnePlus();
		one.MyOwn();
		one.OpenApp();
		one.PlayVideo();
	}
	
}
