package com.Bridgelabz;

public class LinkedListCustom {
	
	INode head ;
	INode tail;
	
	public LinkedListCustom() {
		
		this.head = null;
		this.tail = null;
	}

   public void add(INode newNode) {   // newNode is variable
		
		// 56-30-70
		
		// node 70 create karo
		// add 30 and then 56
		
		/*
		 *   head --->70
		 *   
		 *   head -- xxx--->70
		 *   
		 *   head--> [30] ---> 70
		 *   
		 *   head--xxx---> 30 ---> 70
		 *   
		 *   head --> [56] ---> 30 ---->70
		 *   
		 *   
		 */
		
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		
			
		}
		
		
}

  public void append(INode newNode) {   
		
	  /*
		 * head --> 56
		 * 
		 * head --> 56 --   --> null
		 * 
		 * head --> 56 --->30 --->null
		 * 
		 * head --> 56 ---> 30 ---  ---> null
		 * 
		 * head --> 56 ---> 30 ----> 70 ---> null
		 * 
		 */
	  
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode tempNode = this.tail;
			this.tail.setNext(newNode); 
			this.tail=newNode;
		
			
		}
  }
  
  public void insert(INode previousNode, INode newNode) {
	     
	     INode tempNode = previousNode.getNext();
	   	 previousNode.setNext(newNode);
		 newNode.setNext(tempNode);
		 
		// 56 --> 70
			// 56 ---> 30      tempNode =70
			// Insert(firstNode, newNode);
			/* insert(56,30){
					tempNode = 56.getNext();
					tempNode = 70;
					
					56.setNext(30)
					30.setNext(70)
				
					56---> 30 ---> 70
				}
				
				
				
				Head-56-->54-->76--->74 ---->90--->45--->55-->65-->Tail
				
				
			*/
  }
	
	
	
   public INode pop() {
	  INode tempNode=this.head;
	  this.head=this.head.getNext();
	  return tempNode;
   }
	
   public INode popLast() {
		INode tempNode = this.head;
		
		// Looping till we reach last node
		while(!tempNode.getNext().equals(this.tail)) {
			tempNode = tempNode.getNext();
			
		}
		
		
		this.tail = tempNode;
		
		tempNode = tempNode.getNext();
		this.tail.setNext(null);
		
		return tempNode;
		
	}
 
	public void dispalyLinkedList(){
		System.out.println("My Stack is: "+head);
	}


	
}
