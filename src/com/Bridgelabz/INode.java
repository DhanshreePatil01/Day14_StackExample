package com.Bridgelabz;

public interface INode<K>{
	
	public K getKey();
	public void setKey(K Key);
	
	INode getNext();
	public void setNext(INode next);
	
}


