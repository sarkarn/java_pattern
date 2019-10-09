package nns.java.pattern.state;

public class AngryState implements State {

	  private Mammoth mammoth;

	  public AngryState(Mammoth mammoth) {
	    this.mammoth = mammoth;
	  }

	  @Override
	  public void observe() {
		  System.out.println(String.format("%1$S is furious!", mammoth));
	  }

	  @Override
	  public void onEnterState() {
		  System.out.println(String.format("%1$S gets angry!", mammoth));
	  }

	}