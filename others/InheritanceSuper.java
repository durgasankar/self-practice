package others;

public class InheritanceSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("to access super class method by using super key word");
		Two two = new Two();
		two.show();
		System.out.println("\n\n");
		
		System.out.println("default constructor of super class is available to sub class by default");
		Four four = new Four();
		System.out.println("\n\n");
		
		System.out.println("constructor of super class can be called from sub class using super()");
		Six six = new Six(10,20,30);
		six.show();
		System.out.println("\n\n");
		
		Eight eight = new Eight();
		eight.get();
		
	}

}

//to access super class method by using super key word
class One
{
	int i=10;//super class instance variable
	
	//super class method 
	void show()
	{
		System.out.println("super class method i: "+i);
	}
	
}

class Two extends One
{
	int i=20;//sub class variable
	
	//sub class method
	void show()
	{
		System.out.println("sub class method i: "+i);
		super.show();
	}
}




//default constructor of super class is available to sub class by default
class Three
{
	Three()//super class default constructor
	{
		System.out.println("Three");
	}
}

class Four extends Three
{
	Four()//sub class constructor
	{
		System.out.println("Four");
	}
}


//constructor of super class can be called from sub class using super()
class Five
{
	int i;//super class variable
	int j;
	Five(int i,int j)//super class constructor
	{
		this.i=i;
		this.j=j;
	}
}

class Six extends Five
{
	int i;
	Six(int a,int b, int d)//sub class constructor
	{
		super(a,b);
		i=d;
		
	}
	
	void show()
	{
		System.out.println("sub class i = "+i);
		System.out.println("super class i = "+super.i);
		System.out.println("super class j = "+super.j);
	}
}


//private members are not accessible in subclass but protected members are accessible in sub class
class Seven 
{
	private int a;
	protected int b;
}

class Eight extends Seven
{
	public void get()
	{
		System.out.println("Protected value of b : "+b);
		System.out.println("private will throw a error that 'fileld is not visible in inheritance");
	}
}