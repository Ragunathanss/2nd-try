package org.inheritance.trial;
// child
public class Joining extends OfferLetter {
public void selection() {
	System.out.println("candidate have been selected");

}
public void joiningDate() {
System.out.println("he has to join on sep 30");	
}
public static void main(String[] args) {
	
Joining b = new Joining();
b.selection();
b.joiningDate();
b.resume();
b.selection();
b.walkin();
b.interviewPreparation();
b.attendingInterview();
b.costToComany();
b.insurance();
}

}