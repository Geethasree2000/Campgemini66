package com.capday2;

class Parents{
	public void printParent(){
		System.out.println("hhe is the parent of the child");
	}
}
class Employee extends Parents{
	public void printEmployee(){
		System.out.println("this is the employee");
	}
}
public class SingleInheritExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp  = new Employee();
		emp.printEmployee();
		emp.printParent();
	}

}
