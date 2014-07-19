package ch.theowinter.refactorings;

public class Add_Parameter_Example {
	
	/* 
	 * Name: Add Parameter
	 * Inverse Refactoring: Remove Parameter
	 * Description: A method requires more information from its caller.
	 * 
	 * Eclipse Refactoring Option: YES
	 * Name: Change Method Signature
	 */
	
	//BEFORE REFACTORING:
	public void someMethod(){
		System.out.println("do something");
	}
	
	//AFTER REFACTORING:
	public void someMethodWithParameter(String parameter){
		System.out.println("do something with"+ parameter);
	}

}
