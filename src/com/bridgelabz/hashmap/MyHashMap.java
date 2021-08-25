package com.bridgelabz.hashmap;

public class MyHashMap<K, V> {
	MyLinkedList<K> l1;
	
	public MyHashMap(){
		this.l1 = new MyLinkedList<>();
	}
	
	public V get(K key) {
		MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.l1.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.l1.search(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key,value);
			this.l1.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}
	@Override
	public String toString() {
		return "MyHashNodes{"+ l1+"}";
		
	}
}
