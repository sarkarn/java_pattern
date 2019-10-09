/**
 * 
 */
package nns.java.pattern.proxy;

/**
 * @author naren
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
	    proxy.enter(new Wizard("Red wizard"));
	    proxy.enter(new Wizard("White wizard"));
	    proxy.enter(new Wizard("Black wizard"));
	    proxy.enter(new Wizard("Green wizard"));
	    proxy.enter(new Wizard("Brown wizard"));

	}

}
