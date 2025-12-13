package program.string;

public class FindTheFrequencyOfASpecificCharacter {

	// 6. Find the frequency of a specific character.
	public static int getSpecifcCharacterfrequency(String str, char ch) {
		int freq = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				freq++;
			}
		}

		return freq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
