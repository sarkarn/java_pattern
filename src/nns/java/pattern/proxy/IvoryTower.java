package nns.java.pattern.proxy;

public class IvoryTower implements WizardTower {

	@Override
	public void enter(Wizard wizard) {
		System.out.println(String.format("%1$S enters the tower.", wizard));
	}
}
