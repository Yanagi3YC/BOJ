import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			String result = "yes";
			LinkedList<Character> list = new LinkedList<Character>();
			String line = input.nextLine();
			if (line.equals("0")) {
				break;
			} else {
				for (int i = 0; i < line.length(); i++) {
					list.add(line.charAt(i));
				}
				int r = 0;
				if (list.size() % 2 == 1) {
					r = 1;
				}
				while (list.size() != r) {
					if (list.peekFirst() == list.peekLast()) {
						list.removeFirst();
						list.removeLast();
					} else {
						result = "no";
						break;
					}
				}
				System.out.println(result);
			}
		}
		input.close();
	}
}