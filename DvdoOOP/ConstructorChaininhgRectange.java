package DvdoOOP;

public class ConstructorChaininhgRectange {
	private int x;
	private int y;
	private int width;
	private int height;
	//1st constructor
	public ConstructorChaininhgRectange() {
		this(0,0);//calls 2nd constructor
	}
	//2nd constructor
	public ConstructorChaininhgRectange(int width , int height) {
		this(0,0,width,height);//calls 3rd constructor
	}
	//3rd constructor
	public ConstructorChaininhgRectange(int x, int y, int width, int height) {
		//initialisation of variable
		this.x = 0;
		this.y = 0;
		this.width = width;
		this.height = height;
		
	}
	public static void main(String[] args) {
		
	}

}
