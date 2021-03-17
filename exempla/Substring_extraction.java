package disciplina;
import java.util.Scanner;

public class Substring_extraction {
	public static void main (String arg[]) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a line:");
			String mstr = input.nextLine();
			System.out.println("Enter a beginning index and a ending index:")
			int fromI = input.nextInt() - 1;
			int toI = input.nextInt();
			System.out.println("The substring of \""+ mstr + "\" from index " + fromI + " to " + toI + " is \"" + mstr.substring(fromI, toI) + "\" ");
		}
	}
}
