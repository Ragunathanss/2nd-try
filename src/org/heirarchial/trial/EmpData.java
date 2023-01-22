package org.heirarchial.trial;
// child1
public class EmpData extends ClientData{
	
	public void emNumber() {
		System.out.println("emp number is 1234");

	}
	private void empName() {
		// TODO Auto-generated method stub
System.out.println("emp name is Ragu");
	}

	public static void main(String[] args) {
		EmpData s = new EmpData();
		s.emNumber();
		s.empName();
		s.empId();
	}
}
