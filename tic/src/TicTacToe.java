import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author MeneXia (Xavi Ablaza)
 *
 */
public class TicTacToe {
	static Scanner input;
	static String[] board;
	static String turn;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;
		TableauaRemplir();

		System.out.println("Bienvenue");
		System.out.println("--------------------------------");
		GenereTableau();
		System.out.println("X joue en premier. entrer X dans:");
		//lancement du jeux 
		while (winner == null) {
			int numInput;
			try {
				numInput = input.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("invalide veillez entrer la valeur");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("invalide veillez entrer la valeur");
				continue;
			}
			if (board[numInput-1].equals(String.valueOf(numInput))) {
				board[numInput-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				GenereTableau();
				winner = TestGagnant();
			} else {
				System.out.println("valeur deja prise , choisisz une autre");
				continue;
				
			}
		}
		//fin
		if (winner.equalsIgnoreCase("dessiner")) {
			System.out.println("Thanks for playing.");
		} else {
			System.out.println("Felicitation! " + winner + " a gagner! Merci d'avoir joue.");
		}
	}

	static String TestGagnant() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println(turn + "de jouer; entrer le numero du slot " + turn + " in:");
		return null;
	}

	static void GenereTableau() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}

	static void TableauaRemplir() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}
}
