package old;

public class Stack {
	char arr[];
	public void push(char c) {
		// creating temporary array
		char temp[] = new char[arr.length + 1];
		int i = 0;
		while (i < arr.length) {
			temp[i] = arr[i];
			i++;
		}
		// adding new char at the end
		temp[i] = c;

		// moving
		arr = temp;
	}

	public char pop() {
		char c;
		// creating temp array
		char temp[] = new char[arr.length - 1];
		int i = 0;
		while (i < arr.length - 1) {
			temp[i] = arr[i];
			i++;
		}
		// saving last char for return
		c = arr[i];

		// moving remaining array
		arr = temp;
		return c;
	}
	
	public Stack() {
		arr = new char[1];
	}
	public Stack(char c) {
		arr = new char[1];
		arr[0]=c;
	}
	
	//NOT allowed in this exercise
	/*public Stack(String word) {
		for (int i = 0; i < word.length(); i++) {
			this.push( word.charAt(i) );
		}
	}*/

}
