package others;

public class StringToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frog frog1 = new Frog(1,"ramesh");
		Frog frog2 = new Frog(2,"Suresh");
		
		System.out.print(frog1+"\n"+frog2);

	}

}
class Frog
{
	private int id ;
	private String name;
	
	public Frog(int id ,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append(": ");
		sb.append(name);
		return toString();
	}
	
}