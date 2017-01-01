package mathGraph;

import java.awt.Color;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class G2 {
	public static void main(String[] args) {
		int N = 50;
		double[] a = new double[N];
		for (int i = 0; i < N; i++) {
			a[i] = StdRandom.random();
		}
		for (int i = 0; i < N; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double x = 1.0 * i / N;
			double y = a[i] / 2.0;
			double rw = 0.5 / N;
			double rh = a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < N; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double x = 1.0 * i / N;
			double y = a[i] / 2.0;
			double rw = 0.5 / N;
			double rh = a[i] / 2.0;
			StdDraw.setPenColor(Color.WHITE);
			StdDraw.filledRectangle(x, y, rw, rh);
		}
		Arrays.sort(a);
		StdDraw.setPenColor(Color.BLACK);
		for (int i = 0; i < N; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double x = 1.0 * i / N;
			double y = a[i] / 2.0;
			double rw = 0.5 / N;
			double rh = a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}
}
