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
}
