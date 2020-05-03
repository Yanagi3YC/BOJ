import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);
		map.put(4, 0);
		map.put(5, 0);
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 4; j++) {
				map.put(i, map.get(i) + input.nextInt());
			}
		}
		input.close();
		int maxKey = Integer.MIN_VALUE;
		int maxVal = Integer.MIN_VALUE;
		for (int entry : map.keySet()) {
			if (map.get(entry) > maxVal) {
				maxKey = entry;
				maxVal = map.get(entry);
			}
		}
		System.out.print(maxKey + " " + maxVal);
	}
}