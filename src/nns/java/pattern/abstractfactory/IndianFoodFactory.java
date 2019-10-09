package nns.java.pattern.abstractfactory;

public class IndianFoodFactory implements FoodFactory{

	@Override
	public Fruits createFruits() {
		// TODO Auto-generated method stub
		return new IndianMango();
	}

	@Override
	public Vegetable createVegetables() {
		// TODO Auto-generated method stub
		return new IndianSpinach();
	}
}
