import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] Alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int[] NumberOfAlphabets = new int[Alphabets.length];
		for (int i = 0; i < NumberOfAlphabets.length; i++)
			NumberOfAlphabets[i] = 101;
		Scanner input = new Scanner(System.in);
		String word = input.next();
		
		for (int i = 0; i < Alphabets.length; i++) {
			for (int j = 0; j < word.length(); j++) {
				if (Alphabets[i].equals(Character.toString(word.charAt(j)))) {
					NumberOfAlphabets[i] = j;
					break;
				}
				else
					NumberOfAlphabets[i] = -1;
			}
		}
		
		for (int i = 0; i < NumberOfAlphabets.length; i++) {
			System.out.print(NumberOfAlphabets[i] + " ");
		}
		
		input.close();
	}
}
