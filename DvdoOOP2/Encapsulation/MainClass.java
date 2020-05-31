package DvdoOOP2.Encapsulation;

public class MainClass {
	
	public static void main(String[] args) {
		Printer printer = new Printer(20,true);
		System.out.println("Initial page Count : "+printer.getPagesPrinted());
		int pagesPrinted = printer.pagesPrinted(6);
		System.out.println("Pages printed was : "+pagesPrinted+" new total count for Printer : "+printer.getPagesPrinted());
		pagesPrinted = printer.pagesPrinted(4);
		System.out.println("Pages printed was : "+pagesPrinted+" new total count for Printer : "+printer.getPagesPrinted());;
		
		
		
	}

}
