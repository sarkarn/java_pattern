package nns.java.pattern.abstractfactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryMaker.makeFactory("INDIA").createFruits();
		FactoryMaker.makeFactory("INDIA").createVegetables();
		
		FactoryMaker.makeFactory("USA").createFruits();
		FactoryMaker.makeFactory("USA").createVegetables();
		
	}

}
