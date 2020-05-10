import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		input.close();
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			switch (ch) {
			case ('c'):
				if (i < word.length() - 1) {
					if (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-') {
						i++;
					}
				}
				break;
			case ('d'):
				if (i < word.length() - 1) {
					if (word.charAt(i + 1) == '-') {
						i++;
					} else {
						if (i < word.length() - 2) {
							if (word.charAt(i + 1) == 'z' && word.charAt(i + 2) == '=') {
								i++;
								i++;
							}
						}
					}
				}
				break;
			case ('l'):
			case ('n'):
				if (i < word.length() - 1) {
					if (word.charAt(i + 1) == 'j') {
						i++;
					}
				}
				break;
			case ('s'):
			case ('z'):
				if (i < word.length() - 1) {
					if (word.charAt(i + 1) == '=') {
						i++;
					}
				}
				break;
			}
			count++;

		}
		System.out.print(count);
	}
}
