/**
 * 
 */
package cs.edu.starter.starter2;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cs.edu.starter.starter2.exception.PrintFormatException;
import cs.edu.starter.starter2.exception.PrintJobException;
import cs.edu.starter.starter2.printer.AbstractPrinter;
import cs.edu.starter.starter2.printer.IPrintJob;
import cs.edu.starter.starter2.printer.InkPrinter;
import cs.edu.starter.starter2.printer.LaserPrinter;
import cs.edu.starter.starter2.printer.PDFPrinter;

/**
 * @author c. schluessel
 *
 */
public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);
	private static List<IPrintJob> printerList = new ArrayList<>(); 
	
	/**
	 * @param args
	 * @throws PrintFormatException 
	 */
	public static void main(String[] args) throws PrintFormatException {
		printerList.add(new InkPrinter("Ink Printer", AbstractPrinter.FORMAT_LANDSCAPE));
		printerList.add(new LaserPrinter("Laser Printer", AbstractPrinter.FORMAT_PORTRAIT));
		printerList.add(new PDFPrinter("PDF Printer", AbstractPrinter.FORMAT_LANDSCAPE));
		printerList.forEach(p -> {
			try {
				String result = p.print("Something to print", "RGB");
				logger.info(result);
			} catch (PrintJobException e) {
				logger.error(((AbstractPrinter)p).getName() + " " + ((AbstractPrinter)p).getFormat() + " " + e.getMessage()); 
			}
		});
	}

}
