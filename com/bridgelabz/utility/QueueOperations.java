package com.bridgelabz.utility;

//A generic queue operations.
public class QueueOperations<T> {
	int capacity = 5;
	private int front = -1;	int rear;	int size;
	private Object queue[] = new Object[capacity];

	//Method to add items in enqueue.
	void enqueue(T item) {
		if (size == capacity) {
			increaseLimit();
		}
		queue[rear++] = item;
		size++;
	}
	
	//Method to increase the limit of queue if it is full.
	void increaseLimit() {
		Object[] objQueue = new Object[capacity * 2];
		capacity *= 2;
		for (int index = front + 1; index < rear; index++) {
			objQueue[index] = queue[index];
		}
		queue = objQueue;
	}
}
