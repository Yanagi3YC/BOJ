import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1 = input.next();
		String n2 = input.next();
		input.close();
		int n1_r = Integer.parseInt(
				Character.toString(n1.charAt(2)) + Character.toString(n1.charAt(1)) + Character.toString(n1.charAt(0)));
		int n2_r = Integer.parseInt(
				Character.toString(n2.charAt(2)) + Character.toString(n2.charAt(1)) + Character.toString(n2.charAt(0)));
		if (n1_r - n2_r > 0) {
			System.out.print(n1_r);
		} else {
			System.out.print(n2_r);
		}
	}
}
