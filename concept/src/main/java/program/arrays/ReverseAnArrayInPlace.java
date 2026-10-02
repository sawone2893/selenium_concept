package program.arrays;

public class ReverseAnArrayInPlace {

	public static int[] reverseArrayWithTwoPointerApproach(int arr[]) {
		int len = arr.length;
		int left = 0;
		int right = len - 1;
		if(len>1) {
			while (left < right) {
				arr[left] = arr[left] + arr[right];
				arr[right] = arr[left] - arr[right];
				arr[left] = arr[left] - arr[right];
				left++;
				right--;
			}
		}else if(len==1){
			System.out.println("WARNING: ARRAY WIth LENGTH=1 can not be reversed!");
		}else {
			System.out.println("WARNING: EMPTY ARRAY!");
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int num[]={1,2,3,4,5};
		System.out.print("Reverse Array: ");
		for(int n:ReverseAnArrayInPlace.reverseArrayWithTwoPointerApproach(num)) {
			System.out.print(n+" ");
		}

	}

}
