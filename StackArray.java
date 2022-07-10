package com.company;

public class StackArray {
	int [] array;
	int topofStack;
	
	public StackArray(int size) {
		this.array = new int[size];
		this.topofStack = -1;
		System.out.println("New Stack has been created of size " + size);
	}
	
	
	// isEmpty
	public boolean isEmpty() {
		if(topofStack == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	//isFull
	public boolean isfull() {
		if (topofStack == array.length-1) {
			System.out.println("the Stack is Full");
			return true;
		} else {
			return false;
		}
	}
	
	// Push method 
	public void push(int value) {
		if (isfull() == true) {
			System.out.println("The Stack is Full");
		} else {
			array[topofStack +1] = value;
			topofStack ++;
			System.out.println("The Value is sucessfully added");
		}
	}
	
	// Pop Method 
	
	public int pop() {
		if (isEmpty() == true) {
			System.out.println(" The Stack is empty");
			return -1;
		} else {
			int temp = array[topofStack];
			topofStack -- ;
			return temp;
		}
	}
	
	// Peek Method
	
	public int peek() {
		if (isEmpty() == true) {
			System.out.println(" Stack is empty");
			return -1;
		} else {
			int temp = array[topofStack];
			return temp;
		}
	}
	
	// Delete Method
	
	public void deletestack() {
		array = null;
		System.out.println("The Stack is successfully deleted");
	}

}
