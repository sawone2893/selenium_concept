package program.string;

public class CountTheTotalNumberOfVowelsAndConsonants {

	// 4. Count the total number of vowels and consonants.
		public static void getVowelNConsonantsCount(String str) {

			str = str.toLowerCase();
			int vowel = 0, consonant = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch >= 'a' && ch <= 'z') {
					if (ch == 'a' || ch == 'e' || ch == 'i' | ch == 'o' || ch == 'u') {
						vowel++;
					} else {
						consonant++;
					}
				}
			}

			System.out.println("Vowels Count: " + vowel);
			System.out.println("Consonants Count: " + consonant);

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
