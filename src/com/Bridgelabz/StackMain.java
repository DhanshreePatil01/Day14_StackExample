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
		
		
	}
}