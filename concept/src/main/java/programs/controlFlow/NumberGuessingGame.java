package programs.controlFlow;

import java.util.Scanner;

public class NumberGuessingGame {

	public static int generateNum(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min) + 1);
	}

	public static void startGuesstingGame() {
		int attempt = 1;
		int maxAttempt = 7;
		int randNum = generateNum(1, 100);
		Scanner sc = new Scanner(System.in);
		while (attempt <= maxAttempt) {
			System.out.println("Guesss the number between 1 and 100!");
			int guessNum = sc.nextInt();
			int delta = randNum - guessNum;
			if (delta < 0) {
				System.out.println("Guess: " + guessNum + " → Too high");
			} else if (delta > 0) {
				System.out.println("Guess: " + guessNum + " → Too low");
			} else {
				System.out.println("Guess: " + guessNum + " → Correct! You won in " + attempt + " tries.");
				break;
			}
			attempt++;
		}
		System.out.print("Game ended. You reached maximium attempts!\nBetter Luck Next Time");
	}

	public static void main(String[] args) {
		NumberGuessingGame.startGuesstingGame();
	}

}
