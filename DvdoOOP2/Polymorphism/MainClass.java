package DvdoOOP2.Polymorphism;

class Movie {
	private String name;
	
	public Movie(String Name) {
		this.name = name;
	}
	public String plot() {
		return "No Plot Here";
	}
	public String getName() {
		return name;
	}
}

class SherlockHolmes extends Movie{

	public SherlockHolmes() {
		super("SherlockHolmes");
	}
	public String story() {
		return "Detective Movie";
	}
}

class Dhammal extends Movie {

	public Dhammal() {
		super("Dhammal");
	}
	@Override
	public String plot() {
		return "Commedy Movie";
	}	
}

class Ghost extends Movie {

	public Ghost() {
		super("Ghost");
	}
	@Override
	public String plot() {
		return "Ghost Movie";
	}
}

class JohnWick extends Movie {

	public JohnWick() {
		super("John Wick");
	}
	@Override
	public String plot() {
		return "Action Movie";
	}
}

public class MainClass {
	public static void main(String[] args) {
		
		for(int i = 1; i<=10 ; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #"+i+
					" : "+movie.getName() +"\n"+
					"Plot: "+movie.plot() +"\n");
		}
		
		
	}
	public static Movie randomMovie() {
		int randomNumber = (int)(Math.random() * 4)+1;
		System.out.println("Random Number generated is :"+randomNumber);
		switch(randomNumber) {
		
		case 1 : 
			return new SherlockHolmes();
		case 2 :
			return new Dhammal();
		case 3 :
			return new Ghost();
		case 4 :
			return new JohnWick();
			
		}
		return null;
	}
}
