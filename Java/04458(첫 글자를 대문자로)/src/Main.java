import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		input.nextLine();
		for (int i = 0; i < r; i++) {
			String line = input.nextLine();
			StringBuilder sb = new StringBuilder(line);
			sb.setCharAt(0, (Character.toString(line.charAt(0)).toUpperCase()).charAt(0));
			System.out.println(sb);
		}
		input.close();
	}
}
