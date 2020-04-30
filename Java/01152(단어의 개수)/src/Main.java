import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split(" ");
		if (line.length == 0) {
			System.out.print(0);
		} else {
			int result = line.length;
			if (line[0].equals("")) {
				result--;
			}
			if (line[line.length - 1].equals("")) {
				result--;
			}

			System.out.print(result);
			input.close();
		}
	}
}