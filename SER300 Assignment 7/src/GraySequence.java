import java.util.Arrays;

public class GraySequence {
	int[] original;
	int n;

	//constructor
	public GraySequence(int number) {
		original = new int[1 << number];
		this.n = number;
	}

	public int[] getGraySequence() {
		if (n != 0) { //check for size 0
			original[0] = 0;
			original[1] = 1;

			for (int current = 1; current < n; current++) {
				
				//copy array
				int[] start = new int[1 << current];
				for (int j = 0; j < start.length; j++) {
					start[j] = original[j];
				}

				//get reverse of copied array
				int[] reverse = new int[start.length];
				for (int j = 0; j < start.length; j++) {
					reverse[j] = start[start.length - 1 - j];
				}

				//combine copied amd reverse arrays
				int[] combined = Arrays.copyOf(start, start.length + reverse.length);
				System.arraycopy(reverse, 0, combined, start.length, reverse.length);

				//prep for next iteration
				int[] next = new int[combined.length];
				int mask = 1 << current;
				for (int j = 0; j < next.length; j++) {
					if (j < next.length / 2) {
						next[j] = combined[j];
					} else {
						next[j] = combined[j] | mask;
					}
				}

				//finalize sequence
				for (int j = 0; j < next.length; j++) {
					original[j] = next[j];
				}
			}
		} else {
			original = new int[] { 0 };
		}
		return original;
	}
}
