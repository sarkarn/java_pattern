package nns.java.pattern.visitor;

public class CommanderVisitor implements UnitVisitor {

	

	  @Override
	  public void visitSoldier(Soldier soldier) {
	    // Do nothing
	  }

	  @Override
	  public void visitSergeant(Sergeant sergeant) {
	    // Do nothing
	  }

	  @Override
	  public void visitCommander(Commander commander) {
	    System.out.println(String.format("Good to see you %1$S", commander));
	  }
	}
