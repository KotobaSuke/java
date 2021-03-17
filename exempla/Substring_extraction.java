package disciplina;
import java.util.Scanner;

public class Substring_extraction {
	public static void main (String arg[]) {
		try (Scanner input = new Scanner(System.in)) {
			String mstr = input.nextLine();
			int fromI = input.nextInt();
			int toI = input.nextInt();
			System.out.println("The substring of \""+ mstr + "\" from index " + fromI + " to " + toI + " is \"" + mstr.substring(fromI, toI) + "\" ");
		}
	}
}
