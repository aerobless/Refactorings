package ch.theowinter.refactorings.ChangeBidirectionalToUnidirectional.REFACTORED;

/* 
 * Name: Change Bidirectional Association to Unidirectional
 * Inverse Refactoring: Change Unidirectional Association to Bidirectional
 * Description: We have a bidirectional association between two classes
 *              but one class stops using functions from the second class
 *              we change the association to be unidirectional.
 * 
 * Eclipse Refactoring Option: NO
 */

public class Human {
	private String name;
	private int age;
	private String address;
	
	private Dog myDog;

	
	//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Dog getMyDog() {
		return myDog;
	}

	public void setMyDog(Dog myDog) {
		this.myDog = myDog;
	}
}
