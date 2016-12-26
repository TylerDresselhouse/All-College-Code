
public class BitAccess {
	
	int i, j;
	
	public BitAccess(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public int getBit() {
		return (i >> j) & 1;
		
	}
}
