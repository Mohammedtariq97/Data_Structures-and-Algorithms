package ds.stack;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();
		
		System.out.println(reverseString(str));
}

public static String reverseString(String str) {
	
	stack thestack = new stack(str.length());
	
	for(int i=0; i<str.length(); i++) {		
		char ch = str.charAt(i);		
		thestack.push(ch);		
	}
	String result = "";
	while(!thestack.isEmpty()) {
		char ch = thestack.pop();
		result = result + ch;		
	}	
	return result;
}

}