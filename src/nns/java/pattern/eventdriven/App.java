package nns.java.pattern.eventdriven;

import nns.java.pattern.eventdriven.event.UserCreatedEvent;
import nns.java.pattern.eventdriven.event.UserUpdatedEvent;
import nns.java.pattern.eventdriven.framework.EventDispatcher;
import nns.java.pattern.eventdriven.handler.UserCreateEventHandler;
import nns.java.pattern.eventdriven.handler.UserUpdateEventHandler;
import nns.java.pattern.eventdriven.model.User;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EventDispatcher dispatcher = new EventDispatcher();
		dispatcher.registerHandler(UserCreatedEvent.class, new UserCreateEventHandler());
		dispatcher.registerHandler(UserUpdatedEvent.class, new UserUpdateEventHandler());

		User user = new User("iluwatar");
		dispatcher.dispatch(new UserCreatedEvent(user));
		dispatcher.dispatch(new UserUpdatedEvent(user));
	}

}
