package nns.java.pattern.eventdriven.framework;

public interface Event {

	Class<? extends Event> getType();
}
