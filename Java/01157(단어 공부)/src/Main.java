import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Scanner input = new Scanner(System.in);
		String line = input.nextLine().toUpperCase();
		input.close();
		for (int i = 0; i < line.length(); i++) {
			char token = line.charAt(i);
			if (map.containsKey(token)) {
				map.put(token, map.get(token) + 1);
			} else {
				map.put(token, 1);
			}
		}
		int maxInt = Integer.MIN_VALUE;
		char maxChar = '?';
		for (char entry : map.keySet()) {
			if (map.get(entry) > maxInt) {
				maxInt = map.get(entry);
				maxChar = entry;
			} else if (map.get(entry) == maxInt) {
				maxChar = '?';
				maxInt = map.get(entry);
			}
		}
		System.out.print(maxChar);
	}
}