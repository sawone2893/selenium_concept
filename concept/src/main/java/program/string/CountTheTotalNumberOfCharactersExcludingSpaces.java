package program.string;

public class CountTheTotalNumberOfCharactersExcludingSpaces {
	// 2. Count the total number of characters (excluding spaces).
	public static int getCharacterCountWithSpace(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
