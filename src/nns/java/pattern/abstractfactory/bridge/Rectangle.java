package nns.java.pattern.abstractfactory.bridge;

public class Rectangle extends Shape {

	
	public Rectangle(Color color) {
		// TODO Auto-generated constructor stub
		super(color);
		
	}
	
	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		color.applyColor();
	}

}
