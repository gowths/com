package com.toothless.linkedlist;

public class LinkedList {

	Node head, temp;
	int size;

	public LinkedList() {

		head = null;
		size = 0;
	}

	public void insertAtFirst(Object data) {

		Node newnode = new Node(data, null);

		if (checkForEmpty()) {
			head = newnode;
			size++;

		} else {

			temp = head;
			head = newnode;
			head.next = temp;
			size++;
		}

	}

	public void insertAtLast(Object data) {

		Node newnode = new Node(data, null);

		temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
		size++;

	}

	public boolean checkForEmpty() {

		if (head == null) {
			return true;
		} else {
			return false;
		}

	}

	public void printLinkedList() {

		temp = head;
		while (temp != null) {
			System.out.println("The Value is " + temp.value);
			temp = temp.next;
		}

	}

	public void reverse() {

		Node temp, head1;
		head1 = head;

		head = head.next;
		head1.next = null;

		while (head != null) {
			temp = head;
			// head1 = head;
			head = head.next;
			temp.next = head1;
			head1 = temp;
		}

		head = head1;
	}

	public Node reverseUpToK(Node head, int k) {

		Node current;
		Node prev = null;
		Node next = null;
		int count = 0;

		current = head;

		while ((current != null) && (count < k)) {

			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;

		}

		if (next != null) {

			head.next = reverseUpToK(next, k);
		}

		return prev;

	}

	public void reverseKNodes(int K) {

		System.out.println("the K value is" + K);
		
		head = reverseUpToK(head, K);

	}

}
