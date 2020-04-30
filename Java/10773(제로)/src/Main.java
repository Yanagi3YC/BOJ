import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		Stack<Integer> stk = new Stack<Integer>();
		for (int i = 0; i < r; i++) {
			int temp = input.nextInt();
			if (temp == 0) {
				stk.pop();
			} else {
				stk.push(temp);
			}
		}
		input.close();
		int result = 0;
		while (!stk.isEmpty()) {
			result += stk.pop();
		}
		System.out.print(result);
	}
}
