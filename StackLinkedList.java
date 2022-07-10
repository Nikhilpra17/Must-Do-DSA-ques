package com.company;

public class StackLinkedList {
	LinkedList ll;
	
	public StackLinkedList() {
		ll = new LinkedList();
	}
	
	// push Method 
	
	public void push(int value) {
	ll.insertLinkedList(value, 0);
	System.out.println("Value inserted in Stack Successfully");
	}
	
	
	// isEmpty Method
	
	public boolean isEmpty() {
		if (ll.head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// Pop Method
	
	public int pop() {
		int result = -1;
		if (isEmpty() ==true) {
			System.out.println("The Stack Is empty");
		} else {
			result = ll.head.value;
			ll.deleteLinkedList(0);
		}
		return result;
	}
	
	
	//peek Method
	
	public int peek() {
		int result;
		if (isEmpty() ==true) {
			System.out.println("The Stack Is empty");
			return -1;
		} else {
			result = ll.head.value;
		}
		return result;
	}
	
	// Delete Method
	
	public void delete() {
		ll.head = null;
		System.out.println(" The whole Stack is deleted");
	}
	
}
