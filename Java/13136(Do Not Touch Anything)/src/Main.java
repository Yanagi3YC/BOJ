import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int range = sc.nextInt();
		sc.close();
		long hr = height / range;
		long wr = width / range;
		if (height % range != 0) {
			hr++;
		}
		if (width % range != 0) {
			wr++;
		}
		System.out.print(hr * wr);
	}
}
