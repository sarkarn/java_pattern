package nns.java.pattern.callback;

public abstract class Task {
	
	public void executeWithCallback(Callback callback) {
		if(callback !=null) {
			callback.call();
		}
		
		execute();
	}
	
	
	public abstract  void execute();

}
