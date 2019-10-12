    /*
Suppose an arithmetic expression is given as a binary tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.

Given the root to such a tree, write a function to evaluate it.

For example, given the following tree:

    *
   / \
  +    +
 / \  / \
3  2  4  5
You should return 45, as it is (3 + 2) * (4 + 5).
 */
package com.sharma.algorithm.dailycodingproblem;

import java.util.Stack;

class Node {
    private Node left;
    private Node right;
    private String data;

    Node getLeft() {
        return left;
    }

    void setLeft(Node leftNode) {
        left = leftNode;
    }

    Node getRight() {
        return right;
    }

    void setRight(Node rightNode) {
        right = rightNode;
    }

    String getData() {
        return data;
    }

    Node(String nodeData) {
        data = nodeData;
    }

    boolean isleafNode() {
        if (this.left == null && this.right == null) {
            return true;
        }

        return false;
    }
}
public class Problem50 {

    public Integer evaluateTreeExpression(Node root) {
        Integer result  = new Integer(-1);

        if (root == null) {
            return result;
        }

        Stack<Node> nodeStack = parseExpressionTreeIntoStack(root);
        result = processNodeStack(nodeStack);

        return result;
    }

    private Stack<Node> parseExpressionTreeIntoStack(Node root) {

        Stack<Node> nodeStack = new Stack<>();
        parseNodes(root, nodeStack);

        return nodeStack;
    }

    private Integer processNodeStack(Stack<Node> nodeStack) {
        Integer result = new Integer(-1);

        Stack<Integer> operandStack = new Stack<>();
        while(!nodeStack.empty()) {
            Node node = nodeStack.pop();
            if (isOperator(node.getData())) {
                if (!operandStack.empty()) {
                    Integer value = evaluateExpression(node.getData(), operandStack.pop(), operandStack.pop());
                    operandStack.push(value);
                }
            } else {
                operandStack.push(new Integer(node.getData()));
            }
        }

        if (!operandStack.empty()) {
            result = operandStack.pop();
        }
        return result;
    }

    private Integer evaluateExpression(String data, Integer element, Integer element1) {
        Integer result = new Integer(-1);

        if (data == "/") {
            result = element/element1;
        }

        if (data == "*") {
            result = element*element1;
        }

        if (data == "+") {
            result = element+element1;
        }

        if (data == "-") {
            result = element-element1;
        }

        return result;
    }

    private boolean isOperator(String data) {
        if (data == "*" || data == "/" || data == "+" || data == "-") {
            return true;
        }

        return false;
    }

    private void parseNodes(Node root, Stack<Node> nodeStack) {
        if (root == null) {
            return;
        }

        nodeStack.push(new Node(root.getData()));
        parseNodes(root.getLeft(), nodeStack);
        parseNodes(root.getRight(), nodeStack);
    }

    public void printTree(Node root) {

        if(root == null) {
            return;
        }

        printTree(root.getLeft());
        printTree(root.getRight());
        System.out.println(root.getData());
    }
}
