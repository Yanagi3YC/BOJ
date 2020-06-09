import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Deque<Character> q = new LinkedList<Character>();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		int numberOfBrackets = 0;
		for (int i = 0; i < line.length(); i++) {
			q.add(line.charAt(i));
			if (line.charAt(i) == '(') {
				numberOfBrackets++;
			}
		}
		int bracketCount = 0;
		while (q.contains('(') || q.contains(')')) {
			char tmp = q.remove();
			if (tmp == '(') {
				bracketCount++;
				if (bracketCount == numberOfBrackets) {
					Stack<Character> stk = new Stack<Character>();
					int multyply = q.removeLast() - '0';
					char token = q.remove();
					String str = "";
					while (true) {
						if (token == '(') {
							stk.push(token);
						} else if (token == ')') {
							if (stk.isEmpty()) {
								break;
							} else {
								stk.pop();
							}
						}
						str += token;
						token = q.remove();
					}
					for (int i = 0; i < multyply; i++) {
						for (int j = 0; j < str.length(); j++) {
							q.add(str.charAt(j));
						}
					}
					bracketCount = 0;
					numberOfBrackets--;
				} else {
					q.add(tmp);
				}
			} else {
				q.add(tmp);
			}
		}
		System.out.print(q.size());
	}
}
