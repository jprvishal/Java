package com.sharma.datastructure.tree;

import com.sharma.datastructure.MyQueue;

public class TreeOperationsHelper {
	
	public Node insertElement(Node root, int element) {
		
		if (root == null) {
			root = new Node(element);
			return root;
		}
		
		if (element < root.getData()) {
			Node left = insertElement(root.getLeft(), element);
			root.setLeftNode(left);
		} else {
			 Node right = insertElement(root.getRight(), element);
			 root.setRightNode(right);
		}
		
		return root;
	}
	
	public boolean lookupElement(Node root, int lookupElement) {
		
		if (root == null) {
			return false;
		}
		
		if (root.getData() == lookupElement) {
			return true;
		}
		
		boolean result;
		if (root.getData() < lookupElement) {
			result = lookupElement(root.getRight(), lookupElement);
		} else {
			result = lookupElement(root.getLeft(), lookupElement);
		}		
		
		return result;
	}
	
	public int findMinValueInBSTree(Node root) {
		
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		
		int minValue = root.getData();
		if (root.getLeft() != null) {
			minValue = findMinValueInBSTree(root.getLeft());
		}
		
		return minValue;
	}
	
	public int findMinValueInBSTreeUsingIteration(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		
		Node node = root;
		int minValue = Integer.MIN_VALUE;		
		while(node != null) {
			minValue = node.getData();
			node = node.getLeft();
		}
		
		return minValue;
	}

	public int findDepthOfTree(Node root) {
		if (root == null) {
			return 0;
		}
		
		if (root.getLeft() == null && root.getRight() == null) {
			return 0;
		}
		
		int leftDepth = 1 + findDepthOfTree(root.getLeft());
		int rightDepth = 1 + findDepthOfTree(root.getRight());
		
		return Math.max(leftDepth,rightDepth);
	}
	
	public Node mirrorTheTree(Node root) {
		if (root == null) {
			return null;
		}
		
		if (root.getLeft() == null && root.getRight() == null) {
			return root;
		}
		
		Node node = root;
		Node temp = node.getLeft();
		node.setLeftNode(node.getRight());
		node.setRightNode(temp);

		if (node.getLeft() != null) {
			node = mirrorTheTree(node.getLeft());
		}
		
		if (node.getRight() != null ) {
			node = mirrorTheTree(node.getRight());
		}
		
		return root;	
	}
	
	public int countUniqueTreePattern(Node root) {
		return -1;
	}
	
	public void printAllNodesInRange(Node root, int min, int max) {
		if (root == null) {
			return;
		}
		
		if (root.getData() >= min && root.getData() <= max) {
			System.out.print(root.getData());
		} 

		if (root.getData() < min || root.getData() > min) {
			printAllNodesInRange(root.getLeft(), min, max);
		}
		
		if (root.getData() >= min) {
			printAllNodesInRange(root.getRight(), min, max);
		}
		
	}
	
	public void printInOrder(Node root) {
		if (root == null) {
			return;
		}
		
		printInOrder(root.getLeft());
		System.out.println(root.getData());				
		printInOrder(root.getRight());
	}	
	
	public void printPreOrder(Node root) {
		if (root == null) {
			return;
		}
		
		System.out.println(root.getData());
		printPreOrder(root.getLeft());		
		printPreOrder(root.getRight());		
	}
	
	public void printPostOrder(Node root) {
		if (root == null) {
			return;
		}
		
		printPostOrder(root.getLeft());		
		printPostOrder(root.getRight());
		System.out.println(root.getData());		
	}
	
	public void printBreadthFirst(Node root) {
		if (root == null) {
			return;
		}
		
		MyQueue<Node> queue = new MyQueue<>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			Node node = queue.dequeue();
			System.out.println(node.getData());
			
			if (node.getLeft() != null) {
				queue.enqueue(node.getLeft());
			}
			
			if (node.getRight() != null) {
				queue.enqueue(node.getRight());
			}
		}
	}	
}
