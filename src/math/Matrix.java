package math;

public class Matrix {

	public static void main(String[] args) {
		int[][] m1 = new int[2][3];
		int[][] m2 = new int[3][2];
		//m1 initiallize
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[1].length; j++) {
				m1[i][j] = i * j;
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		//m2 initiallize
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[1].length; j++) {
				m2[i][j] = i * j;
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		//check if allow
		if (M_x_M(m1, m2) != null) {
			//get matrix ans
			int[][] Matrix = M_x_M(m1, m2);
			//print matrix
			for (int i = 0; i < Matrix.length; i++) {
				for (int j = 0; j < Matrix.length; j++) {
					System.out.print(Matrix[i][j] + " ");
				}
				System.out.println("");
			}
		} else {
			System.out.println("invalid");
		}

	}

	public static int[][] M_x_M(int[][] i1, int[][] i2) {
		// i1 width == i2 lendth
		if (i1[1].length == i2.length) {
			int[][] ans = new int[i1[1].length][i2.length];
			for (int i = 0; i < i1[1].length; i++) {
				for (int j = 0; j < i2.length; j++) {
					ans[j][i] = i1[i][j] * i2[j][i];
					System.out.println(ans[j][i]);
				}
			}
			return ans;
		}
		return null;
	}
}
