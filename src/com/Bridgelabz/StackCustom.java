package com.Bridgelabz;

public class StackCustom<K> {

	private final LinkedListCustom stackMadeWithLL;
	
	public StackCustom() {
		this.stackMadeWithLL = new LinkedListCustom();
	}
	
	
	public void push(INode element) {
		stackMadeWithLL.add(element);
	}
	
	// peek and pop till empty
	
		// peek method
		public INode peek() {
			return stackMadeWithLL.head;
		}
		
		// Pop method
		
		public INode pop() {
			return stackMadeWithLL.pop();
		}
		
		// Is empty method
		
		public boolean isEmpty() {
			if(stackMadeWithLL.head!=null) {
				return false;
			}else {
				return true;
			}
		}
		
		//
//		public int size() {
//			return stackMadeWithLL.s
//		}
		
	
	public void printStack() {
		stackMadeWithLL.dispalyLinkedList();
	}
	
	
}
