package disciplina;
import java.util.Scanner;

public class Substring_finding {
	public static void main (String arg[]) {
		try (Scanner input = new Scanner(System.in)) {
			String mstr = input.nextLine();
			String sstr = input.nextLine();
			if (mstr.indexOf(sstr) != -1) {
				System.out.println("The first index of \"" + sstr + "\" in \"" + mstr + "\" is " + mstr.indexOf(sstr));
				System.out.println("The last index of \"" + sstr + "\" in \"" + mstr + "\" is " + mstr.lastIndexOf(sstr));
			}
			else System.out.println("Substring \"" + sstr + "\" does not exist in \"" + mstr + "\"!");
		}
	}
}
