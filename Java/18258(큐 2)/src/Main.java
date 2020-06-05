import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> q = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r = Integer.parseInt(br.readLine());
		for (int i = 0; i < r; i++) {
			String line = br.readLine();
			String[] temp = line.split(" ");
			String cmd = temp[0];
			int num = Integer.MIN_VALUE;
			if (temp.length == 2) {
				num = Integer.parseInt(temp[1]);
			}
			switch (cmd) {
			case ("push"):
				q.add(num);
				break;
			case ("pop"):
				if (q.size() != 0) {
					bw.write(q.remove() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
				break;
			case ("size"):
				bw.write(q.size() + "\n");
				break;
			case ("empty"):
				if (q.size() == 0) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
				break;
			case ("front"):
				if (q.size() != 0) {
					bw.write(q.peek() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
				break;
			case ("back"):
				if (q.size() != 0) {
					bw.write(q.peekLast() + "\n");
				} else {
					bw.write(-1 + "\n");
				}
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
