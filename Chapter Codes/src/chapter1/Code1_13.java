package chapter1;

public class Code1_13 {
	public static void main(String[] args) {
		mTable (10, 1);
	}
	
	private static void mTable(int n, int i) {
		if(i>10) return;
		
		System.out.println(n + " x " + i + " = " + (n*i));
		mTable(n, i+1);
	}
}
