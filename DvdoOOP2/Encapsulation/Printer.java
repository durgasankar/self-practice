package DvdoOOP2.Encapsulation;

public class Printer {
	
	private int inkLevel;
	private int pagesPrinted;
	private boolean dualSidePrinter;
	
	public Printer(int inkLevel, boolean dualSidePrinter) {
		if(inkLevel >=0 && inkLevel <100) {
			this.inkLevel = inkLevel;
		}else {
			this.inkLevel = -1;
		}
		this.dualSidePrinter = dualSidePrinter;
		this.pagesPrinted = 0;
	}
	
	public int addInk(int inkAmount) {
		if(inkAmount > 0 && inkAmount <= 100) {
			if(this.inkLevel + inkAmount < 100) {
				return -1;
			}else
				return this.inkLevel += inkAmount;
		}else
			return -1;	
	}	
	
	public int pagesPrinted(int pages) {
		int pagesToPrint = pages;
		if(dualSidePrinter) {
			pagesToPrint = pagesToPrint / 2;
			System.out.println("printing in dual printer");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesPrinted;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}

}
