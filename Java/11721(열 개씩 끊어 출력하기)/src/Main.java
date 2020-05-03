import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		input.close();
		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			if (count == 10) {
				System.out.print("\n" + line.charAt(i));
				count = 1;
			} else {
				count++;
				System.out.print(line.charAt(i));
			}
		}
	}
}
