package com.bridgelabz.binarysearchtree;

public class BSTUC3 {

	public static void main(String[] args) {

		BinaryTree1 binaryTree = new BinaryTree1();

		binaryTree.root = new Node(56);
		binaryTree.root.left = new Node(30);
		binaryTree.root.right = new Node(70);
		binaryTree.root.left.left = new Node(22);
		binaryTree.root.left.right = new Node(40);
		binaryTree.root.right.left = new Node(60);
		binaryTree.root.right.right = new Node(95);
		binaryTree.root.left.left.left = new Node(11);
		binaryTree.root.right.left.right = new Node(65);
		binaryTree.root.left.left.left.left = new Node(3);
		binaryTree.root.left.left.left.right = new Node(16);
		binaryTree.root.right.left.right.left = new Node(63);
		binaryTree.root.right.left.right.right = new Node(67);

		for (int x = 1; x <= 95; x++) {
			int level = binaryTree.getLevel(binaryTree.root, x);
			if (level != 0)
				System.out.println("Level of " + x + " is " + binaryTree.getLevel(binaryTree.root, x));
			else
				System.out.println(x + " is not present in tree");
		}
	}
}
