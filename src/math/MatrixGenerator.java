package math;

import java.util.Random;

public class MatrixGenerator{
    public static int[][] random2DMatrix(int seed,int width,int length){
		Random r = new Random(seed);
        int[][] i1 = new int[length][width];
        for(int i = 0;i < length;i ++){
            for(int j = 0;j < width;j ++){
                i1[i][j] = r.nextInt();
            }
        }
		return i1;
    }
}