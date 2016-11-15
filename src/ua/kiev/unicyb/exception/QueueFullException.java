package ua.kiev.unicyb.exception;

/**
 * @Author Denys Storozhenko.
 */
public class QueueFullException extends Exception {
	public QueueFullException() {
		super("Queue full");
	}
}
