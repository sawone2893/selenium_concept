package program.string;

public class AnagramChecker {

	/*
	 * Write isAnagram(String a, String b) returning true if they're anagrams
	 * (ignoring case and spaces).
	 * 
	 * EXAMPLE isAnagram("listen", "silent") → true isAnagram("hello", "world") →
	 * false CONSTRAINTS & NOTES Use character-frequency counting (int[26]) rather
	 * than sorting, for O(n) time.
	 */

	public static boolean isAnagramUsingTraditionalApproach(String str1, String str2) {
		str1 = str1.replaceAll(" ", "").toLowerCase();
		str2 = str2.replaceAll(" ", "").toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str2.length(); i++) {
			if (!str1.contains(str2.charAt(i) + "")) {
				return false;
			}

		}
		;

		return true;
	}
	
	public static boolean isAnagramUsingCharFreqCountingApproach(String str1, String str2) {
		str1 = str1.replaceAll(" ", "").toLowerCase();
		str2 = str2.replaceAll(" ", "").toLowerCase();
		if (str1.length() != str2.length()) {
			return false;
		}
		
		int freq[]=new int[26];
		
		for(char ch:str1.toCharArray()) {
			freq[ch-'a']++;
		}
		
		for(char ch:str2.toCharArray()) {
			freq[ch-'a']--;
		}
		
		for(int count:freq) {
			if(count!=0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(AnagramChecker.isAnagramUsingTraditionalApproach("lis ten", "     silent"));
		System.out.println(AnagramChecker.isAnagramUsingCharFreqCountingApproach("hello", "olleh"));

	}

}
