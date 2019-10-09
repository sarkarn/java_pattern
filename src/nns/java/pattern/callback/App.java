package nns.java.pattern.callback;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task task = new SimpleTask();
		
		Callback callback = () -> System.out.println("I am done now");
		
		task.executeWithCallback(callback);

	}

}
