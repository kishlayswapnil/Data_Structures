package com.bridgelabz.utility;

//A generic link list utility class.
public class LinkListUtil<T extends Comparable<T>> {
	
	//Head for the linked list been initialized.
	Node head;
	Node tail;
	int size=0;
	
	//List has been initialized.
	public String list() {
		String status;
		Node newNode = new Node();
		newNode.next = null;
		//If link list is empty or not.
		if (head == null) {
			status = "New Linked List Has Been Created And It Is Empty.";
		} else {
			status = null;
		}
		return status;
	}
	
	//Add method has been initialized to enter user data at the next value.
	public void add(T item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		if (list() != null) {
			head = newNode;
		} else {
			Node node1 = head;
			//Condition to traverse through the linked list and add the data at the end.
			while (node1.next != null) {
				node1 = node1.next;
			}
			node1.next = newNode;
		}
	}
	
	//Display the linked list by giving print line on the traversal.
	public void display() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	//Removes the item entered over here.
	public void remove(T item) {
		if(head == null) {
			System.out.print("no linked list found.");
		} else {
			Node node1 = head;
			Node previous = null;
			//Condition if their is data in head only.
			if (head.data.equals(item)) {
				head = head.next;
				size -= 1;
				return;
			}
			//Condition for rest of the item.
			while (!node1.data.equals(item)) {
				previous = node1;
				node1 = node1.next;
			}
			node1 = node1.next;
			previous.next = node1;
			node1 = null;
			size -= 1;
		}
	}
	
	// Search the value through the linked list and applying if statement on the traversal.
	public boolean search(T value) {
		Node node = head;
		while (node.next != null) {
			if (node.data.equals(value)) {
				return true;
			}
			node = node.next;
		}
		return false;
	}
	
	//Checks the linked list if it is empty or not.
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}
	
	//Returns the value of count.
	public int size() {
		Node node = head;
		int count = 1;
		while (node.next != null) {
			node = node.next;
			count++;
		}
		return count;
	}
	
	//This method will enter the item at the end of the linked list.
	public void append(T item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		Node node = head;
		for(int index = 0; index < size()-1; ++index) {
			node = node.next;
		}
		newNode.next = node.next;
		node.next = newNode;
	}
	
	//This method will throw a boolean value on checking the value through the linked list.
	public int index(T value) {
		Node node = head;
		int count = 0;
		while (node.next != null) {
			if(node.data.equals(value))
				count++;
			node = node.next;
		}
		return count;
	}
	
	//Item being entered on a specific position.
	public void insert(int position, T item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;
		Node node = head;
		for(int index = 0; index < position - 1; ++index) {
			node = node.next;
		}
		newNode.next = node.next;
		node.next = newNode;
	}
	
	//Removes the last element of the linked list.
	public void pop() {
		Node node1 = head;
		Node previous = null;
		while (node1.next != null) {
			previous = node1;
			node1 = node1.next;
		}
		// removes the last element.
		previous.next = null;
		size--;
	}
	
	//Removes the element based on its position.
	public void pop(int position) {
		if (head == null) {
			System.out.print("no linked list found.");
		} else {
			Node node1 = head;
			Node previous = null;
			//Loop traversing upto the position value given by user.
			for(int index = 1; index < position - 1; ++index) {
				node1 = node1.next;
			}
			previous = node1.next;
			node1.next = previous.next;
		}
	}
	
	//Method to add elements in ordered linked list.
	public void addOrder(T item)
	{
		Node newNode= new Node();
		newNode.data=item;
		if (head == null) {
			head = newNode;
			head.next = tail;
			tail = head;
		} else if (item.compareTo((T) head.data) < 0) {
			newNode.next = head;
			head = newNode;
		} else {
			if (item.compareTo((T) tail.data) > 0) {
				tail.next = newNode;
				tail = newNode;
				return;
			}
			Node node1 = head;
			Node previous = null;
			while (item.compareTo((T) node1.data) > 0 && node1.next != null) {
				previous = node1;
				node1 = node1.next;
			}
			previous.next = newNode;
			newNode.next = node1;
		}
	}
}
