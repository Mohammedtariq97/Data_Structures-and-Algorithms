
public class isSumEqual {
	public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

		if ((convertingChar(firstWord) + convertingChar(secondWord)) == convertingChar(targetWord)) {
			return true;
		} else {
			return false;
		}
	}

	public int convertingChar(String s) {
		String val = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				val = val + 0;
			} else if (s.charAt(i) == 'b') {
				val = val + 1;
			} else if (s.charAt(i) == 'c') {
				val = val + 2;
			} else if (s.charAt(i) == 'd') {
				val = val + 3;
			} else if (s.charAt(i) == 'e') {
				val = val + 4;
			} else if (s.charAt(i) == 'f') {
				val = val + 5;
			} else if (s.charAt(i) == 'g') {
				val = val + 6;
			} else if (s.charAt(i) == 'h') {
				val = val + 7;
			} else if (s.charAt(i) == 'i') {
				val = val + 8;
			} else if (s.charAt(i) == 'j') {
				val = val + 9;
			}
		}
		return Integer.parseInt(val);
	}
}
