package week3.day1.assignment;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.java();
		obj.phython();
		obj.ruby();
		obj.selenium();
		

	} 

	public void selenium() {
		
		System.out.println("Selenium is a WebDriver");
	}

	public void java() {
		
		System.out.println("JAVA is a Programming Language");
	}

	@Override
	public void ruby() {
		System.out.println("Welcome to Ruby");	
	}

}
