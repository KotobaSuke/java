package fontes_pensi;
import java.util.Scanner;

public class DistanceCompute {
	public static void main (String arg[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println((a * a + b * b >= 25) ? "out" : "in");
	}
}
