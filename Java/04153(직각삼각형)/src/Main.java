import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int[] line = { input.nextInt(), input.nextInt(), input.nextInt() };
			if (line[0] == 0 && line[1] == 0 && line[2] == 0) {
				break;
			} else {
				Arrays.sort(line);
				if (Math.pow(line[0], 2) + Math.pow(line[1], 2) == Math.pow(line[2], 2)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			}
		}
	}
}
