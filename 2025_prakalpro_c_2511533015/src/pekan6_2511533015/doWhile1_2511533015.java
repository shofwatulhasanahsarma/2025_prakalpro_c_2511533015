package pekan6_2511533015;
import java.util.Scanner;
public class doWhile1_2511533015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String phrase;
		do {
			System.out.print("Input Password: ");
			phrase = console.next();
			} while (!phrase.equals("abcd"));

	}

}
