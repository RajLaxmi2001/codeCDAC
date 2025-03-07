package ClassAndObject.employee;

import java.util.Scanner;

public class EmployeeData {
	
	int empid;
	String ename;
	String designation;
	String department;
	float salary;
	
	public void readData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Emp id : ");
		empid=sc.nextInt();
		
		System.out.println("Enter the emp name: ");
		ename=sc.next();
		
		System.out.println("Enter the emp designation: ");
		designation = sc.next();
		
		System.out.println("Enter the emp department: ");
		department = sc.next();
		
		System.out.println("Enter the emp salary: ");
		salary= sc.nextFloat();
		
	}
	public void display()
	{
		System.out.println("Emp name is : "+ename+"|| Emp id is : "+empid+" ||Emp designation"+designation+" || Emp department "+department+" ||  Emp salary is : "+salary);
	}

}
