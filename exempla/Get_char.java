package disciplina;
import java.util.Scanner;

public class Get_char {
	public static void main (String arg[]) {
		try (Scanner scan = new Scanner(System.in)) {
			String content = scan.next();
			int ind = scan.nextInt();
			System.out.println(content.charAt(ind));
		}
	}
}
