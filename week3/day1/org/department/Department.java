package week3.day1.org.department;

import week3.day1.org.college.College;

public class Department extends College 
{
public void depName() 
{
	System.out.println("EEE Department");

}
	public static void main(String[] args) {
		System.out.println("Multi Level Inheritance");
		Department dept = new Department();
		dept.depName();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeBank();
				
	}

}
