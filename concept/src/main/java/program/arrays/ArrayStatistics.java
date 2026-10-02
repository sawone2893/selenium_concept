package program.arrays;

public class ArrayStatistics {

	public static void printArrayStatistics(int arr[]) {

		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		double avg = 0.0;
		int noOfElements = arr.length;
		if (noOfElements > 0) {
			for (int num : arr) {
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
				sum += num;
			}
			avg = sum / noOfElements;
			System.out.printf("Min: %d, Max: %d, Sum: %d, Average: %.2f", min, max, sum, avg);
		} else {
			System.out.println("WARNING: EMPTY ARRAY - Array Statistics can not be calculated!");
		}

	}
	
	public static void main(String args[]) {
		int num[]={4, 8, 15, 16, 23, 42};
		ArrayStatistics.printArrayStatistics(num);
	}

}
