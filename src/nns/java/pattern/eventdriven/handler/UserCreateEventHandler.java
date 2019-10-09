package nns.java.pattern.eventdriven.handler;

import nns.java.pattern.eventdriven.event.UserCreatedEvent;
import nns.java.pattern.eventdriven.framework.Handler;

public class UserCreateEventHandler implements Handler<UserCreatedEvent> {

	@Override
	public void onEvent(UserCreatedEvent event) {
		System.out.println(String.format("User '{}' has been Created!", event.getUser().getUsername()));
	}
}
