import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int w = input.nextInt();
		int h = input.nextInt();
		input.close();
		int xMin = Integer.MIN_VALUE;
		int yMin = Integer.MIN_VALUE;
		if (x > w / 2) {
			xMin = w - x;
		} else {
			xMin = x;
		}
		if (y > h / 2) {
			yMin = h - y;
		} else {
			yMin = y;
		}
		if (yMin < xMin) {
			System.out.print(yMin);
		} else {
			System.out.print(xMin);
		}
	}
}
