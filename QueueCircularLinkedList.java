package com.company;

public class QueueCircularLinkedList {
	LinkedList list;
	
	public QueueCircularLinkedList(){
		list = new LinkedList();
		System.out.println("The Queue is successfully created");
		
	}
	
	// isEmpty Method
	
	public boolean isEmpty() {
		if (list.head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	// EnQueue Method
	
	public void enQueue(int value) {
		list.insertLinkedList(value, list.size);
		System.out.println("Successfully inserted " + value + " in the Queue");
	}
	
	
	// deQueue Method
	
	public int deQueue () {
		int value =-1;
		
		if (isEmpty()) {
			System.out.println("The Queue is Empty");
		} else {
			value = list.head.value;
		list.deleteLinkedList(0);
		
	}
		return value; 
	}
	

}
