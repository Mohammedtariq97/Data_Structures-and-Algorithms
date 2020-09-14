package ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class stack_problem1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Stack thestack = new Stack();

		for (int i = 0; i < N; i++) {

			int number = scan.nextInt();

			if (number == 1) {
				thestack.push(scan.nextInt());

			} else if (number == 2) {
				if(!thestack.isEmpty()) {
				thestack.pop();}

			} else if (number == 3) {
				int b = (int) thestack.peek();
				System.out.println(b);
			}
			

		}
	}

	}


