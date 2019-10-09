package nns.java.pattern.builder;

public class House {
	
	private final Basement basement;
	private final BedRoom bedroom;
	private final DiningRoom diningroom;
	private final Kitchen kitchen;
	private final Toilet toilet;
	
	public House(Builder build ) {
		this.basement = build.basement;
		this.bedroom = build.bedroom;
		this.diningroom = build.diningroom;
		this.kitchen = build.kitchen;
		this.toilet = build.toilet;
		
	}

	public Basement getBasement() {
		return basement;
	}

	public BedRoom getBedroom() {
		return bedroom;
	}

	public DiningRoom getDiningroom() {
		return diningroom;
	}

	public Kitchen getKitchen() {
		return kitchen;
	}

	public Toilet getToilet() {
		return toilet;
	}

	@Override
	public String toString() {
		return "House [basement=" + basement + ", bedroom=" + bedroom + ", diningroom=" + diningroom + ", kitchen="
				+ kitchen + ", toilet=" + toilet + "]";
	}
	
	
	public static class Builder {
		
		private Basement basement;
		private BedRoom bedroom;
		private DiningRoom diningroom;
		private Kitchen kitchen;
		private Toilet toilet;
		
		
		public Builder withBasement(Basement basement) {
			this.basement = basement;
			return this;
		}
		
		public Builder withBedRoom(BedRoom bedroom) {
			this.bedroom = bedroom;
			return this;
		}
		
		public Builder withDiningRoom(DiningRoom diningroom) {
			this.diningroom = diningroom;
			return this;
		}
		
		public Builder withKitchen(Kitchen kitchen) {
			this.kitchen = kitchen;
			return this;
		}
		
		public Builder withToilet(Toilet toilet) {
			this.toilet = toilet;
			return this;
		}
		
		
		public House build() {
			return new House(this);
		}
		
	}

}
