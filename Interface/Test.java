package Interface;

public class Test {
	public static void main(String[] args) {
		Drawable draw = new Rectangle();
		draw.draw();
		draw = new Circle();
		draw.draw();
		
	}

}
class Rectangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}
class Circle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		
	}
	
}