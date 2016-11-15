package ua.kiev.unicyb.queue;

import ua.kiev.unicyb.exception.EmptyQueueException;
import ua.kiev.unicyb.exception.QueueFullException;

/**
 * @Author Denys Storozhenko.
 */
public interface Queue<T> {
	int DEFAULT_SIZE = 500;

	T pop() throws EmptyQueueException;
	void push(T elem) throws QueueFullException;
	boolean isEmpty();
}
