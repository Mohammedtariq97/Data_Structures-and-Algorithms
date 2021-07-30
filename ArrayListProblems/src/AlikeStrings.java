
public class AlikeStrings {

	public static void main(String[] args) {

		System.out.println(halvesAreAlike("book"));
	}

	public static boolean halvesAreAlike(String s) {
		int len = s.length();
		String s1 = s.substring(0, len / 2);
		String s2 = s.substring(len / 2, len);
		int val1 = 0;
		int val2 = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (isVowel(s1.charAt(i)) == true) {
				val1++;
			}
			if (isVowel(s2.charAt(i)) == true) {
				val2++;
			}
		}

		return val1 == val2;
	}

	public static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			return true;
		} else {
			return false;
		}
	}
}
