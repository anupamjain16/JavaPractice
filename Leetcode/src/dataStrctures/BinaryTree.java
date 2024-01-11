package dataStrctures;

public class BinaryTree<T> {

	T data;
	BinaryTree<T> left;
	BinaryTree<T> right;

	public BinaryTree(T data) 
	{
		this.data = data;
		left = null;
		right = null;

	}

	private static void print(BinaryTree<Integer> node) {
		
		String s = node.data + " ";
		
		if (node == null)
			return;
		

		if (node.left != null) {
			s = "L:" + node.left.data + ",";
			
		}

		if (node.right != null) {
			s = "R:" + node.right.data + ",";
			
		}
		System.out.println(s);
		print(node.left);
		print(node.right);

	}

	private static void inorder(BinaryTree<Integer> node) {

		print(node.left);
		System.out.println(node.data);
		print(node.right);

	}

	public static void main(String[] args) {

		BinaryTree<Integer> root = new BinaryTree<>(2);
		BinaryTree<Integer> node1 = new BinaryTree<>(4);
		BinaryTree<Integer> node2 = new BinaryTree<>(1);

		BinaryTree<Integer> node3 = new BinaryTree<>(7);
		BinaryTree<Integer> node4 = new BinaryTree<>(8);
		BinaryTree<Integer> node5 = new BinaryTree<>(3);

		root.left = node1;
		root.right = node2;

		node1.left = node3;

		node2.right = node4;
		node2.left = node5;

		 //print(root);
		inorder(root);

	}

}
