package nns.java.pattern.abstractfactory;

public class USFoodFactory  implements  FoodFactory {

	@Override
	public Fruits createFruits() {
		// TODO Auto-generated method stub
		return new USAApple();
	}

	@Override
	public Vegetable createVegetables() {
		// TODO Auto-generated method stub
		return new USASpinach();
	}
	
	

}
