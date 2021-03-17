package disciplina;
import java.util.Scanner;

public class Name_split {
	public static void main (String arg[]) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a full name:");
			String fullName = scan.nextLine();
			String firstName = fullName.substring(0, fullName.indexOf(' '));
			String lastName = fullName.substring(fullName.indexOf(' ') + 1);
			System.out.println("The first name is " + firstName);
			System.out.println("The last name is " + lastName);
		}
	}
}