import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		LinkedList<String> words = new LinkedList<String>();
		String word = input.nextLine();
		for (int i = 0; i < word.length(); i++) {
			String temp = "";
			for (int j = i; j < word.length(); j++) {
				temp += word.charAt(j);
			}
			words.add(temp);
		}
		Collections.sort(words);
		Iterator<String> itr = words.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		input.close();
	}
}
