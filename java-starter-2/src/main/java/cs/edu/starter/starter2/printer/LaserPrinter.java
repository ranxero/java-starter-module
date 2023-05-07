/**
 * 
 */
package cs.edu.starter.starter2.printer;

import cs.edu.starter.starter2.exception.PrintFormatException;
import cs.edu.starter.starter2.exception.PrintJobException;

/**
 * @author c. schluessel
 *
 */
public class LaserPrinter extends AbstractPrinter implements IPrintJob {

	/**
	 * @throws PrintFormatException 
	 * 
	 */
	public LaserPrinter(String name, String format) throws PrintFormatException {
		super(name, format);
	}

	@Override
	public String print(String data, String format) throws PrintJobException {
		return getName() + " " + getFormat() + " ... printing " + data;
	}

}
