package com.bridgelabz.hashmap;


public class MyLinkedList<K> {
	
	private INode<K> head;
	private INode<K> tail;
	
	public void add(INode<K> newNode) {
		if(tail == null) {
			tail = newNode;
		}
		if(head == null) {
			head = newNode;
		}
		else {
			INode<K> tempNode = head;
			head = newNode;
			head.setNext(tempNode);
		}		
	}
	
	public void insertNode(int index, INode<K> newNode) {
		int cnt=0;
		INode<K> tempNode = head;
		while(cnt == index) {
			tempNode = tempNode.getNext();
			cnt++;
		}
		INode<K> next = tempNode.getNext();
		tempNode.setNext(newNode);
		newNode.setNext(next);
	}
	
	public void insertNodeAfterSpecificValue(int myNode,INode<K> newNode) {
		INode<K> tempNode = head;
		while(tempNode != null) {
			if((Integer)tempNode.getKey() == myNode) {
				INode<K> next = tempNode.getNext();
				tempNode.setNext(newNode);
				newNode.setNext(next);
				if(tempNode.equals(tail)) {
					tail = newNode;
				}
				break;
			}
			tempNode = tempNode.getNext();
		}
	}
	
	public int size() {
		int i = 0;
		INode<K> tempNode = this.head;
		while(tempNode != null) {
			tempNode = tempNode.getNext();
			i++;
		}
		return i;
	}
	
	public void delete(int myNode) {
		INode<K> tempNode = this.head;
		while(tempNode != null) {
			if((Integer)tempNode.getNext().getKey() == myNode) {
				INode<K> temp = tempNode.getNext().getNext();
				tempNode.setNext(temp);
				break;
			}
			tempNode = tempNode.getNext();
		}
	}
	
	public INode<K> search(K key){
		INode<K> tempNode = head;
		while(tempNode!=null) {
			if(tempNode.getKey().equals((K)key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	
	public void print() {
		INode<K> tempNode = head;
		StringBuffer str = new StringBuffer("My Nodes: ");
		while(tempNode != null) {
			str.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				 str.append("->");
			tempNode = tempNode.getNext();
		}
		System.out.println(str);
	}

	public void append(INode<K> myNode) {
		if(tail == null) {
			tail = myNode;
		}
		if(head == null) {
			head = myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	@Override
	public String toString() {
		return "MyLinkedListNodes{"+ head+"}";
		
	}
}
