package com.company;

public class QueueCircularArray {
	int [] array;
	int topofQueue;
	int beginningofQueue;
	int size;
	
	public QueueCircularArray(int size) {
		this.array = new int[size];
		this.topofQueue = -1;
		this.beginningofQueue = -1;
		this.size = size;
		System.out.println(" The Circular Queue is successfully created of size " + size);
	}
	
	
	// Empty Method
	
	public boolean isEmpty() {

		if (topofQueue == -1) {	
		return true;
		} else {
			return false;
		}
	}
	
	// isFull
	
	public boolean isFull() {
		if (topofQueue == beginningofQueue -1) {
			return true;
		} else if (beginningofQueue == 0 && topofQueue +1 == size) {
			return true;
		} else {
			return false;
		}
	}
	
	// enQueue Method
	
	
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println(" The Stack is already full");
		} else if (isEmpty() == true) {
			beginningofQueue =0;
			topofQueue ++;
			array[topofQueue] = value;
			System.out.println("Successfully inserted " + value + " in the Queue");
		} else {
			if (topofQueue +1 == size) {
				topofQueue = 0;
			} else {
				topofQueue ++;
			}
			array[topofQueue] = value;
			System.out.println("Successfully inserted " + value + " in the Queue");
			
		}
	}
	
	// deQueue Method
	
	public int deQueue() {
		if (isEmpty()) {
			System.out.println(" The Queue is Empty");
			return -1;
		} else {
			int temp = array[beginningofQueue];
			array[beginningofQueue] = 0;
			
			if (beginningofQueue == topofQueue) {
				beginningofQueue =topofQueue = -1;
			} else if (beginningofQueue == size -1) {
				beginningofQueue = 0;
			} else {
				beginningofQueue ++;
			} 
			return temp;
		}
	}
	
	// peek Method
	
	public int peek() {
		if (isEmpty()) {
			System.out.println(" The Queue is Empty");
			return -1;
		} else {
			int temp = array[beginningofQueue];
			return temp;
	}

}
	
	
}
