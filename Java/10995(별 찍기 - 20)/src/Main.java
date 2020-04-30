import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		input.close();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (i % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
