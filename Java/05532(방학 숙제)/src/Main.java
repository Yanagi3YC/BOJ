import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int kor = sc.nextInt();
		int mat = sc.nextInt();
		int kor_possible = sc.nextInt();
		int mat_possible = sc.nextInt();
		sc.close();
		int kor_spend = kor / kor_possible;
		if (kor % kor_possible != 0) {
			kor_spend++;
		}
		int mat_spend = mat / mat_possible;
		if (mat % mat_possible != 0) {
			mat_spend++;
		}
		int result = 0;
		if (kor_spend > mat_spend) {
			result = day - kor_spend;
		} else {
			result = day - mat_spend;
		}
		System.out.print(result);
	}
}
