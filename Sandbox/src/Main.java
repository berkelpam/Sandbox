
public class Main {
	public static void main(String[] args)
	   {
	     // System.out.println("hello" +args[0]);
		
		Cat cat = new Cat("Garfield");
		System.out.println(cat.name()); // Output: Garfield
		
		Shape shape = new Circle();
		shape.draw(); // Output: I am a circle.
		shape = new Rectangle();
		shape.draw(); // Output: I am a rectangle.
	   }
}
