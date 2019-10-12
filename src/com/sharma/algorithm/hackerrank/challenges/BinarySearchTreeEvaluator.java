package com.sharma.algorithm.hackerrank.challenges;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class BinarySearchTreeEvaluator {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    private Node createNode(int data) {
        return new Node(data);
    }


    public static void main(String[] args) {

        //1 2 4 3 5 6 7
        Node root = createTree();

//        Node root = null;
//        int[] dataArray = {10, 20, 30, 25, 16, 9, 6, 1, 35};
//        for (Integer data : dataArray) {
//              root = addTreeNode(root, data);
//        }

        //printTree(root, "PreOrder");

        boolean isBST = checkBST(root);
        System.out.println(isBST?"Yes":"No");

        BlockingQueue<Integer> blockingQueueInt = new LinkedBlockingQueue<>();
        blockingQueueInt.add(10);

        BlockingDeque<Integer> blockingDequeInt = new LinkedBlockingDeque<>();
        blockingDequeInt.add(15);


    }

    private static Node createTree() {
        Node root = null;

        root = createTreeUsingDataSet1();

        //root = createTreeUsingDataSet2();

        return root;
    }

    private static Node createTreeUsingDataSet2() {
        BinarySearchTreeEvaluator bste = new BinarySearchTreeEvaluator();
        Node root = bste.createNode(3);
        Node leftNode = root.left = bste.createNode(2);
        Node rightNode = root.right = bste.createNode(5);

        leftNode.left = bste.createNode(1);

        rightNode.left = bste.createNode(6);
        rightNode.right = bste.createNode(1);

        return root;
    }

    private static Node createTreeUsingDataSet1() {
        BinarySearchTreeEvaluator bste = new BinarySearchTreeEvaluator();
        Node root = bste.createNode(15);
        Node leftNode = root.left = bste.createNode(10);
        Node rightNode = root.right = bste.createNode(22);

        leftNode.left = bste.createNode(6);
        leftNode.right = bste.createNode(12);

        leftNode.left.left = bste.createNode(5);
        leftNode.left.right = bste.createNode(11);

        rightNode.left = bste.createNode(16);
        rightNode.right = bste.createNode(25);

        return root;
    }

    private static boolean checkBST(Node root) {

        boolean isBST = true;
        Set<Integer> treeDataSet = new HashSet<>();

        if (root == null) {
            return false;
        }

        treeDataSet.add(root.data);

        if (root.left != null) {
            isBST = checkIsBSTLeft(root.data, root.left, treeDataSet);
        }

        if (isBST && root.right != null) {
            isBST = checkIsBSTRight(root.data, root.right, treeDataSet);

        }

        return isBST;
    }

    private static boolean checkIsBSTLeft(int rootData, Node node, Set<Integer> treeDataSet) {

        boolean elementAdded = treeDataSet.add(node.data);
        if (!elementAdded) {
            //We have duplicate data
            return  false;
        }

        boolean isBST = true;
        if (node.left != null) {
            isBST = checkIsBSTLeft(node.data, node.left, treeDataSet);
        }

        if (node.right != null && rootData < node.right.data) {
            isBST = false;
        }

        if (isBST && node.right != null) {
            isBST = checkIsBSTRight(node.data, node.right, treeDataSet);
        }

        return isBST;
    }

    private static boolean checkIsBSTRight(int rootData, Node node, Set<Integer> treeDataSet) {

        boolean elementAdded = treeDataSet.add(node.data);
        if (!elementAdded) {
            //We have duplicate data
            return  false;
        }

        boolean isBST = true;
        if (node.right != null) {
            isBST = checkIsBSTRight(node.data, node.right, treeDataSet);
        }

        if (node.left != null && rootData > node.left.data) {
            isBST = false;
        }

        if (isBST && node.left != null) {
            isBST = checkIsBSTLeft(node.data, node.left, treeDataSet);
        }

        return isBST;
    }

    private static void printTree(Node root, String order) {

        if ("InOrder".equalsIgnoreCase(order)) {
            printTreeInOrder(root);
        }

        if ("PreOrder".equalsIgnoreCase(order)) {
            printTreePreOrder(root);
        }

        if ("PostOrder".equalsIgnoreCase(order)) {
            printTreePostOrder(root);
        }
    }

    private static void printTreePostOrder(Node root) {
        if (root == null) {
            return;
        }

        printTreePostOrder(root.left);
        printTreePostOrder(root.right);
        System.out.println(root.data);
    }

    private static void printTreePreOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        printTreePreOrder(root.left);
        printTreePreOrder(root.right);
    }

    private static void printTreeInOrder(Node root) {
        if (root == null) {
            return;
        }

        printTreeInOrder(root.left);
        System.out.println(root.data);
        printTreeInOrder(root.right);
    }

    private static Node addTreeNode(Node root, int data) {

        if (root == null) {
            root = new BinarySearchTreeEvaluator().createNode(data);
            return root;
        }

        if (root.data > data) {
            root.left = addTreeNode(root.left, data);
        } else {
            root.right = addTreeNode(root.right, data);
        }

        return root;
    }

}
