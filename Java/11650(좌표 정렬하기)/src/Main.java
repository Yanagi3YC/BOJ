import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String[] xy = br.readLine().split(" ");
			list.add(new ArrayList<Integer>());
			list.get(i).add(Integer.parseInt(xy[0]));
			list.get(i).add(Integer.parseInt(xy[1]));
		}
	}
	static void BubbleSort(ArrayList<Integer> list) {
		for(int i=1;i<list.size();i++) {
			
		}
	}
}
