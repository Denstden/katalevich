package ua.kiev.unicyb.queue;

import ua.kiev.unicyb.exception.EmptyQueueException;
import ua.kiev.unicyb.exception.QueueFullException;

/**
 * @Author Denys Storozhenko.
 */
public class ListQueue<T> implements Queue<T> {

	private ListNode<T> head;

	private int countElem;

	public ListQueue() {

	}

	@Override
	public T pop() throws EmptyQueueException {
		return null;
	}

	@Override
	public void push(T elem) throws QueueFullException {

	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	private static class ListNode<T> {
		private T value;
		private ListNode<T> next;

		public ListNode() {
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public ListNode<T> getNext() {
			return next;
		}

		public void setNext(ListNode<T> next) {
			this.next = next;
		}
	}
}
