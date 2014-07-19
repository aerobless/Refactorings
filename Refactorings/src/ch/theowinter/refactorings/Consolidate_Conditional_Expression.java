package ch.theowinter.refactorings;

public class Consolidate_Conditional_Expression {
	
	/* 
	 * Name: Consolidate Conditional Expression
	 * Inverse Refactoring: none
	 * Description: You have a sequence of conditional tests. Combine & extract
	 * 				them into their own method. --> Better readability.
	 * 
	 * Eclipse Refactoring Option: YES
	 * Name: Extract Method
	 */
	
	//ORIGINAL:
	public int doSomething(String input){
		if(input.equals("hello")) return 0;
		if(input.length()>3) return 0;
		if(!input.isEmpty()) return 0;
		
		//Compute something
		return 2*3;
	}

	//REFACTORED:
	public int doSomethingRefactored(String input){
		if(isHello(input)) return 0;
		
		//Compute something
		return 2*3;
	}
	
	private boolean isHello(String input) {
		if(input.equals("hello")) return true;
		if(input.length()>3) return true;
		if(!input.isEmpty()) return true;
		return false;
	}
}
