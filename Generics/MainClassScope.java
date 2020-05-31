package Generics;

public class MainClassScope {
	public static void main(String[] args) {
		
		TestingScope test = new TestingScope();
		System.out.println(test.publicInt);
		System.out.println(test.getPvtInt());
		test.twoTable();
		System.out.println("***********************");
		
		TestingScope.TestingScopeInnerClass innerClass = test.new TestingScopeInnerClass();
		//System.out.println(innerClass.pvtInt);
		innerClass.twoTable();
		
		
	}

}
