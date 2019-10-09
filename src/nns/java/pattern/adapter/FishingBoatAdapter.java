package nns.java.pattern.adapter;

public class FishingBoatAdapter implements RowingBoat{

	private FishingBoatC aa = null; 
	
	public FishingBoatAdapter(FishingBoatC aa) {
		this.aa = aa;
	}
	
	@Override
	public void row() {
		aa.sail();
		
	}

}
