package disciplina;
import java.util.Scanner;

public class Infinite_input {
	public static void main (String arg[]) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Start inputting: ");
			String content = new String();
			for (;;) {
				content = scan.next();
				System.out.println(content);
			}
		}
	}
}