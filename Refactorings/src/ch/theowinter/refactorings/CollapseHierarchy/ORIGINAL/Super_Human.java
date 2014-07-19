package ch.theowinter.refactorings.CollapseHierarchy.ORIGINAL;

/* 
 * Name: Collapse Hierarchy
 * Inverse Refactoring: Extract Superclass, Extract Subclass
 * Description: A super- and subclass aren't very different from each other.
 *              We make one class out of the old sub- and superclass.
 * 
 * Eclipse Refactoring Option: YES
 * Name: Pull Up (in subclass), Push Down (in superclass)
 */

public class Super_Human {
	String name;
	int age;
	int intelligence;
	int strength;
}
