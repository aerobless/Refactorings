package ch.theowinter.refactorings;

public class Encapsulate_Downcast {
	
	/* 
	 * Name: Encapsulate Downcast
	 * Inverse Refactoring: none
	 * Description: A method returns an object that's downcast by its caller.
	 * 				We move the downcast into the method itself.
	 * 
	 * Eclipse Refactoring Option: No
	 */
	
	//ORIGINAL:
	public void someCaller(){
		System.out.println((String) someMethod());
	}
	
	public Object someMethod(){
		Object quote = "Death is lighter than a feather, duty heavier than a mountain.";
		return quote;
	}
	
	//REFACTORED:
	public void someCallerRefactored(){
		System.out.println(someMethodRefactored());
	}
	
	public String someMethodRefactored(){
		Object quote = "Death is lighter than a feather, duty heavier than a mountain.";
		return (String) quote;
	}
}
