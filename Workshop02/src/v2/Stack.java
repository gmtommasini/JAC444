package v2;

public class Stack {
	char arr[];
	int top = 0;

	// PUBLIC METHODS
	public void push(char c) {
		if (this.isFull()) { // if arr is full
			// resizing if arr is full //not going to be used in this workshop
			char temp[] = new char[arr.length + 1];
			int i = 0;
			while (i < arr.length) {
				temp[i] = arr[i];
				i++;
			}
			arr = temp; // moving
		}

		// adding new char at the end
		arr[top++] = c;
	}

	public char pop() {
		char c = '\0';
		if (!(this.isEmpty())) {
			c = arr[--top];// saving last char for return
			arr[top] = '\0';
		}
		// System.out.println(c); //for debugging
		return c;
	}

	// PRIVATE METHODS
	private boolean isFull() {
		if (top == arr.length) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isEmpty() {
		if (top == 0) {
			return true;
		} else {
			return false;
		}
	}

	// CONSTRUCTORS
	public Stack(int size) {
		arr = new char[size];
	}

	/*
	 * public Stack() { arr = new char[1]; } public Stack(char c) { arr = new
	 * char[1]; arr[0] = c; }
	 */
	// NOT allowed in this exercise
	/*
	 * public Stack(String word) { for (int i = 0; i < word.length(); i++) {
	 * this.push( word.charAt(i) ); } } public String toString() { return new
	 * String(arr); }
	 */
}
