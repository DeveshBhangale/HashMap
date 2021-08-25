package com.bridgelabz.hashmap;

public class MyHashMap<K, V> {
	MyLinkedList<K> l1;
	
	public MyHashMap(){
		this.l1 = new MyLinkedList<>();
	}
	
	public V get(K key) {
		MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.l1.searchNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		
		
	}
}
