package program.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class StringManipulation {
	

	



	

	

	

	// 7. Find the ASCII value of each character.

	public static void printASCIIValueOfEachCharater(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println((int) str.charAt(i));
		}
	}

	// 8. Check if a string is empty or null

	public static boolean isEmptyNullString(String str) {
		boolean result = false;
		if (str.length() == 0 || str == null) {
			result = true;
		}
		return result;
	}

	// 9. Iterate through a string using a for loop.

	public static void iterateThroughString(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	// 10. Convert a string to a character array (toCharArray()).

	public static char[] convertStringToCharArray(String str) {
		return str.toCharArray();

	}

	// 11. Convert a character array back to a string.

	public static String convertCharArrayToString(char charArray[]) {
		return charArray.toString();
	}

	// 12. Concatenate two strings using the + operator

	public static String getConcatTwoStringUsingPlusOperator(String str1, String str2) {
		return str1 + str2;
	}

	// 13. Concatenate two strings using the concat() method.

	public static String getConcatTwoStringUsingConcatMethod(String str1, String str2) {
		return str1.concat(str2);
	}

	// 14. Compare two strings for equality (equals()).
	public static boolean compareTwoStringsUsingEqualMethod(String str1, String str2) {
		return str1.equals(str2);
	}

	// 15. Compare two strings ignoring case (equalsIgnoreCase()).
	public static boolean compareTwoStringIgnoringCase(String str1, String str2) {
		return str1.equalsIgnoreCase(str2);
	}

	// 16. Compare two strings lexicographically (compareTo()).

	public static int compareTwoStringsLexicographically(String str1, String str2) {
		return str1.compareTo(str2);
	}

	// 17. Check if a string starts with a specific prefix
	public static boolean isStringStarWith(String str, String prefix) {
		return str.startsWith(prefix);
	}

	// 18. Check if a string ends with a specific suffix (endsWith()).
	public static boolean isStringEndWith(String str, String suffix) {
		return str.endsWith(suffix);
	}

	// 19. Convert a string to uppercase (toUpperCase()).

	public static String upperCaseString(String str) {
		return str.toUpperCase();
	}

	// 20. Convert a string to lowercase (toLowerCase()).
	public static String lowerCaseString(String str) {
		return str.toLowerCase();
	}

	// 21. Extract a substring from a given index.
	public static String getSubStringfromIndex(String str, int index) {
		return str.substring(index);
	}

	// 22. Extract a substring between two given indices.
	public static String getSubStringFromStartEndIndex(String str, int startIndex, int endIndex) {
		return str.substring(startIndex, endIndex);
	}

	// 23. Trim leading and trailing whitespace (trim()).
	public static String trimLeadingNTrailingWhitespace(String str) {
		return str.trim();
	}

	// 24. Check if a string contains a specified sequence of characters
	// (contains()).
	public static boolean IsStringContainsSpecificCharcterSequence(String str, String specificSeqChars) {
		return str.contains(specificSeqChars);
	}

	// 25. Find the first occurrence of a character/substring (indexOf()).
	public static int getFirstOccurenceOfCharSubString(String str, String searchStr) {
		return str.indexOf(searchStr);
	}

	// 26. Find the last occurrence of a character/substring (lastIndexOf()).
	public static int getLastOccurenceOfCharSubString(String str, String searchStr) {
		return str.lastIndexOf(searchStr);
	}

	// 27. Replace a character with another character.
	public static String replaceCharacter(String str, char oldChar, char newChar) {
		return str.replace(oldChar, newChar);
	}

	// 28. Replace all occurrences of a substring (replace()).
	public static String replaceAllOccurenceOfSubstring(String str, String oldSubString, String newSubString) {
		return str.replace(oldSubString, newSubString);
	}

	// 29. Remove a specific character from a string.
	public static String removeSpecificCharFromString(String str, char charToRemove) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != charToRemove) {
				newStr += str.charAt(i);
			}
		}

		return newStr;
	}

	// 30. Remove all spaces from a string.
	public static String removeAllSpaceFromString(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}

	// 31. Reverse a string using the reverse() method of StringBuilder.
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);

		return sb.reverse().toString();
	}

	// 32. Reverse a string without using any built-in reverse() method.
	public static String reverseStringWithoutBuiltInMethod(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	// 33. Reverse the order of words in a string (e.g., "Hello World" -> "World
	// Hello").
	public static String reverseWordsOrderInString(String str) {
		String revWordStr = "";
		String words[] = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			revWordStr += words[i] + " ";
		}

		return revWordStr.trim();

	}

	// 34. Reverse each word in a string (e.g., "Hello World" -> "olleH dlroW").
	public static String reverseEachWordInString(String str) {
		String newStr = "";
		String words[] = str.split(" ");
		for (String word : words) {
			newStr += StringManipulation.reverseString(word) + " ";
		}

		return newStr.trim();
	}

	// 35. Check if one string is a rotation of another (e.g., "XYZ" is a rotation
	// of "YZA").
	public static boolean IsRotationOfString(String str, String rotateString) {
		if (str.length() != rotateString.length()) {
			return false;
		}
		String newStr = str + str;
		return newStr.contains(rotateString);
	}

	// 36. Swap two strings without using a third variable.
	public static void swapString(String str1, String str2) {
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("str1: " + str1 + " str2: " + str2 + " after swap");
	}

	// 37. Check if a string is a Palindrome (e.g., "madam").
	public static boolean isPalindrome(String str) {

		return StringManipulation.reverseStringWithoutBuiltInMethod(str) == str;
	}

	// 38. Check if two strings are Anagrams (e.g., "Keep" and "Peek").
	public static boolean isAnagrams(String str1, String str2) {
		char str1Chars[] = str1.toCharArray();
		char str2Chars[] = str2.toCharArray();
		Arrays.sort(str1Chars);
		Arrays.sort(str2Chars);

		return Arrays.equals(str1Chars, str2Chars);

	}

	// 39. Check if a string is a Pangram (contains every letter of the alphabet).
	public static boolean isPangram(String str) {
		boolean[] isPresent = new boolean[26];
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				int index = ch - 'a';
				isPresent[index] = true;
			}
		}

		for (boolean present : isPresent) {
			if (!present) {
				return false;
			}
		}

		return true;
	}
	// 40. Check for a "Palindromic Permutation" (can be rearranged to form a
	// palindrome).

	// 41. Count duplicate characters in a string.
	public static Map<Character, Integer> characterFrequency(String str) {
		Map<Character, Integer> data = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (data.containsKey(ch)) {
				data.put(ch, data.get(ch) + 1);
			} else {
				data.put(ch, 1);
			}
		}

		return data;
	}

	public static int countDuplicateCharacter(String str) {
		Map<Character, Integer> data = StringManipulation.characterFrequency(str);
		int count = 0;
		for (Map.Entry<Character, Integer> entry : data.entrySet()) {
			if (entry.getValue() > 1) {
				count++;
			}
		}
		return count;
	}

	// 42. Count duplicate words in a string.
	public static Map<String, Integer> wordsFrequency(String str) {
		Map<String, Integer> data = new HashMap<>();
		for (String word : str.split(" ")) {
			if (data.containsKey(word)) {
				data.put(word, data.get(word) + 1);
			} else {
				data.put(word, 1);
			}
		}
		return data;
	}

	public static int countDuplicateWords(String str) {
		Map<String, Integer> data = StringManipulation.wordsFrequency(str);
		int count = 0;
		for (Map.Entry<String, Integer> entry : data.entrySet()) {
			if (entry.getValue() > 1) {
				count++;
			}

		}
		return count;
	}

	// 43. Find the highest frequency character in a string.
	public static char highestFrequencyCharacter(String str) {
		int maxFreq = 0;
		char maxChar = ' ';
		Map<Character, Integer> data = StringManipulation.characterFrequency(str);
		for (Map.Entry<Character, Integer> entry : data.entrySet()) {
			if (maxFreq < entry.getValue()) {
				maxFreq = entry.getValue();
				maxChar = entry.getKey();
			}

		}
		return maxChar;
	}

	// 44. Find the lowest frequency character in a string.
	public static char lowestFrequencyCharacter(String str) {
		int lowFreq = 0;
		char lowChar = ' ';
		Map<Character, Integer> data = StringManipulation.characterFrequency(str);
		for (Map.Entry<Character, Integer> entry : data.entrySet()) {
			if (lowFreq > entry.getValue()) {
				lowFreq = entry.getValue();
				lowChar = entry.getKey();
			}

		}
		return lowChar;
	}

	// 45. Find the first non-repeating character.
	public static LinkedHashMap<Character, Integer> characterFrequencyOrderPerserve(String str) {
		LinkedHashMap<Character, Integer> data = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			if (data.containsKey(ch)) {
				data.put(ch, data.get(ch) + 1);
			} else {
				data.put(ch, 1);
			}
		}
		return data;
	}

	public static char firstNonRepeatingCharacter(String str) {
		char firstNonRepeatingChar = ' ';
		LinkedHashMap<Character, Integer> data = StringManipulation.characterFrequencyOrderPerserve(str);
		for (Map.Entry<Character, Integer> entry : data.entrySet()) {
			if (entry.getValue() == 1) {
				firstNonRepeatingChar = entry.getKey();
				break;
			}
		}

		return firstNonRepeatingChar;
	}

	// 46. Find the first repeating character.
	public static char firstRepeatingCharacter(String str) {
		char firstRepeatingChar = ' ';
		LinkedHashMap<Character, Integer> data = StringManipulation.characterFrequencyOrderPerserve(str);
		for (Map.Entry<Character, Integer> entry : data.entrySet()) {
			if (entry.getValue() > 1) {
				firstRepeatingChar = entry.getKey();
				break;
			}
		}

		return firstRepeatingChar;
	}
	//	47.	Count the number of special characters, numbers, and alphabets.
	public static void countSpecialCharacterNumbersAlphabets(String str) {
		int splChar=0,num=0,letters=0;
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				letters++;
			}else if(Character.isDigit(ch)){
				num++;
			}else {
				splChar++;
			}
		}
		
		System.out.println("Number of special characters: "+splChar);
		System.out.println("Number of numbers: "+num);
		System.out.println("Number of alphabets: "+letters);
		
	}
	//	48.	Split a string by a delimiter (e.g., comma, space).
	public static String[] splitStringdelimiter(String str,String delimeter) {
		return str.split(delimeter);
	}
	//	49.	Join an array of strings into a single string.
	public static String joinArrayStrings(String strs[]) {
		return String.join(" ", strs);
	}
	
	//	50.	Sort a string alphabetically (by sorting its characters).
	public static String sortAlphabetically(String str) {
		char chars[]=str.toCharArray();
		char temp=' ';
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(chars[i]>chars[j]) {
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
				}
			}
		}
		return new String(chars);
	}
	//	51.	Convert a string of numbers (e.g., "123") to an integer/long without parseInt().
	public static int convertStringNumberToInteger(String strNum) {
		int num = 0;
        for (int i = 0; i < strNum.length(); i++) {
            num = num * 10 + (strNum.charAt(i) - '0');
        }
        
        return num;
	}
	//	52.	Convert an integer to a string without using valueOf().
	public static String integerToStringBasic(int num) {
		return ""+num;
	}
	
	public static String integerToString(int num) {
		StringBuilder sb = new StringBuilder();
		int digit=0;
		while(num>0) {
			digit=num%10;
			sb.append((char)(digit+'0'));
			num=num/10;
		}
		sb.reverse();
		return sb.toString();
	}
	//	53.	Remove duplicate characters from a string.
	public static String removeDuplicateCharacter(String str) {
		char chars[]=str.toCharArray();
		LinkedHashSet<Character> data= new LinkedHashSet<>();
		for(char ch:chars) {
			data.add(ch);
		}
		String newStr="";
		for(char ch:data) {
			newStr+=ch;
		}
		
		return newStr;
		
	}
	//	54.	Remove duplicate words from a string.
	public static String removeDuplicateWords(String str) {
		LinkedHashSet<String> data= new LinkedHashSet<>();
		for(String word:str.split(" ")) {
			data.add(word);
		}
		
		return String.join(" ", data);
	}
	//	55.	Remove all non-alphabetic characters.
	public static String removeAllNonAplhabeticChars(String str) {
		StringBuilder sb = new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static String removeAllNonAplhabeticCharsUsingRegex(String str) {
		return str.replaceAll("[^A-Za-z]","");
	}
	//	56.	Capitalize the first letter of each word (Title Case).
	public static String convertStringToTitleCase(String str) {
		String newStr="";
		for(String word:str.split(" ")) {
			newStr+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		
		return newStr.trim();
	}
	//	57.	Toggle the case of every character (e.g., "HeLlO" -> "hElLo").
	public static String toggleEveryCharacterCase(String str) {
		StringBuilder sb= new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}else if(Character.isLowerCase(ch)){
				sb.append(Character.toUpperCase(ch));
			}
		}
		
		return sb.toString();
	}
	//	58.	Insert a string into another string at a specified index.
	public static String insertNewStringAtSpecifiedIndex(String str1,String str2,int index) {
		return str1.substring(0,index)+str2+str1.substring(index);
	}
	//	59.	Replace the nth occurrence of a character/substring.
	//	60.	Encode a string using a basic Caesar Cipher.
	
	//	61.	Validate an email address using Regex.
	//	62.	Validate a phone number format using Regex.
	//	63.	Extract all numbers from an alphanumeric string using Regex.
	//	64.	Remove HTML tags from a string using Regex.
	//	65.	Split a string using multiple delimiters with Regex.
	
	//	66.	Find the Longest Palindromic Substring.
	//	67.	Find the Longest Substring Without Repeating Characters.
	//	68.	Find all substrings of a given string.
	public static ArrayList<String> findAllSubstring(String str) {
		ArrayList<String> allSubString= new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++)
			allSubString.add(str.substring(i,j));
		}
		
		return allSubString;
	}
	//	69.	Find all subsequences of a given string.
	//	70.	Count the number of palindromic substrings.
	//	71.	Count the occurrence of a substring within another string.
	//	72.	Find the shortest common supersequence of two strings.
	//	73.	Print all permutations of a string (e.g., "ABC" -> "ABC", "ACB", "BAC", etc.).
	//	74.	Generate all combinations of characters in a string.
	//	75.	Print all permutations of a string without duplicates.
	//	78.	Convert a Roman numeral string to an integer.
	//	79.	Convert an integer to a Roman numeral string.
	//	80.	Implement the atoi function (String to Integer conversion).
	//	81.	Write a program to multiply two large strings representing numbers.
	//	82.	Implement string compression (e.g., "aaabbc" -> "a3b2c1").
	//	83.	Check if a string can be formed by interleaving two other strings.
	//	84.	Reverse only the letters in a string, keeping special characters and numbers in place (e.g., "a!b@c" -> "c!b@a").


	public static void main(String[] args) {
		String words[]= {"Hi","Welcome","Shabir"};
		
		System.out.println(StringManipulation.findAllSubstring("shabbir"));
	}
}
