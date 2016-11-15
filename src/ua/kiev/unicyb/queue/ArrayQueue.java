package ua.kiev.unicyb.queue;

import ua.kiev.unicyb.exception.EmptyQueueException;
import ua.kiev.unicyb.exception.QueueFullException;

public class ArrayQueue<T> implements Queue<T> {
	private int countElem;

	private int head;

	private int tail;

	private Object[] masElem;

	private int size;

	public ArrayQueue() {
		masElem = new Object[DEFAULT_SIZE];
		this.size = DEFAULT_SIZE;
	}

	public ArrayQueue(int size) {
		masElem = new Object[size];
		this.size = size;
	}

	@Override
	public T pop() throws EmptyQueueException {
		if (countElem == 0) {
			throw new EmptyQueueException();
		} else {
			countElem--;
			T pt1 = (T) masElem[tail++];
			masElem[tail - 1] = null;
			if (tail == size - 1) {
				tail = 0;
			}
			return pt1;
		}
	}

	@Override
	public void push(T elem) throws QueueFullException {
		if (countElem == size) {
			throw new QueueFullException();
		} else {
			if (head == size - 1) {
				head %= size - 1;
			}
			masElem[head++] = elem;
			countElem++;
		}
	}

	@Override
	public boolean isEmpty() {
		return countElem <= 0;
	}

	public int getCountElem() {
		return countElem;
	}

	public void setCountElem(int countElem) {
		this.countElem = countElem;
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public Object[] getMasElem() {
		return masElem;
	}

	public void setMasElem(Object[] masElem) {
		this.masElem = masElem;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
