package com.xxyying.algorithm;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree, return all root-to-leaf paths.
	For example, given the following binary tree:

	   1
	 /   \
	2     3
	 \
	  5
	  
	All root-to-leaf paths are:	
	["1->2->5", "1->3"]
 * 
 */


public class L257BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		
		ArrayList<String> result = new ArrayList<>();
		
		if (root == null) {
			return result;
		} else {
			curPath(root, "", result);
		}
		return result;	
    }
	
	private void curPath(TreeNode node, String curpath, ArrayList<String> result) {
		if (node.left == null && node.right == null) {
			result.add(curpath + node.val);
		}
		if (node.left != null) {
			curPath(node.left, curpath + node.val + "->", result);
		}
		if (node.right != null) {
			curPath(node.right, curpath + node.val + "->", result);
		}
	}
	
	
	
	public static void main (String[] args) {
		
	}
}
