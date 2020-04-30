class sn {
	public int d(int n) {
		if (n < 10) {
			return 2 * n;
		} else if (n < 100) {
			return n + n / 10 + n % 10;
		} else if (n < 1000) {
			return n + n / 100 + (n % 100) / 10 + (n % 100) % 10;
		} else {
			return n + n / 1000 + (n % 1000) / 100 + ((n % 1000) % 100) / 10 + ((n % 1000) % 100) % 10;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		sn sn = new sn();
		boolean[] numbers = new boolean[10001];
		numbers[0] = true;
		for (int i = 1; i < 10001; i++) {
			int temp = i;
			while (temp <= 10001) {
				temp = sn.d(temp);
				if (temp <= 10000) {
					numbers[temp] = true;
				}
			}
		}
		for (int i = 1; i < 10001; i++) {
			if (numbers[i] == false) {
				System.out.println(i);
			}
		}
	}
}
