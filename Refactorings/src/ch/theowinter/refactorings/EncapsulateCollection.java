package ch.theowinter.refactorings;

import java.util.ArrayList;
import java.util.Collection;

/* 
 * Name: Encapsulate Collection
 * Inverse Refactoring: none
 * Description: Instead of getting & setting the entire collection, we now only return
 * 				a read-only collection and provide add/remove methods for individual elements in
 * 				the collection (here users).
 * 
 * Eclipse Refactoring Option: No
 */

public class EncapsulateCollection {
	Collection<String> users = new ArrayList<String>();

	//ORIGINAL:
	public Collection<String> getUsers(){
		return users;
	}
	
	public void setUsers(Collection<String> users){
		this.users = users;
	}
	
	//REFACTORED:
	public Collection<String> getUsersRefactored(){
		return users;
	}
	
	public void addUser(String newUser){
		users.add(newUser);
	}
	
	public void removeUser(String user){
		users.remove(user);
	}
}
