package fontes_pensi;

public class MonteCarloProbs {
	public static void main (String arg[]) {
		double freq = 0;
		double x, y;
		for (int t = 1000000; t > 0; t--) {
			x = 2 * Math.random() - 1; 
			y = 2 * Math.random() - 1;
			if (x < 0) freq++;
			else if (x > 0 && y > 0 && y < 1 - x) freq++;
		}
		System.out.println("Probability is " + freq / 1000000);
	}
}
