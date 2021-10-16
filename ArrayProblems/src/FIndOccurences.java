import java.util.Arrays;

public class FIndOccurences {
	public String[] findOcurrences(String text, String first, String second) {
		String[] s = text.split("\\s");
		int j = 0;
		for (int i = 0; i < s.length - 2; i++) {
			if (s[i].equals(first) && s[i + 1].equals(second)) {
				s[j] = s[i + 2];
				j++;
			}
		}
		return Arrays.copyOfRange(s, 0, j);
	}
}
