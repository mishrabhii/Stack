package uc2;

public class LinkedLists<T extends Comparable<T>> {

	Node<T> head;
	Node<T> tail;
	
	
	public LinkedLists() {
		this.head = null;
		this.tail = null;
	}
	
	public void append(T element) {
		Node<T> newNode = new Node<T>(element);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else
			tail.next = newNode;
			tail = newNode;
	}
	
	public void add(T element) {
		Node<T> newNode = new Node<T>(element);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else
			newNode.next = head;
			head = newNode;
	}
	public void sortAdd(T element) {
		Node<T> newNode = new Node<T>(element);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else
			if(head.data.compareTo(newNode.data) > 0) {
				newNode.next = head;
				head = newNode;
			}
			else
				if (tail.data.compareTo(newNode.data) < 0) {
					tail.next = newNode;
					tail = newNode;
				}
				else {
					Node<T> thisNode = head.next;
					Node<T> previous = head;
					while(thisNode.data.compareTo(newNode.data) < 0 && thisNode != tail) {
						previous = thisNode;
						thisNode = thisNode.next;
					}
					previous.next = newNode;
					newNode.next = thisNode;
				}
	}

	public void printSize() {
		// TODO Auto-generated method stub
		
	}

	public void printLinkedList() {
		// TODO Auto-generated method stub
		
	}

	public void pop(T data) {
		// TODO Auto-generated method stub
		
	}
}
