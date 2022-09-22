package com.Stack;

public class Stacks<T extends Comparable<T>> {

	int top;
	int size;
	LinkedLists<T> list;
	LinkedLists<T> perform = new LinkedLists<T>();

	public boolean isEmpty() {
		return (top == -1);
	}

	boolean isFull() {
		return (top == (size-1));
	}

	public void size() {
		perform.printSize();
	}

	public void push(T newElement) {
		if(isFull()) {
			System.out.println("\nStack Overflow!\nCould not add data to stack.");
		}
		else {
			list.add(newElement);
			top++;
			System.out.println("\n\nSuccessfully added element " + newElement + " to the stack.");
		}
	}

	public void pop() {
		if(isEmpty()) {
			System.out.println("\nStack Underflow!\nNo more elements to pop.");
		}
		else {
			System.out.println("\nSuccessfully popped " + list.head.data + " from the stack.");
			list.pop(list.head.data);
			top--;
		}
	}

	public void peek() {
		if(isEmpty()) {
			System.out.println("\nStack Underflow!\nNo more elements left in the stack.");
		}
		else {
			T topElement = list.head.data;
			System.out.println("\nThe top element of the stack is " + topElement);
		}
	}

	public T getPeek() {
		T topElement;

		//System.out.println("Stack data structure program");
		if(isEmpty()) 
			topElement = null;
		else 
			topElement = list.head.data;

		return topElement;
	}

	public void printStack() {
		System.out.print("\nDisplaying the stack : ");
		list.printLinkedList();
	}

	public Stacks(int size) {
		super();
		this.top = -1;
		this.size = size;
		this.list = new LinkedLists<T>();
	}

	public Stacks() {
		top = -1;
	}
}

