import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Map<String, Node> map = new HashMap<String, Node>();
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		Node root = null;
		for (int i = 0; i < count; i++) {
			String line = sc.nextLine();
			String[] token = line.split(" ");
			String name1 = token[0];
			Node node = null;
			if (!map.containsKey(name1)) {
				node = new Node(name1);
				map.put(name1, node);
				if (map.size() == 1) {
					root = node;
				}
			} else {
				node = map.get(name1);
			}
			String name2 = token[1];
			Node left = null;
			if (!map.containsKey(name2)) {
				left = new Node(name2);
				map.put(name2, left);
			} else {
				left = map.get(name2);
			}
			node.left = left;

			String name3 = token[2];
			Node right = null;
			if (!map.containsKey(name3)) {
				right = new Node(name3);
				map.put(name3, right);
			} else {
				right = map.get(name3);
			}
			node.right = right;

		}
		sc.close();
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
	}

	public static void preorder(Node root) {
		if (!root.data.equals(".")) {
			System.out.print(root.data);
		}
		if (root.left != null) {
			preorder(root.left);
		}
		if (root.right != null) {
			preorder(root.right);
		}
	}

	public static void postorder(Node root) {
		if (root.left != null) {
			postorder(root.left);
		}
		if (root.right != null) {
			postorder(root.right);
		}
		if (!root.data.equals(".")) {
			System.out.print(root.data);
		}
	}

	public static void inorder(Node root) {
		if (root.left != null) {
			inorder(root.left);
		}
		if (!root.data.equals(".")) {
			System.out.print(root.data);
		}
		if (root.right != null) {
			inorder(root.right);
		}
	}

	static class Node {
		String data;
		Node left;
		Node right;

		Node(String data) {
			this.data = data;
		}
	}
}
