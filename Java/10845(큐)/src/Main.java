import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		input.nextLine();
		for (int i = 0; i < r; i++) {
			String[] cmd = input.nextLine().split(" ");
			switch (cmd[0]) {
			case ("push"):
				queue.add(Integer.parseInt(cmd[1]));
				break;
			case ("pop"):
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.removeFirst());
				}
				break;
			case ("size"):
				System.out.println(queue.size());
				break;
			case ("empty"):
				if (queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case ("front"):
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.get(0));
				}
				break;
			case ("back"):
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.get(queue.size() - 1));
				}
			}
		}
		input.close();
	}
}
