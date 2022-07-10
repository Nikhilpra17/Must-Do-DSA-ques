package com.company;

public class QueueArray {
	int[] array;
	int topofQueue;
	int beginningofQueue;	
	
	public QueueArray(int size) {
		this.array = new int[size];
		this.topofQueue = -1;
		this.beginningofQueue = -1;
		System.out.println("Queue is successfully created of size " + size);
		
	}
	
	//isFull Method
	
	public boolean isFull() {
		if (topofQueue == array.length -1) {
			return true;
		}else {
			return false;
		}
	}
	
	// isEmpty Method
	
	public boolean isEmpty() {
		if (beginningofQueue == -1 || beginningofQueue == array.length) {
			return true;
		}else {
			return false; 
		}
	}
	
	
	// enQueue Method 
	
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println(" Queue is Already Full");
		} else if (isEmpty()) {
			beginningofQueue = 0;
			topofQueue ++;
			array[topofQueue] = value;
			System.out.println(" Successfully inserted " + value + " in the Queue");
		} else {
			topofQueue ++;
			array[topofQueue] = value;
			System.out.println(" Successfully inserted " + value + "in the Queue");
		}
	}
	
	// deQueue Method 
	
	public int deQueue() {
		if (isEmpty()) {
			System.out.println(" Queue is already empty");
			return -1;
		} else {
			int temp = array[beginningofQueue];
			beginningofQueue ++;
			
			if (beginningofQueue > topofQueue) {
				beginningofQueue = topofQueue = -1;
			}
			return temp;
		}
	}
	
	// peek method
	
	public int peek() {
		if (isEmpty()) {
			System.out.println(" Queue is already empty");
			return -1;
		} else {
			int temp = array[beginningofQueue];
			return temp;
		}
	}
	
	// Delete Method
	
	public void delete() {
		array = null;
		System.out.println(" The Queue is successfully deleted");
	}
	
}
