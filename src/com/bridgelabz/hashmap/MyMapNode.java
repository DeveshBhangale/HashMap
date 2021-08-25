package com.bridgelabz.hashmap;

public class MyMapNode<K, V> implements INode<K> {
K key;
V value;

MyMapNode<K, V> next;

public MyMapNode(K key, V value){
	this.key = key;
	this.value = value;
	this.next = null;
}

public K getKey() {
	return key;
}

public void setKey(K key) {
	this.key = key;
	
}


public INode<K> getNext() {
	return next;
}


public void setNext(INode next) {
	this.next = (MyMapNode<K, V>) next;
}

public V getValue() {
	return value;
}

public void setValue(V value) {
	this.value = value;
}

@Override
public String toString() {
	StringBuilder str = new StringBuilder();
	str.append(" MyMapNode{ k=").append(key).append(" V=").append(value).append(" } ");
	if(next!=null)
		str.append("->").append(next);
	
	return str.toString();
	
}
}
