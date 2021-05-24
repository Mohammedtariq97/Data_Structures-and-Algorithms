import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatchingArray {

	public static void main(String[] args) {
		String[] words = new String[]{"mass","as","hero","superhero"};
		
		System.out.println(stringMatching(words).toString());

	}

	private static List<String> stringMatching(String[] words) {
		int arrayLength = words.length;
        Arrays.sort(words);
        ArrayList result = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            int start = i + 1;
            while (start < words.length) {
                if (words[start].contains(str)) {
                    result.add(str);
                    break;
                }
                start++;
            }
        }
        return result;
	}

}
