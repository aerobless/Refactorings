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
	public void doSomething(String input){
		if(input.equals("hello") && input.length()>3 && !input.isEmpty()){
			System.out.println("pointless tests, I know.");
		}
	}

	//REFACTORED:
	public void doSomethingRefactored(String input){
		if(isHello(input)){
			System.out.println("pointless tests, I know.");
		}
	}

	private boolean isHello(String input) {
		return input.equals("hello") && input.length()>3 && !input.isEmpty();
	}
}
