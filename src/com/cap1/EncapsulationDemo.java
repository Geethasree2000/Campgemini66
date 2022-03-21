package com.cap1;

class Employee {
	private int empId;
	private String empNama;
	private double salary;
	private int age;

	public Employee(int empId, String empNama, double salary, int age) {
		super();
		this.empId = empId;
		this.empNama = empNama;
		this.salary = salary;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpNama() {
		return empNama;
	}

	public void setEmpNama(String empNama) {
		this.empNama = empNama;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNama=" + empNama + ", salary=" + salary + ", age=" + age + "]";
	}

}

class Department {
	private int deptId;
	private String DeptName;

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		DeptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", DeptName=" + DeptName + "]";
	}
}

class Address {
	private int houseno;
	private String City;
	private String State;
	private String pinno;

	public Address(int houseno, String city, String state, String pinno) {
		super();
		this.houseno = houseno;
		City = city;
		State = state;
		this.pinno = pinno;
	}

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPinno() {
		return pinno;
	}

	public void setPinno(String pinno) {
		this.pinno = pinno;
	}

	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", City=" + City + ", State=" + State + ", pinno=" + pinno + "]";
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "raj", 32566.87, 43);
		System.out.println(emp.toString());
		Department dept = new Department(1, "Accounts");
		System.out.println(dept.toString());
		Address ad = new Address(12, "Hyderabad", "Telangana", "500032");
		System.out.println(ad.toString());
	}

}
