package com.Bridgelabz;

public class StackMain {
	
	public static void main(String[] args) {
		StackCustom sampleStack = new StackCustom();
		
		MyNode<Integer> nodeFirstForStack = new MyNode<Integer>(70);
		MyNode<Integer> nodeSecondForStack = new MyNode<Integer>(30);
		MyNode<Integer> nodeThirdForStack = new MyNode<Integer>(56);
		
		sampleStack.push(nodeFirstForStack);
		sampleStack.push(nodeSecondForStack);
		sampleStack.push(nodeThirdForStack);
		
		sampleStack.printStack();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Top element is: "+sampleStack.peek().getKey());
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Stack after repeated poping");
		
		while(!sampleStack.isEmpty()) {
			sampleStack.pop();
		}
		sampleStack.printStack();
		System.out.println("---------------------------------------------------------------------");
		
	}
}