package com.GreatLearning.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeSumPair {

	public static class Node {
		public int key;
		Node left;
		Node right;
	}

	// creating methods for insertion in the BST here
	static Node newNode(int key) {
		Node tempNode = new Node();
		tempNode.key = key;
		tempNode.left = null;
		tempNode.right = null;

		return tempNode;
	}

	// this method will insert the nodes in the empty BST
	public Node insertNode(Node root, int key) {
		Node newnode = newNode(key);
		Node x = root;
		Node currentParent = null;

		while (x != null) {
			currentParent = x;
			if (key < x.key) {
				x = x.left;
			} else if (key > x.key) {
				x = x.right;
			} else {
				System.out.println("Duplicate values not allowed!!");
				return newnode;
			}
		}

		// If the root is null, the tree is empty
		if (currentParent == null) {
			currentParent = newnode;
		}

		// assign the new node to the left child
		else if (key < currentParent.key) {
			currentParent.left = newnode;
		}

		// assign the new node to the right child
		else {
			currentParent.right = newnode;
		}

		// return pointer to new node
		return currentParent;
	}

	// Method that adds values of given BST into ArrayList
	// and hence returns the ArrayList
	public ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list) {
		// Base Case
		if (node == null)
			return list;

		treeToList(node.left, list);
		list.add(node.key);
		treeToList(node.right, list);

		return list;
	}

// method that checks if there is a pair present
	public boolean isPairPresent(Node node, int target) {
		// This list a1 is passed as an argument
		// in treeToList method
		// which is later on filled by the values of BST
		ArrayList<Integer> a1 = new ArrayList<>();

		// a2 list contains all the values of BST
		// returned by treeToList method
		ArrayList<Integer> a2 = treeToList(node, a1);

		int start = 0; // Starting index of a2

		int end = a2.size() - 1; // Ending index of a2

		while (start < end) {

			if (a2.get(start) + a2.get(end) == target) // Target Found!
			{
				System.out.println("Pair Found: " + a2.get(start) + " + " + a2.get(end) + " " + "= " + target);
				return true;
			}

			if (a2.get(start) + a2.get(end) > target) // decrements end
			{
				end--;
			}

			if (a2.get(start) + a2.get(end) < target) // increments start
			{
				start++;
			}
		}

		System.out.println("No such values are found!");
		return false;
	}

	public void inorderTraversal(Node root) {
		if (root == null)
			return;
		else {
			inorderTraversal(root.left);
			System.out.print(root.key + " ");
			inorderTraversal(root.right);
		}

	}

}
