
public class BasicControlStructures {

	public static void main(String[] args) {
		final int NUMBER_OF_ROWS = 8;

		//looping through the lines
		for (int i = 1; i <= NUMBER_OF_ROWS; i++) {

			// each line has a number of "blanks" before the numbers
			for (int t = NUMBER_OF_ROWS - i; t > 0; t--) {
				System.out.printf("%4s", ' ');
			}

			// left side of the pyramid (ascending)
			for (int p=0; p < i; p++) {
				//we need p=0 to print 1
				System.out.printf("%4s",(int) Math.pow(2, p));
			}
			
			// right side of the pyramid (descending)
			for (int p=i-2; p >=0; p--) {
				System.out.printf("%4s",(int) Math.pow(2, p));
			}
			
			//feed line
			System.out.println();
		}
	}
}