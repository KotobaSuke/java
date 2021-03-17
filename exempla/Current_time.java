package disciplina;

public class Current_time {
	public static void main (String arg[]) {
		long secO = System.currentTimeMillis() / 1000;
		long secN = secO % 60;
		long minN = (secO / 60) % 60;
		long horN = (secO / 3600 + 8) % 24;
		System.out.println("It's " + horN + ":" + minN + ":" + secN + " (Beijing)");
	}
}
