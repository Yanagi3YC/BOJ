import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Integer, Node> map = new HashMap<Integer, Node>();
		int num = Integer.parseInt(br.readLine());
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		for (int i = 0; i < num; i++) {
			int token = Integer.parseInt(st.nextToken());
			if (map.containsKey(token)) {
				int data = map.get(token).data;
				Node left = map.get(token).left;
				map.put(token, new Node(data, left, new Node(i)));
			} else {
				map.put(token, new Node(token, new Node(i)));
			}
		}
		int del = Integer.parseInt(br.readLine());
		br.close();
		for (int i : map.keySet()) {
			if (i == del) {
				map.remove(i);
				break;
			}
		}
		int count = 0;
		for (int i : map.keySet()) {
			if (map.get(i).left == null && map.get(i).right == null) {
				count++;
			}
		}
		bw.write(count);
		bw.flush();
		bw.close();
	}

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int i, Node n) {
			data = i;
			left = n;
		}

		public Node(int i, Node l, Node r) {
			data = i;
			left = l;
			right = r;
		}

		public Node(int i) {
			data = i;
		}

	}
}