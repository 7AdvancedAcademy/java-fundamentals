package homework;
import java.util.Scanner;

public class lesson5assignment {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		//program should stop when -1 is entered.
		System.out.println("Type in an alphabet : ");
		char ch=s1.next().charAt(0);
		
		switch (ch) {
		case 'a':
			System.out.println(ch+ " = Vowel");
			break;
		case 'e':
			System.out.println(ch+ " = Vowel");
			break;
		case 'i':
			System.out.println(ch+ " = Vowel");
			break;
		case 'o':
			System.out.println(ch+ " = Vowel");
			break;
		case 'u':
			System.out.println(ch+ " = Vowel");
			break;
		default:
			System.out.println(ch+ " = Consonant");
			break;
		}
	}

}
