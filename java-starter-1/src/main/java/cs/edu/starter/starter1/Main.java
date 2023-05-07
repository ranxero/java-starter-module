/**
 * 
 */
package cs.edu.starter.starter1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cs.edu.starter.starter1.exception.BitsAreNullException;

/**
 * @author c. schluessel
 *
 */
public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);

	/**
	 * @param args
	 * @throws BitsAreNullException 
	 */
	public static void main(String[] args) throws BitsAreNullException {
		logger.info("Hellow World ... initializing Delegate ...");
		logger.debug(new Delegate().converstBitsToDecimal(new int[] {0, 1, 0, 0, 1, 1, 0, 1}));
		
		logger.trace("trace logging");
		logger.warn("warn logging");
		logger.error("error logging");
		logger.fatal("fatal logging");
	}

}
