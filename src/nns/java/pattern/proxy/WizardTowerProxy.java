package nns.java.pattern.proxy;

public class WizardTowerProxy implements WizardTower {

	private static final int NUM_WIZARDS_ALLOWED = 3;

	private int numWizards;
	public final WizardTower tower;

	public WizardTowerProxy(WizardTower tower) {
		this.tower = tower;
	}

	@Override
	public void enter(Wizard wizard) {

		if (numWizards < NUM_WIZARDS_ALLOWED) {
			tower.enter(wizard);
			numWizards++;
		} else {
			System.out.println(String.format("%1$S is not allowed to enter!", wizard));
		} // TODO Auto-generated method stub

	}

}
