package nns.java.pattern.visitor;

public interface UnitVisitor {

	void visitSoldier(Soldier soldier);

	void visitSergeant(Sergeant sergeant);

	void visitCommander(Commander commander);

}
