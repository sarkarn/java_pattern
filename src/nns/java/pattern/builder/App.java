package nns.java.pattern.builder;

public class App {
	
	public static void main(String args[]) {
		House house = new House.Builder().withBasement(new Basement()).withBedRoom(new BedRoom()).build();
	}

}
