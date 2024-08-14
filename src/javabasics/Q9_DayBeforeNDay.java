package javabasics;

public class Q9_DayBeforeNDay {
	public static void utility(int d, int n) {
		int x = n % 7;
		int ans = d - x;
		// if (ans == 0) {
		// ans = 6;
		// }
		if (ans >= 0) {
			System.out.print(ans);
		}
		if (ans < 0) {
			System.out.print(7 + ans);
		}
	}
	public static void main(String[] args) {
		utility(2, 19);
	}
}
