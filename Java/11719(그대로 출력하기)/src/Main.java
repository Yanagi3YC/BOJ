import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		while (input.hasNextLine()) {
			String line = input.nextLine();
			list.add(line);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		input.close();
	}
}
