package com.sharma.datastructure.tree;

public class Node {

    private int data;
    private Node left;
    private Node right;

    Node(int newData) {
        data = newData;
        left = null;
        right = null;
    }

    public void setLeftNode(Node newLeftNode) {
        left = newLeftNode;
    }

    public void setRightNode(Node newRightNode) {
        right = newRightNode;
    }
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public int getData() {
		return data;
	}
}
