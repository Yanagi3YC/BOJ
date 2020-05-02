import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		boolean value = random.nextBoolean();
		String result = "";
		if (value == true) {
			result = "Yonsei";
		} else {
			result = "Korea";
		}
		System.out.print(result);
	}
}
