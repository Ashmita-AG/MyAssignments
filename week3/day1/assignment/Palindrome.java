package week3.day1.assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="welcome";
String rstr="";
int length = str.length();
for (int i = length -1; i >=0; i--) {
	rstr=rstr+str.charAt(i);
	
}
if(str.toLowerCase().equals(rstr))
System.out.println("welcome is a paindrome");
else
	System.out.println("welcome is not a palindrome");
	} 

}
