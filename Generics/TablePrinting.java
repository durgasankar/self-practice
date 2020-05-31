package Generics;

public class TablePrinting {
	private long number;

	public TablePrinting(long number) {
		this.number = number;
	}
	public void table() {
		for(int i=1; i <= 10; i++) {
			System.out.println(this.number+" * "+i+" = "+(i*this.number));
		}
	}

}
