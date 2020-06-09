import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String pw = sc.nextLine();
		sc.close();
		for (int i = 0; i < num - pw.length(); i++) {
			list.add(0);
		}
		for (int i = 0; i < pw.length(); i++) {
			list.add(pw.charAt(i) - 'a' + 1);
		}
		int result = 0;
		for (int i = 0; i < num; i++) {
			if (list.get(i) != 0) {
				result += Math.pow(27, (num - i - 1)) + list.get(i);
			}
		}
		System.out.print(result);
	}
}
