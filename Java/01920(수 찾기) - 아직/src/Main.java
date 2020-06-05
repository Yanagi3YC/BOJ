import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		String line = br.readLine();
		String[] temp = line.split(" ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(arr);
		num = Integer.parseInt(br.readLine());
		line = br.readLine();
		temp = line.split(" ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		for (int i = 0; i < num; i++) {
			int number = arr[i];
			int left = 0;
			int right = arr.length - 1;
			int mid = arr.length / 2;
			while (true) {
				if (left + 1 == right) {
					if (arr[left + 1] == number) {
						bw.write(1 + "\n");
						break;
					} else {
						bw.write(0 + "\n");
						break;
					}
				} else {
					if (number == arr[mid]) {
						bw.write(1 + "\n");
						break;
					} else if (number > arr[mid]) {
						left = mid;
						mid = (left + right) / 2;
					} else {
						right = mid;
						mid = (left + right) / 2;
					}
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
