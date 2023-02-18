package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department
{
	public void StudentName() {
		System.out.println("varshini");
	}
	
public void StudentDept() {
	System.out.println("EEE Department");

}
public void StudentId() {
	System.out.println("Id " + 100);

}
	public static void main(String[] args) 
	{
	System.out.println("Multi level inheritance");	
Student s= new Student();
s.collegeName();
s.collegeCode();
s.collegeBank();
s.depName();
s.StudentName();
s.StudentId();
s.StudentDept();

	}

}
