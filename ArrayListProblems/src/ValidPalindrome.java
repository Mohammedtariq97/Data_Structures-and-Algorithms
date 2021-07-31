
public class ValidPalindrome {
	public boolean validPalindrome(String s) {
		char[] ch = s.toCharArray();
		int j = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++) {
			if (ch[i] != ch[j] && i != j) {
				return false;
			}
			j--;
		}
		return true;
	}
}
