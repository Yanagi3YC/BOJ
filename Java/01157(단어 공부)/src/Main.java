import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Scanner input = new Scanner(System.in);
		String txt = input.nextLine().toUpperCase();
		input.close();
		for (int i = 0; i < txt.length(); i++) {
			if (map.containsKey(txt.charAt(i))) {
				map.put(txt.charAt(i), map.get(txt.charAt(i)) + 1);
			} else {
				map.put(txt.charAt(i), 1);
			}
		}
		char maxChar = 0;
		int maxInt = Integer.MIN_VALUE;
		boolean duplicate = false;
		for (Character entry : map.keySet()) {
			if (map.get(entry) == maxInt) {
				System.out.println('?');
				duplicate = true;
				break;
			} else {
				if (map.get(entry) > maxInt) {
					maxChar = entry;
					maxInt = map.get(entry);
				}
			}
		}
		if (duplicate == false) {
			System.out.println(maxChar);
		}
	}
}
