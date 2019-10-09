package nns.java.pattern.adapter;

public class App {
	
	public static void main(String args[]) {
		Captain c = new Captain(new FishingBoatAdapter(new FishingBoatC()));
		c.row();
		
		Captain c1 = new Captain( () -> System.out.println("Sailing RowingBoat"));
		c1.row();
		
	}

}
