/**
 * 
 */
package cs.edu.starter.starter1;

/**
 * @author c. schluessel
 *
 */
public class Delegate {

	/**
	 * 
	 */
	public Delegate() {
		// TODO Auto-generated constructor stub
	}

	public int converstBitsToDecimal(int[] bit) {
		int res = 0;
		int cnt = 0;
		for (int i : bit) {
			res += (i==0) ? 0 : Math.pow(2, cnt);
			cnt++;
		}
		return res;
	}

}
