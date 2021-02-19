package old;

public class Palindrome {

	public static void main(String[] args) {

		for (String parameter : args) {
			boolean palindrome = true;
			System.out.print(parameter);
			Stack word = new Stack();

			// pushing into the Stack
			for (int i = 0; i < parameter.length(); i++) {
				word.push(parameter.charAt(i));
			}

			// Verifiyng if palindrome
			for (int i = 0; i < parameter.length() && palindrome; i++) {
				//compare backwards (pop) with the forward (i)
				if (word.pop() != parameter.charAt(i)) {
					// NOT PALINDROME!!
					palindrome = false; // exit loop
				}
			}
			if (palindrome) {
				System.out.println(" is palindrome!");
			} else {
				System.out.println(" is not palindrome!");
			}
		}

	}

}
