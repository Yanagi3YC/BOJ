import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		for (int i = 1; i <= num; i++) {
			queue.add(i);
		}
		while (queue.size() != 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		System.out.print(queue.poll());
	}
}
