/**
 * 
 */
package cs.edu.starter.starter2.printer;

import cs.edu.starter.starter2.exception.PrintJobException;

/**
 * @author c. schluessel
 *
 */
public interface IPrintJob {
	public String print(String data, String format) throws PrintJobException;
}
