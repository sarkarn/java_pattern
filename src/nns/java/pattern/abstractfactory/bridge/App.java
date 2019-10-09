package nns.java.pattern.abstractfactory.bridge;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s = new Rectangle(new BlueColor());
		s.applyColor();
		
		s = new Rectangle(new RedColor());
		s.applyColor();
		
		
		s = new Circle(new BlueColor());
		s.applyColor();
		
		s = new Circle(new RedColor());
		s.applyColor();
	}

}
