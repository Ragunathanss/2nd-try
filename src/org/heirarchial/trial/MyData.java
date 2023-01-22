package org.heirarchial.trial;

public class MyData extends ClientData{

	private void myprofile() {
	
System.out.println("my profile is selected");
	}
	private void myData() {
	System.out.println("my data is sorted");
	}
	public static void main(String[] args) {
		MyData r = new MyData();
		r.myData();
		r.myprofile();
		r.empId();
	}
}
