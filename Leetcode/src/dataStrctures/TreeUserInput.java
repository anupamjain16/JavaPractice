package dataStrctures;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeUserInput<T> {

	public T data;
	public ArrayList<TreeUserInput<T>> children;

	TreeUserInput(T data) {
		this.data = data;
		children = new ArrayList<>();
	}

	public static TreeUserInput<Integer> createTree(Scanner sc) {

		System.out.println(" Enter the Data");

		int data = sc.nextInt();

		TreeUserInput<Integer> root = new TreeUserInput<Integer>(data);

		System.out.println(" Enter the no of children for " + data);

		int childernNO = sc.nextInt();

		for (int i = 0; i < childernNO; i++) {

			TreeUserInput<Integer> child = createTree(sc);

			root.children.add(child);

		}
		return root;

	}

	public static void print(TreeUserInput<Integer> node) {

		String s = node.data + " :";

		for (int i = 0; i < node.children.size(); i++) {

			s = s + node.children.get(i).data + ",";

		}
		System.out.println(s);

		for (int i = 0; i < node.children.size(); i++) {

			print(node.children.get(i));

		}

	}

	public static int CountNodes(TreeUserInput<Integer> node) {
		int count = 1;
		for (int i = 0; i < node.children.size(); i++) {
			count++;
		}
		return count;

	}

	public static int max(TreeUserInput<Integer> node) {
		int max = node.data;

		for (int i = 0; i < node.children.size(); i++) {

			max = Math.max(max, node.children.get(i).data);
		}
		return max;
	}

	public static int hight(TreeUserInput<Integer> node) {
		int h = 0;

		for (int i = 0; i < node.children.size(); i++) {
			h++;
		}

		return h;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TreeUserInput<Integer> root = createTree(sc);

		print(root);

		System.out.println(max(root));

	}

}
