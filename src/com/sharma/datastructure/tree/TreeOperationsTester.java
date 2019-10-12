package com.sharma.datastructure.tree;

public class TreeOperationsTester {
	
	private Node root;
	private TreeOperationsHelper helper = new TreeOperationsHelper();

	public Node getRoot() {
		return root;
	}

	public TreeOperationsHelper getHelper() {
		return helper;
	}
	
	public static void main(String[] args) {
        TreeOperationsTester tree = new TreeOperationsTester();
		Node root = tree.getRoot();
		root = tree.getHelper().insertElement(root, 10);
		root = tree.getHelper().insertElement(root, 8);
		root = tree.getHelper().insertElement(root, 17);
		root = tree.getHelper().insertElement(root, 16);
		root = tree.getHelper().insertElement(root, 9);
		root = tree.getHelper().insertElement(root, 20);
		root = tree.getHelper().insertElement(root, 25);
		root = tree.getHelper().insertElement(root, 50);
		root = tree.getHelper().insertElement(root, 2);

		System.out.println("\nIn Order tree \n");
		tree.getHelper().printInOrder(root);
		System.out.println("\nPre Order tree \n");
		tree.getHelper().printPreOrder(root);
		System.out.println("\nPost Order tree \n");
		tree.getHelper().printPostOrder(root);
		
		System.out.println("Tree in breadth First ");
		tree.getHelper().printBreadthFirst(root);
		
		int lookupElement = 9;
		boolean elementFound = tree.getHelper().lookupElement(root, lookupElement);
		if (elementFound) {
			System.out.println("Element found in Tree!");
		} else {
			System.out.println("Element is not present in Tree!");
		}

		System.out.println("Min Value is == " + tree.getHelper().findMinValueInBSTree(root));
		System.out.println("Min value using Iteration is == " + tree.getHelper().findMinValueInBSTreeUsingIteration(root));

		System.out.println("Depth of tree == " + tree.getHelper().findDepthOfTree(root));
		
		System.out.println("\nPre Order tree \n");
		tree.getHelper().printPreOrder(root);
		
		Node mirrorRoot = tree.getHelper().mirrorTheTree(root);
		System.out.println("Mirror tree PreOrder print \n");
		tree.getHelper().printPreOrder(mirrorRoot);
	}
}
