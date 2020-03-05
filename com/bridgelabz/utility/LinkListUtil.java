package com.bridgelabz.utility;

//A generic link list utility class.
public class LinkListUtil<T> {
	
	//Head for the linked list been initialized.
	Node head;
	
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
	
}
