
package com.greatlearning;

/**
 * @author manishmohitsharma
 *
 */
public class BST2SkewedTree {

	public static Node root;
	static Node prevNode = null;
	static Node headNode = null;

	public static void toRightSkewed(Node root) {

		if (root == null) {
			return;
		}

		toRightSkewed(root.left);
		Node right = root.right;

		if (null == headNode) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		toRightSkewed(right);
	}

	static void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key + " ");
		traverseRightSkewedTree(root.right);
	}

}
