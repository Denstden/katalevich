package ua.kiev.unicyb.exception;

/**
 * @Author Denys Storozhenko.
 */
public class EmptyQueueException extends Exception {
	public EmptyQueueException() {
		super("Queue is empty.");
	}
}
