package com.bridgelabz.utility;

//Stack operation class in a utility package.
public class StackOperations<T> {
	int capacity = 10;
	private int top = 0;
	//Array for storing values in a stack with size same as capacity.
	private Object[] stack = new Object[capacity];
	
	//Function to push the values in stack.
	public void push(T data) {
		// checks for capacity of array
		if (top == capacity){
			increaseLimit();
		}
		//Puts the data into the stack
		stack[top] = data;
		top++;
	}
	
	//Function to increase the limit of the stack if the capacity has reached.
	private void increaseLimit() {
		Object[] newStack = new Object[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, top);
		capacity *= 2;
		stack = newStack;
	}
}