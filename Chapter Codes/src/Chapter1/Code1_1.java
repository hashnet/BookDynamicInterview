package Chapter1;

public class Code1_1 {
	private static int sum(int n) {
		if(n == 0 || n == 1) return n;
		
		return n + sum(n-1);
	}
	
	//
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
}
