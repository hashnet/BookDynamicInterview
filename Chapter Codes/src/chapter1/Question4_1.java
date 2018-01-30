package chapter1;

public class Qustion4_1 {
	private static final int size = 5;
	
	public static void main(String[] args) {
		int numWays = countWays(0, 0, size-1, size-1);
		
		System.out.println(numWays);
	}
	
	private static int countWays(int srcRow, int srcCol, int dstRow, int dstCol) {
		if((srcRow == dstRow) && (srcCol == dstCol)) return 0;
		
		if((srcRow == dstRow) && (srcCol == (dstCol-1))) return 1;
		if((srcCol == dstCol) && (srcRow == (dstRow-1))) return 1;
		
		int numWays = 0;
		if(srcRow < dstRow) {
			numWays += countWays(srcRow+1, srcCol, dstRow, dstCol);
		}
		if(srcCol < dstCol) {
			numWays += countWays(srcRow, srcCol+1, dstRow, dstCol);
		}

		return numWays;
	}
}
