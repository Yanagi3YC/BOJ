import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		input.nextLine();
		int count = 0;
		for (int i = 0; i < r; i++) {
			String word = input.nextLine();
			List<Character> list = new ArrayList<Character>();
			list.add(word.charAt(0));
			boolean valid = true;
			for (int j = 1; j < word.length(); j++) {
				if (word.charAt(j) != word.charAt(j - 1)) {
					if (list.contains(word.charAt(j))) {
						valid = false;
						break;
					} else {
						list.add(word.charAt(j));
					}
				}
			}
			if (valid) {
				count++;
			}
		}
		input.close();
		System.out.print(count);
	}
}
