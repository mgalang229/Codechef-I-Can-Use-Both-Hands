import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int l = fs.nextInt(), r = fs.nextInt(), m = fs.nextInt();
			int left = m / l + (m % l > 0 ? 1 : 0);
			int right = m / r;
			System.out.println(left + right);
		}
		fs.close();
	}
}
