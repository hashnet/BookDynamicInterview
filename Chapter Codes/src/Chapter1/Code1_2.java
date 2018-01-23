package Chapter1;

public class Code1_2 {
	private static int sum(int n) {
		return n == 0 ? 0 : n == 1 ? 1 : n + sum(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
}
