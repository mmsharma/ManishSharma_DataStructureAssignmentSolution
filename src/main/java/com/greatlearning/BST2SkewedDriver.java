package com.greatlearning;

public class BST2SkewedDriver {

	public static void main(String[] args) {
		BST2SkewedTree tree = new BST2SkewedTree();
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		tree.root.right.left = new Node(55);

		tree.toRightSkewed(tree.root);
		tree.traverseRightSkewedTree(tree.headNode);
	}

}
