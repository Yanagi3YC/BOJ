import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		for (int i = 0; i < r; i++) {
			long token = input.nextLong();
			if (map.containsKey(token)) {
				map.put(token, map.get(token) + 1);
			} else {
				map.put(token, 1);
			}
		}
		input.close();
		Long maxKey = Long.MIN_VALUE;
		Integer maxVal = Integer.MIN_VALUE;
		for (Long entry : map.keySet()) {
			if (map.get(entry) > maxVal) {
				maxKey = entry;
				maxVal = map.get(entry);
			} else if (map.get(entry) == maxVal) {
				if (entry < maxKey) {
					maxKey = entry;
				}
			}
		}
		System.out.print(maxKey);
	}
}