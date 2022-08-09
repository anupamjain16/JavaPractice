package dataStrctures;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeNode<T> {

	public T data;
	public ArrayList<TreeNode<T>> childern;

	TreeNode(T data) {
		this.data = data;
		childern = new ArrayList<>();
	}

	
	public static void main(String[] args) {

		// create node
		TreeNode<Integer> root = new TreeNode<Integer>(5);

		TreeNode<Integer> node1 = new TreeNode<Integer>(4);

		TreeNode<Integer> node2 = new TreeNode<Integer>(3);

		TreeNode<Integer> node3 = new TreeNode<Integer>(2);

		TreeNode<Integer> node4 = new TreeNode<Integer>(1);

		// link nodes
		root.childern.add(node1);
		root.childern.add(node2);
		node2.childern.add(node3);
		node2.childern.add(node4);

		System.out.println(root);
	}

}
