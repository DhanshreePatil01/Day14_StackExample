package com.Bridgelabz;

public class StackCustom<K> {

	private final LinkedListCustom stackMadeWithLL;
	
	public StackCustom() {
		this.stackMadeWithLL = new LinkedListCustom();
	}
	
	
	public void push(INode element) {
		stackMadeWithLL.add(element);
	}
	
	
	
	public void printStack() {
		stackMadeWithLL.dispalyLinkedList();
	}
	
	
}
