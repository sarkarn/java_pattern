package nns.java.pattern.visitor;

public abstract class Unit {

	 private Unit[] children;

	  public Unit(Unit... children) {
	    this.children = children;
	  }

	  /**
	   * Accept visitor
	   */
	  public void accept(UnitVisitor visitor) {
	    for (Unit child : children) {
	      child.accept(visitor);
	    }
	  }
}
