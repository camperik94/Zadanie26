import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String tekst = in.nextLine();
		
		Klaa klasa = new Klaa(tekst);
		
		klasa.funkcja();
	}
}
