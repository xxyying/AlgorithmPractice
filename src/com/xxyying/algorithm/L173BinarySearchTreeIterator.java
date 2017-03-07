package com.xxyying.algorithm;

import java.util.Stack;

/*
 * 
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * Calling next() will return the next smallest number in the BST.
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 * 
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class L173BinarySearchTreeIterator {
	
	static Stack<TreeNode> stack = new Stack<>();
	public L173BinarySearchTreeIterator(TreeNode root) {
		push(root);
	}

    /** @return whether we have a next smallest number */
    public static boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public static int next() {
    	TreeNode next = stack.pop();
    	if (next.right != null) {
    		push(next.right);
    	}
    	return next.val;
    }
    
    public static void push(TreeNode root) {
    	while (root != null) {
    		stack.push(root);
    		root = root.left;
    	}
    }
    
    public static String stackToString() {
    	StringBuilder sb = new StringBuilder();
    	for (TreeNode node : stack) {
    		sb.append(node.val);
    		sb.append(' ');
    	}
    	return sb.toString();
    }
	
/*
 * 			 5
 * 		   /   \	
 * 		  3		7
 * 		/   \
 * 	   2     4
 */
	
	public static void main(String[] args) {
		
		// construct a tree
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		
		// test1
		L173BinarySearchTreeIterator test1 = new L173BinarySearchTreeIterator(root);
		boolean b1 = test1.hasNext();
		int next = test1.next();
		
		System.out.println("-----------------------------test---------------------------");
		System.out.println("Elements in stack: [" + stackToString() + "]");
		System.out.println("Current node is: " + root.val);
		System.out.println("Does it has next smallest value? " + b1);
		System.out.println("The next smallest value is: " + next);

//		// test2
		boolean b2 = test1.hasNext();
		int next2 = test1.next();
		
		System.out.println("-----------------------------test---------------------------");
		System.out.println("Elements in stack: [" + stackToString() + "]");
		System.out.println("Current node is: " + root.val);
		System.out.println("Does it has next smallest value? " + b2);
		System.out.println("The next smallest value is: " + next2);
	
	}

}
