package program.string;

public class CheckIfAStringContainsOnlyDigits {

	// 5. Check if a string contains only digits.

		public static boolean isStringContainsDigitOnly(String str) {
			boolean result = true;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (!(ch >= '0' && ch <= '9')) {
					result = false;
					break;
				}
			}

			return result;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
