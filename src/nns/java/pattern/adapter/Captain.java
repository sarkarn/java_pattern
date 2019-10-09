package nns.java.pattern.adapter;

public class Captain {
	
	RowingBoat c = null;
	
	public Captain(RowingBoat c) {
		this.c = c;
	}
	
	public void row() {
		c.row();
	}

}
