import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		input.close();

		for (int i = 0; i < r * 2; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < r; j++) {
					if (j % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}else {
				for (int j = 0; j < r; j++) {
					if (j % 2 == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

	}
}
