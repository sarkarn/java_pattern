package nns.java.pattern.eventdriven.event;

import nns.java.pattern.eventdriven.model.User;

public class UserUpdatedEvent extends AbstractEvent {

	private User user;

	public UserUpdatedEvent(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

}
