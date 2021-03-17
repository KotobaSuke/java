package disciplina;

import java.util.Scanner;

public class String_concatenation {
	public static void main (String arg[]) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter two strings without spaces:");
			String cont1 = scan.next();
			String cont2 = scan.next();
			System.out.println(cont1.concat(cont2));
			System.out.println(cont1.length());
		}
	}
}
