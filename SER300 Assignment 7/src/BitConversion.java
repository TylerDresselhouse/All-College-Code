
public class BitConversion {
	
	int first, second;
	
	public BitConversion(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public int convertBits() {
		int number = first ^ second;
		int numOnes = 0;
		while (number != 0) {
			if ((number & 1) == 1)
				numOnes++;
			number = number >> 1;
		}
		return numOnes;
	}
}