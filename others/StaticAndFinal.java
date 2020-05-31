package others;

public class StaticAndFinal {
	public static void main(String[] args) {
		
		Thing.description="i am a thing";
		System.out.println(Thing.description);
		
		Thing.ShowInfo();// calling of a static method directly by classname.methodname 
		
		System.out.println("before creating object : "+Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("after creating object : "+Thing.count);
		
		thing1.name="raja";
		thing2.name="bob";
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		thing1.ShowName();
		thing2.ShowName();
		System.out.println(Math.PI);//constant data 
		
		System.out.println("your constant is : "+Thing.LUCKY_NUMBER);
	}

}
class Thing{
	public static int LUCKY_NUMBER=7;//make our own constant
	public String name;
	public static String description;//static variables are class variables associated with class
	public static int count=0;
	
	public int id;//instance variable real time example
	public Thing()//constructor
	{
		id=count;
		count++;
	}
	public void ShowName()//non static method
	{
		System.out.println("object id is : "+id+" , "+description+" : "+name);
	}
	public static void ShowInfo()//static method 
	{
		System.out.println("Hallo");
		//we can call static variables but we cannot call not static variables
	}
}