package fontes_pensi;
import java.util.Scanner;

public class Tax {
	public static void main (String arg[]) {
		Scanner scan = new Scanner (System.in);
		double sal = scan.nextDouble();
		double tax;
		if (sal <= 3000) tax = sal * 0.03; //90
		else {
			if (sal <= 12000) tax = 90 + (sal - 3000) * 0.1; //990
			else {
				if (sal <= 25000) tax = 990 + (sal - 12000) * 0.2; //3590
				else {
					if (sal <= 35000) tax = 3590 + (sal - 25000) * 0.25; //6090
					else {
						if (sal <= 55000) tax = 6090 + (sal - 35000) * 0.3; //12090
						else {
							if (sal <= 80000) tax = 12090 + (sal - 55000) * 0.35; //20840
							else tax = 20840 + (sal - 80000) * 0.45;
						}
					}
				}
			}
		}
		System.out.println(tax);
	}
}
