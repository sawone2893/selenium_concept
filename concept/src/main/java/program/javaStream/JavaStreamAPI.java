package program.javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPI {
	// Filter Even Numbers
	public static List<Integer> getEvenNumber(List<Integer> nums) {
		return nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	}

	// Filter Odd Numbers
	public static List<Integer> getOddNumber(List<Integer> nums) {
		return nums.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
	}

	// Filter Strings by Length > 5
	public static List<String> getStringOfLenthGreaterThan5(List<String> nums) {
		return nums.stream().filter(s -> s.length()>5).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 45, 8, 9, 7);
		List<String> strs = Arrays.asList("Shabbir","Raj","Rayeen","Ramesh","Shaktiman");
		System.out.println(JavaStreamAPI.getStringOfLenthGreaterThan5(strs));
	}

}
