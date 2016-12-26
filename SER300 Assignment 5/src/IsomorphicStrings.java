
public class IsomorphicStrings {

	String string1, string2;

	public IsomorphicStrings(String string1, String string2) {
		this.string1 = string1;
		this.string2 = string2;
	}

	public Boolean areIso() {

		String[][] array = new String[string1.length()][2];

		for (int i = 0; i < string1.length(); i++) { // for each character in
													// the first string
			String c = string1.substring(i, i+1);
			String c2 = string2.substring(i, i+1);
			
			boolean matched = false;
			
			for (int j = 0; j < array.length; j++) { // for each place in the array
				if (array[j][0] != null && array[j][0].equals(c)) {
					matched = true; // we found a match
					if (c2.equals(array[i][1])) {
						return false; // break the cycle and return false
					}
				}
			}
			
			if (!matched) { // if we did not find a match
				boolean flag = true;
				for (int k = 0; k < array.length; k++) { // for each spot in the array
					if (array[k][0] == null && flag == true) {
						array[k][0] = c;
						array[k][1] = c2;
						flag = false;
					}
				}
			}
		}
		return true;
	}
}
