import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> dq = new LinkedList<Integer>();
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
			case ("push_front"):
				dq.addFirst(num);
				break;
			case ("push_back"):
				dq.addLast(num);
				break;
			case ("pop_front"):
				if (dq.size() == 0) {
					bw.write(-1 + "\n");
				} else {
					bw.write(dq.removeFirst() + "\n");
				}
				break;
			case ("pop_back"):
				if (dq.size() == 0) {
					bw.write(-1 + "\n");
				} else {
					bw.write(dq.removeLast() + "\n");
				}
				break;
			case ("size"):
				bw.write(dq.size() + "\n");
				break;
			case ("empty"):
				if (dq.isEmpty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
				break;
			case ("front"):
				if (dq.size() == 0) {
					bw.write(-1 + "\n");
				} else {
					bw.write(dq.peekFirst() + "\n");
				}
				break;
			case ("back"):
				if (dq.size() == 0) {
					bw.write(-1 + "\n");
				} else {
					bw.write(dq.peekLast() + "\n");
				}
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
