import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LinkedList<Integer> numbers = new LinkedList<Integer>();
		int r = Integer.parseInt(br.readLine());
		for (int i = 0; i < r; i++) {
			int temp = Integer.parseInt(br.readLine());
			numbers.add(temp);
		}
		Collections.sort(numbers);
		Iterator<Integer> itr = numbers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}