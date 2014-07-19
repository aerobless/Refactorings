package ch.theowinter.refactorings;

public class Consilidate_Duplicate_Conditional_Fragments {
	
	/* 
	 * Name: Consolidate Duplicate Conditional Fragments
	 * Inverse Refactoring: none
	 * Description: The same code fragment is used in all branches of a conditional
	 * 				expression. We move it out of the conditional so that it's only
	 * 				called once. --> Less code, better readability
	 * 
	 * Eclipse Refactoring Option: Maybe
	 * Name: Extract Method (if it's multiple lines)
	 */
	
	//ORIGINAL:
	public void doSomething(){
		double shittyDice = Math.random();
		double total;
		if(shittyDice > 0.5){
			total = 300 * shittyDice;
			send(total); //here
		} else {
			total = 150 * shittyDice;
			send(total); //and here
		}
	}
	
	//REFACTORED:
	public void doSomethingRefactored(){
		double shittyDice = Math.random();
		double total;
		if(shittyDice > 0.5){
			total = 300 * shittyDice;
		} else {
			total = 150 * shittyDice;
		}
		send(total); //now only here, at the end
	}
	
	public void send(double value){
		System.out.println("sending to server now..");
	}
}