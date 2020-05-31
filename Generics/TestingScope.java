package Generics;

public class TestingScope {
	private int pvtInt = 1;
	public int publicInt = 1;
	public TestingScope() {
		
	}
	public int getPvtInt() {
		return pvtInt;
	}
	
	public void twoTable() {
		int pvtInt = 2;
		for(int i = 1; i <= 10; i++) {
			System.out.println(pvtInt+" * "+i+" = "+(i*pvtInt));
		}
	}
	public class TestingScopeInnerClass {
		//int pvtInt = 3;
		public void twoTable() {
			//TestingScope.this.twoTable();
			for(int i = 1; i <= 10; i++) {
				System.out.println(pvtInt+" * "+i+" = "+(i*pvtInt));
			}
		}
	}
}
