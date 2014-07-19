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

public class TelephoneNumber {
	private String telephoneNR;
	String areaCode;

	public TelephoneNumber(String areaCode, String telephoneNR) {
		this.telephoneNR = telephoneNR;
		this.areaCode = areaCode;
	}

	public String getTelephoneNR() {
		return areaCode+telephoneNR;
	}

	public void setTelephoneNR(String areaCode, String telephoneNR) {
		this.telephoneNR = telephoneNR;
		this.areaCode = areaCode;
	}
}