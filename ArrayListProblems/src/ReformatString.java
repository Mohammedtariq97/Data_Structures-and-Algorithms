import java.util.Arrays;

public class ReformatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 5, 3, 1, 2 };
		System.out.println(reformat("covid2019"));
	}

	public static String reformat(String s) {

		StringBuilder digits = new StringBuilder();
		StringBuilder alphas = new StringBuilder();
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digits.append(ch);
			} else {
				alphas.append(ch);
			}
		}
		if (digits.length() == 0 || alphas.length() == 0) {
			return "";
		}

		Boolean isDigit = false;

		int len = Math.abs(digits.length() - alphas.length());
		int j = 0;
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			if (isDigit == true) {
				ans.append(digits.charAt(j));
				isDigit = false;
				j++;
			} else {
				ans.append(alphas.charAt(k));
				isDigit = true;
				k++;
			}
		}

		return ans.toString();
	}
}
