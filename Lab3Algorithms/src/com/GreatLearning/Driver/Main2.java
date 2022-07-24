package com.GreatLearning.Driver;

import java.util.Scanner;

import com.GreatLearning.Service.BinarySearchTreeSumPair;
import com.GreatLearning.Service.BinarySearchTreeSumPair.Node;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeSumPair sumPair = new BinarySearchTreeSumPair();

		int value;
		int num;
		int sum;
		Scanner sc = new Scanner(System.in);
		Node root = null;
		Node result = null;

		System.out.println("Enter the number of nodes you want to enter in the tree");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("\nInsert value at " + (i + 1) + ": ");
			value = sc.nextInt();
			if (root == null) {
				root = sumPair.insertNode(root, value);
			} else {
				result = sumPair.insertNode(root, value);
				if (result.key == value)
					i -= 1;
			}
			System.out.println("Inorder of Binary Tree\n");
			sumPair.inorderTraversal(root);
		}
		
		
		System.out.println("Enter the sum to check for the given Binary Search Tree");
		sum=sc.nextInt();
		
		sumPair.isPairPresent(result, sum);
		
		sc.close();
		
	}

}
