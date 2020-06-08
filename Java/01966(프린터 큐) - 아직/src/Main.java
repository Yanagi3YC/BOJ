import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r = Integer.parseInt(br.readLine());
		for (int i = 0; i < r; i++) {
			Queue<Integer> q = new LinkedList<Integer>();
			String[] cmd = br.readLine().split(" ");
			int amount = Integer.parseInt(cmd[0]);
			int targetIndex = Integer.parseInt(cmd[1]);
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int j = 0; j < amount; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				list.add(tmp);
				q.add(tmp);
			}
			int target = list.get(targetIndex);
			Collections.sort(list);
			Collections.reverse(list);
			int count = 0;
			while (!q.isEmpty()) {
				if (q.peek() == list.get(0)) {
					count++;
					int tmp = q.remove();
					list.removeFirst();
					if (tmp == target) {
						break;
					}
				} else {
					q.add(q.remove());
				}
			}
			bw.write(count + "\n");
		}
		bw.flush();
		bw.close();
	}
}
