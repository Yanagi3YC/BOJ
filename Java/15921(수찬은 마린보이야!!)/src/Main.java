import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 0) {
			System.out.print("divide by zero");
		} else {
			System.out.print("1.00");
		}
		sc.close();
	}
}