import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = Integer.parseInt(input.nextLine());
		String[] txt = new String[r];
		for (int i = 0; i < r; i++) {
			txt[i] = input.nextLine();
		}
		input.close();
		for (int i = 0; i < r; i++) {
			Stack<String> stk = new Stack<String>();
			boolean isValid = true;
			for (int j = 0; j < txt[i].length(); j++) {
				switch (txt[i].charAt(j)) {
				case '(':
					stk.push("(");
					break;
				case ')':
					if (stk.isEmpty()) {
						isValid = false;
					} else if (stk.peek() == "(") {
						stk.pop();
					} else if (stk.peek() == ")") {
						isValid = false;
					}
					break;
				}
			}
			if (!stk.isEmpty()) {
				isValid = false;
			}
			if (isValid) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
