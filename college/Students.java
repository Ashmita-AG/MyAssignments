package week3.day1.org.college;

public class Students {
public void getStudentInfo()
{
System.out.println("arguments without parameters");
System.out.println("Degree " +   " BCA");
System.out.println("Batch  2020");
}
public void getStudentInfo(int id) 
{	int a= id;
	System.out.println("arguments with single parameters");
	System.out.println("Student Id "+ a);
}
public void getStudentInfo(int a, String name)
{//int id = a;
//String studName= name;
System.out.println("arguments with different datatypes");
System.out.println("Id no : "+ a);
System.out.println("Student Name  :" + name);	
}
public void getStudentInfo(String email,int phoneNumber)
{
	String mailId=email;
	int phNum=phoneNumber;
	System.out.println("different datatypes with different order");
	System.out.println("Email Id : "+ mailId);
	System.out.println("Phone number :"+ phNum);
}
	public static void main(String[] args)
	{
		System.out.println("Examples for overloading concept");
		Students stud = new Students();
		stud.getStudentInfo();
		stud.getStudentInfo(100);
		stud.getStudentInfo(101,"venba");
		stud.getStudentInfo("abc@gmail.com", 246798);
	}

}
