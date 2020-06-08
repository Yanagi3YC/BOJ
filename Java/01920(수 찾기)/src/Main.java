import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = (sc.nextInt());
		}
		Arrays.sort(arr);
		int r = sc.nextInt();
		for (int i = 0; i < r; i++) {
			int tmp = sc.nextInt();
			int left = 0;
			int right = arr.length - 1;
			int found = 0;
			while (left <= right) {
				int mid = (left + right) / 2;
				if (tmp == arr[mid]) {
					found = 1;
					break;
				} else if (tmp > arr[mid]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
			System.out.println(found);
		}
		sc.close();
	}
}
