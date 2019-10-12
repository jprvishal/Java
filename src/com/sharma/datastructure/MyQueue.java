package com.sharma.datastructure;

class LinkNode<T> {
	private T data;
	private LinkNode<T> next;
	
	public LinkNode(T newData) {
		this.data = newData;
		next = null;
	}
	
	public T getData() {
		return data;
	}
	
	public LinkNode<T> getNextNode() {
		return next;
	}
	
	public void setNextNode(LinkNode<T> newNode) {
		this.next = newNode;
	}
}

public class MyQueue<T> {
	
	private LinkNode<T> queue;
	private LinkNode<T> tail;
	private int elementCount = 0;
	
	public MyQueue() {
		
	}
	
	public void enqueue(T data) {
		LinkNode<T> node = new LinkNode<T>(data);
		
		if (elementCount == 0) {
			queue = node;
		} else {
			tail.setNextNode(node);
		}	
		
		tail = node;
		elementCount++;
	}
	
	public boolean isEmpty() {
		return elementCount == 0;
	}
	
	public int size() {
		return elementCount;
	}
	
	public T dequeue() {
		LinkNode dequeuedNode = queue;
		queue = queue.getNextNode();
		elementCount--;
		
		return (T)dequeuedNode.getData();
	}
	
	public T peek() {
		return queue.getData();
	}
	
	public void print() {
		if (queue == null) {
			return;
		}
		LinkNode<T> head = queue;
		while(head != null) {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
	}
		
	public static void main(String[] args) {
		MyQueue<Integer> intQueue = new MyQueue<>();
		
		intQueue.enqueue(new Integer(10));
		intQueue.enqueue(new Integer(15));
		intQueue.enqueue(new Integer(25));
		intQueue.enqueue(new Integer(95));
		
		System.out.println("Queue size == " + intQueue.size());
		
		System.out.println("MyQueue entries are :");
		intQueue.print();
		
		System.out.println("dequeue element == " + intQueue.dequeue());
		System.out.println("dequeue element == " + intQueue.dequeue());
		System.out.println("peek element == " + intQueue.peek());
		
		System.out.println("Queue size == " + intQueue.size());
		
		MyQueue<String> strQueue = new MyQueue<>();
		strQueue.enqueue("My");
		strQueue.enqueue("String");
		strQueue.enqueue("Queue");
		strQueue.enqueue("Entries");
		
		System.out.println("Queue size == " + strQueue.size());
		
		System.out.println("MyQueue entries are :");
		strQueue.print();
		
		System.out.println("dequeue element == " + strQueue.dequeue());
		System.out.println("dequeue element == " + strQueue.dequeue());
		System.out.println("peek element == " + strQueue.peek());
		
		System.out.println("Queue size == " + strQueue.size());
	}
}
