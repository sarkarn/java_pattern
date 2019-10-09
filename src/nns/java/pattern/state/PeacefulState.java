package nns.java.pattern.state;

public class PeacefulState implements State {

	  private Mammoth mammoth;

	  public PeacefulState(Mammoth mammoth) {
	    this.mammoth = mammoth;
	  }

	  @Override
	  public void observe() {
	    System.out.println(String.format("%1$S is calm and peaceful.", mammoth));
	  }

	  @Override
	  public void onEnterState() {
		  System.out.println(String.format("%1$S calms down.", mammoth));
	  }

	}
