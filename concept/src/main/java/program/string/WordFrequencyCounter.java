package program.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequencyCounter {

	/**
	 * Given a sentence, count occurrences of each word (case-insensitive), printed
	 * sorted by frequency descending. EXAMPLE the: 3 fox: 2 quick: 1 CONSTRAINTS &
	 * NOTES: Strip punctuation before counting. Use a HashMap for counting and a
	 * sorted structure for output.
	 */

	public static Map<String, Integer> countWordFrequency(String sentence) {
		String words[] = sentence.toLowerCase().split(" ");
		//Need to add logic to clean the string as per constraints.
		Map<String, Integer> wordFreq = new HashMap<>();
		for (String word : words) {
			wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
		}
		return wordFreq;
	}

	public static void printedSortedByFrequencyDescending(Map<String, Integer> wordFreq) {
		Map<String, Integer> sortedFreqDesc = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
			// Incomplete code: need to add the logic
		}
	}

	public static void main(String[] args) {
		String sentence = "india is is a great Great GReAt country";
		System.out.println(WordFrequencyCounter.countWordFrequency(sentence));

	}

}
