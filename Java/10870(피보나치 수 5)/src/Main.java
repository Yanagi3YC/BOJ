import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static LinkedList<Integer> fiboNumbers = new LinkedList<Integer>();

	public static int fibo(int n) {
		if (n >= 2) {
			fiboNumbers.add(n, fibo(n - 2) + fibo(n - 1));
		}
		return fiboNumbers.get(n);
	}

	public static void main(String args[]) {
		fiboNumbers.add(0, 0);
		fiboNumbers.add(1, 1);
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
		input.close();
		System.out.print(fibo(num));
	}
}