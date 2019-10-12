package com.sharma.algorithm.dailycodingproblem;

public class Problem50TestClass {

    public static void main(String[] args) {
        Problem50 problem50 = new Problem50();
        Node root = new Node("*");

        root.setLeft(new Node("+"));
        root.setRight(new Node("+"));

        root.getLeft().setLeft(new Node("2"));
        root.getLeft().setRight(new Node("3"));

        root.getRight().setLeft(new Node("4"));
        root.getRight().setRight(new Node("5"));

        problem50.printTree(root);

        Integer result = problem50.evaluateTreeExpression(root);
        System.out.println("Expression evaluation result == " + result.toString());

        System.out.println(new Character('A'));
        System.out.println((int)'A');
        System.out.println((int)'Z');
        System.out.println((int)'a');
        System.out.println((int)'z');

    }
}
