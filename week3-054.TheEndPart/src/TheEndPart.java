
import java.util.Scanner;

public class TheEndPart {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Type a word: ");
		String words = reader.nextLine();

		System.out.println("Length of the first part: ");
		int firstLength = Integer.parseInt(reader.nextLine());

		System.out.println("Result: " + words.substring(words.length() - firstLength));
	}
}
