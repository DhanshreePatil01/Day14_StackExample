package com.Bridgelabz;

public class LinkedListMain {
public static void main(String[] args) {
		
		System.out.println("----------------------------------Linked List Operations---------------------------\n");
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		
		MyNode<Integer> fNode = new MyNode<Integer>(70);
		MyNode<Integer> sNode = new MyNode<Integer>(30);
		MyNode<Integer> tNode = new MyNode<Integer>(56);
		MyNode<Integer> fourthNode = new MyNode<Integer>(100);
		
		
		LinkedListCustom listnew1 = new LinkedListCustom();
		listnew1.add(firstNode);
		listnew1.add(secondNode);
		listnew1.add(thirdNode);
		
		System.out.println("Linked List Add Method: ");
		listnew1.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");
		
		LinkedListCustom listnew2 = new LinkedListCustom();
		listnew2.append(fNode);
		listnew2.append(sNode);
		listnew2.append(tNode);
		
		System.out.println("\nLinked List Append Method: ");
		listnew2.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");
		
		
		System.out.println("\nLinked List Insert Method: ");
		
		listnew1.insert(secondNode,fourthNode);
		listnew1.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");
		
		
	    System.out.println("\nLinked List before deletion:");
		listnew1.dispalyLinkedList();
		
		INode deletedNode=listnew1.pop();
		System.out.println("\nThe node is deleted: "+deletedNode);
		
		System.out.println("\nLinked List after deletion using pop method:");
		listnew1.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");
		
		
        System.out.println("\nLinked List before deletion");
		
		listnew2.dispalyLinkedList();
		
		INode deletedNode2 = listnew2.popLast();
		System.out.println("\nThe node that is deleted is:"+deletedNode2.getKey());
		System.out.println("\nLinked List after deleting last node using popLast method");
		listnew2.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");
}
}