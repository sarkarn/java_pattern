package nns.java.pattern.eventdriven.handler;

import nns.java.pattern.eventdriven.event.UserUpdatedEvent;
import nns.java.pattern.eventdriven.framework.Handler;


public class UserUpdateEventHandler implements Handler<UserUpdatedEvent> {

	@Override
	public void onEvent(UserUpdatedEvent event) {
		System.out.println(String.format("User '{}' has been Updated!", event.getUser().getUsername()));
	}

}
