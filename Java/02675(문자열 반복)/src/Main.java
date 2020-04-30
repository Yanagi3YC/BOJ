import java.util.Scanner;

public class Main {
	public static void main(String argsp[]) {
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
		String[] cmds = new String[num];

		for (int i = 0; i < num; i++) {
			cmds[i] = input.nextLine();
		}
		for (int i = 0; i < num; i++) {
			String[] cmd = cmds[i].split(" ");
			for (int j = 0; j < cmd[1].length(); j++)
				for (int k = 0; k < Integer.valueOf(cmd[0]); k++)
					System.out.print(cmd[1].charAt(j));
			System.out.println();
		}

		input.close();
	}
}
