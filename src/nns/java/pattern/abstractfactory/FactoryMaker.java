package nns.java.pattern.abstractfactory;

public class FactoryMaker {

	 public static FoodFactory makeFactory(String foodType) {
	      switch (foodType) {
	        case "INDIA":
	          return new IndianFoodFactory();
	        case "USA":
	          return new USFoodFactory();
	        default:
	          throw new IllegalArgumentException("CountryType not supported.");
	      }
	    }
}
