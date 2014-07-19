package ch.theowinter.refactorings;

/* 
 * Name: Decompose Conditional
 * Inverse Refactoring: none
 * Description: We have a complicated conditional statement (if-then-else), that's hard to read.
 * 				First we extract the condition, then the "then"-part and finally the "else"-part.
 * 				--> better readability, cleaner code.
 * 
 * Eclipse Refactoring Option: YES
 * Name: Extract Method
 */

public class Decompose_Conditional {
	final int MORNING_START = 800;
	final int MIDDAY_START = 1200;
	final int EVENING_START = 1900;
	final int NIGHT_START = 2200;
	
	double charge;
	
	//ORIGINAL:
	public void calculateSupportCost(int input, int quantitiy){
		if(input > MORNING_START || (input < EVENING_START && input > (MIDDAY_START+1))){
			charge = quantitiy * 7.55 * 5;
		} else {
			charge  = quantitiy * 4.55 / 2;
		}
	}
	
	//REFACTORED:
	public void calculateSupportCostRefactored(int input, int quantitiy){
		if(duringWorkHours(input)){
			workHourFee(quantitiy);
		} else {
			outsideWorkHourFee(quantitiy);
		}
	}

	private void outsideWorkHourFee(int quantitiy) {
		charge = quantitiy * 7.55 * 5;
	}

	private void workHourFee(int quantitiy) {
		charge  = quantitiy * 4.55 / 2;
	}

	private boolean duringWorkHours(int input) {
		return input > MORNING_START || (input < EVENING_START && input > (MIDDAY_START+1));
	}

}
