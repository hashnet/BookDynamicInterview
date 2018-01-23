package Chapter1;

public class Code1_4 {
	private static int fact(int n) {
		if(n==1) return 1;
		
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
}
