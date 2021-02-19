
public class Palindrome {

	public static void main(String[] args) {
		// creating the Stack with correct length
		int size = 0;
		for (String parameter : args) {
			System.out.print(parameter + ' ');
			size += parameter.length();
		}
		System.out.print("IS");
		Stack word = new Stack(size);

		for (String parameter : args) {
			// pushing into the Stack
			for (int i = 0; i < parameter.length(); i++) {
				if (Character.isLetter(parameter.charAt(i))) { //push just letters
					word.push(Character.toLowerCase(parameter.charAt(i)));
				}
			}
		}
		// if I want to see the content of the Stack
		// System.out.println(word.toString()); //requires toString method

		// Verifiyng if palindrome
		pali: for (String parameter : args) {
			for (int i = 0; i < parameter.length(); i++) {
				// compare backwards (pop) with the forward (i)
				if (Character.isLetter(parameter.charAt(i)) //comparing just letters
						&& word.pop() != Character.toLowerCase(parameter.charAt(i))) {
					// NOT PALINDROME!!
					System.out.print(" NOT");
					break pali;// exit loop
				}
			}
		}
		System.out.println(" palindrome!");
	}
}
