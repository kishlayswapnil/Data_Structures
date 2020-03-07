package com.bridgelabz.utility;

//Stack operations has been created in utility package.
public class StackOperations<T> {
	//Variables.
	int capacity = 10;
	private int top = 0;
	//Array for storing values in a stack with size same as capacity.
	private Object[] stack = new Object[capacity];
	
	//function to push the values in stack.
	public void push(T item) {
		// checks for capacity of array
		if (top == capacity)
		{
			increaseLimit();
		}
		// puts data in stack
		stack[top] = item;
		top++;
	}
	
	//Function to increase the limit of the stack if limit of the stack has reached.
	private void increaseLimit() {
		Object[] newStack = new Object[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, top);
		capacity *= 2;
		stack = newStack;
	}
}