/**
 * 
 */
package cs.edu.starter.starter2.printer;

import cs.edu.starter.starter2.exception.PrintFormatException;

/**
 * @author c. schluessel
 *
 */
public abstract class AbstractPrinter {
	
	public static final String FORMAT_LANDSCAPE = "FORMAT_LANDSCAPE";
	public static final String FORMAT_PORTRAIT = "FORMAT_PORTRAIT";
	
	protected String name;
	protected String format;
	
	protected AbstractPrinter(String name, String format) throws PrintFormatException {
		this.name = name;
		setFormat(format);
	}
	
	public boolean setFormat(String format) throws PrintFormatException {
		if (checkPrintFormat(format)) {
			this.format = format;
		}
		return false;
	}
	
	public boolean checkPrintFormat(String format) throws PrintFormatException {
		if (format==null || 
				(!format.equals(FORMAT_LANDSCAPE) && !format.equals(FORMAT_PORTRAIT))) {
			throw new PrintFormatException("Invalid print format: " + format);
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public String getFormat() {
		return format;
	}

}
