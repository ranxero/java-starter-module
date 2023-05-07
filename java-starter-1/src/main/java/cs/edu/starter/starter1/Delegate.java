/**
 * 
 */
package cs.edu.starter.starter1;

import cs.edu.starter.starter1.exception.BitsAreNullException;

/**
 * @author c. schluessel
 *
 */
public class Delegate {

	/**
	 * 
	 */
	public Delegate() {
	}

	public int converstBitsToDecimal(int[] bits) throws BitsAreNullException {
		if (bits==null) {
			throw new BitsAreNullException("Bits are null");
		}
		int res = 0;
		int cnt = bits.length-1;
		for (int i : bits) {
			res += (i==0) ? 0 : Math.pow(2, cnt);
			cnt--;
		}
		return res;
	}

}
