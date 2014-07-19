package ch.theowinter.refactorings.ExtractClass.REFACTORED;

/* 
 * Name: Extract Class
 * Inverse Refactoring: none
 * Description: We have a class that does too much work. Some of the work should better be done
 * 				in its own class. We create a new class and move the necessary fields and
 * 				methods there.
 * 
 * Eclipse Refactoring Option: YES
 * Name: Extract Class
 */

public class Person {
	String name;
	String age;
	boolean isGirl;
	boolean isBoy;
	String location;
	
	TelephoneNumber telephoneNumber = new TelephoneNumber("078","9922260");

	public String getTelephoneNumber(){
		return telephoneNumber.getTelephoneNR();
	}
}
