package ch.theowinter.refactorings.ChangeBidirectionalToUnidirectional.AFTER;

/* 
 * Name: Change Bidirectional Association to Unidirectional
 * Inverse Refactoring: Change Unidirectional Association to Bidirectional
 * Description: We have a bidirectional association between two classes
 *              but one class stops using functions from the second class
 *              we change the association to be unidirectional.
 * 
 * Eclipse Refactoring Option: NO
 */

public class Dog {
	private String name;
	private String favouriteToy;
	
	//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavouriteToy() {
		return favouriteToy;
	}

	public void setFavouriteToy(String favouriteToy) {
		this.favouriteToy = favouriteToy;
	}
}
