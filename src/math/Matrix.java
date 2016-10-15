package math;

public class Matrix{
	private MatrixGenerator matrix = new MatrixGenerator();
    public static void main(String[] args) {
        int[][] ans = 2DM(matrix.random2DMatrix(0,3,2),matrix.random2DMatrix(0,2,3));
    }
    public static int[][] 2DM(int[][] i1,int[][] i2){
        int[][] i3 = new int[i1.length][i2[1].length];
        for(int i = 0;i < i1.length;i ++){
            for(int j = 0;j < i2[i].length;j ++){
                i3[i][j] = i1[i][j] * i2[i][j] + i1[i][j + 1] + i2[i + 1][j];
            }
        }
        return i3;
    }
}