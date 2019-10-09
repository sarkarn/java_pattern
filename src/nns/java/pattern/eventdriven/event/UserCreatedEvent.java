package nns.java.pattern.eventdriven.event;

import nns.java.pattern.eventdriven.model.User;

public class UserCreatedEvent extends AbstractEvent{

	private User user;

	  public UserCreatedEvent(User user) {
	    this.user = user;
	  }

	  public User getUser() {
	    return user;
	  }
}
