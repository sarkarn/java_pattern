package nns.java.pattern.state;

/**
 * Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
 * @author naren
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mammoth mammoth = new Mammoth();
	    mammoth.observe();
	    mammoth.timePasses();
	    mammoth.observe();
	    mammoth.timePasses();
	    mammoth.observe();

	}

}
