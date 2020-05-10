import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		input.nextLine();
		int count = 0;
		for (int i = 0; i < r; i++) {
			Stack<Character> stk = new Stack<Character>();
			String word = input.nextLine();
			for (int j = 0; j < word.length(); j++) {
				if (stk.isEmpty()) {
					stk.push(word.charAt(j));
				} else {
					if (stk.peek() == word.charAt(j)) {
						stk.pop();
					} else {
						stk.push(word.charAt(j));
					}
				}
			}
			if (stk.isEmpty()) {
				count++;
			}
		}
		input.close();
		System.out.print(count);
	}
}
