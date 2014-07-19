package ch.theowinter.refactorings;

/* 
 * Name: Encapsulate Field
 * Inverse Refactoring: none
 * Description: We have a public field. We make it private and a generate getter/setter.
 * 
 * Eclipse Refactoring Option: YES
 * Name: Source --> Generate Getters & Setters
 */

public class Encapsulate_Field {
	//ORIGINAL:
	public String someValue;
	
	//REFATORED:
	private String someValueRefactored;

	public String getSomeValueRefactored() {
		return someValueRefactored;
	}
	public void setSomeValueRefactored(String someValueRefactored) {
		this.someValueRefactored = someValueRefactored;
	}
}
