package nns.java.pattern.abstractfactory.bridge;

public abstract class Shape {
	
	Color color = null;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	
	public abstract void applyColor();

}
