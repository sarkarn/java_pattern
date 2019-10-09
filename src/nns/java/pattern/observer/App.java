package nns.java.pattern.observer;

public class App {

	

	  /**
	   * Program entry point
	   * 
	   * @param args command line args
	   */
	  public static void main(String[] args) {

	    Weather weather = new Weather();
	    weather.addObserver(new Orcs());
	    weather.addObserver(new Hobbits());

	    weather.timePasses();
	    weather.timePasses();
	    weather.timePasses();
	    weather.timePasses();
	   
	  }
	}
